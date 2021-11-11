/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.libreria.servicios;

import com.mza.libreria.entidades.*;
import com.mza.libreria.excepciones.MiExcepcion;
import com.mza.libreria.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.Optional;
import javax.transaction.Transactional;

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

        //valido los atributos que son objetos de otra clase
//        if (libro.getAutor().toString().isEmpty() || libro.getAutor() == null)
//        {
//            throw new MiExcepcion("Autor no valido");
//        } else
//        {
//            libro.setAutor(sAutor.buscaPorId(libro.getAutor().getId()));
//        }

//        if (libro.getEditorial().toString().isEmpty() || libro.getEditorial() == null)
//        {
//            throw new MiExcepcion("Editorial no valida");
//        } else
//        {
//            libro.setEditorial(sEditorial.buscaPorId(libro.getEditorial()));
//        }

        return rLibro.save(libro);
    }

//    @Transactional
//    public void creaLibro( String isbn,
//                           String titulo,
//                           Integer anio,
//                           Integer ejemplares,
//                           Autor autor,
//                           Editorial editorial) throws Exception{
//        
//        Libro lib1 = new Libro();
//        
//        //Autor autor = sAutor.buscaPorId(autorID);
//        //Editorial editorial = sEditorial.buscaPorNombre(nEditorial);
//        
//        validar(titulo,isbn,anio,ejemplares);
//        
//        lib1.setAlta(Boolean.TRUE);
//        lib1.setAnio(anio);
//        lib1.setEjemplares(ejemplares);
//        lib1.setIsbn(isbn);
//        lib1.setTitulo(titulo);
//        
//        lib1.setAutor(autor);
//        
//        lib1.setEditorial(editorial);
//        
////        sAutor.agregaLibro(lib1, autor);
////        editorial.getLibros().add(lib1);
//        
//        rLibro.save(lib1);
//                
//    }
    
    public Optional<Libro> buscarPorId(String id) {
    return rLibro.findById(id);
  }
    
    public void validar(String titulo, String isbn,
            Integer anio, Integer ejemplares) throws MiExcepcion {

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
