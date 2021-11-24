/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.servicios;

import com.mza.biblioteca.repositorios.RepoLibro;
import com.mza.biblioteca.entidades.Libro;
import com.mza.biblioteca.excepciones.MiExcepcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Adrian E. Camus
 */
@Service
public class LibroService {

    @Autowired
    private RepoLibro rLibro;

    @Autowired
    private AutorService sAutor;

    @Autowired
    private EditorialService sEditorial;

    @Transactional
    public Libro creaLibro(Libro libro) throws MiExcepcion {
        //valido todos los datos que no son objetos
        validar(libro.getTitulo(), libro.getIsbn(), libro.getAnio(), libro.getEjemplares());

        //valido los atributos que son objetos de otra clase en este metodo
        //para en caso de ser necesario usar tambien la busqueda por ID y asignar el objeto
        if (libro.getAutor().toString().isEmpty() || libro.getAutor() == null)
        {
            throw new MiExcepcion("Autor no puede ser nulo");
        } else
        {
            libro.setAutor(sAutor.buscaPorId(libro.getAutor().getId()));
        }

        if (libro.getEditorial().toString().isEmpty() || libro.getEditorial() == null)
        {
            throw new MiExcepcion("Editorial no valida");
        } else
        {
            libro.setEditorial(sEditorial.buscaPorId(libro.getEditorial()));
        }
        libro.setAlta(Boolean.TRUE);
        return rLibro.save(libro);
    }

    @Transactional(readOnly = true)
    public Optional<Libro> buscarPorId(String id) {
        return rLibro.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Libro> listaLibro() {
        return rLibro.findAll();
    }

    @Transactional(readOnly = true)
    public List<Libro> listaBuscada(String buscar) {
        return rLibro.buscaTodo(buscar);
    }

    @Transactional
    public void bajaLibro(Libro libro) throws MiExcepcion {

        Optional<Libro> op = rLibro.findById(libro.getId());
        if (op.isPresent())
        {
            Libro aux = op.get();
            aux.setAlta(Boolean.FALSE);
            rLibro.save(aux);
        }

    }
    
    @Transactional
    public void altaLibro(Libro libro) throws MiExcepcion {

        Optional<Libro> op = rLibro.findById(libro.getId());
        if (op.isPresent())
        {
            Libro aux = op.get();
            aux.setAlta(Boolean.TRUE);
            rLibro.save(aux);
        }

    }
    
    public void validar(String titulo, String isbn,
            Integer anio, Integer ejemplares) throws MiExcepcion {

        //uso Optional para validar que no exista repetido un ISBN
        Optional<Libro> op = rLibro.validaISBN(isbn);
        if (op.isPresent())
        {
            throw new MiExcepcion("El ISBN indicado, ya se encuentra registrado");
        }
        if (titulo.isEmpty() || titulo == null)
        {
            throw new MiExcepcion("Titulo no valido");
        }
        if (isbn.isEmpty() || isbn == null || isbn.length() < 10)
        {
            throw new MiExcepcion("ISBN no valido");
        }
        if (anio.toString().length() != 4 || anio < Calendar.YEAR)
        {
            throw new MiExcepcion("Error en el AÑO");
        }
        if (ejemplares == 0 || ejemplares < 1)
        {
            throw new MiExcepcion("Error en los Ejemplares");
        }
    }
}
