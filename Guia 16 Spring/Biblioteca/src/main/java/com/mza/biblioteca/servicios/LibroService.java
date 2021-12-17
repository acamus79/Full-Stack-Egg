/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.servicios;

import com.mza.biblioteca.entidades.Libro;
import com.mza.biblioteca.entidades.Portada;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.repositorios.RepoLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

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

    @Autowired
    private PortadaService sPortada;

    @Transactional
    public void creaLibro(MultipartFile archivo, Libro libro) throws MiExcepcion {
        //valido el modelo de Libro recibido y lo devuelvo ya como un objeto Libro mediante el método validar
        Libro aPersistir = validar(libro);

        //Le asigno a los ejemplares restantes la misma cantidad de registrados y prestados a cero
        aPersistir.setEjemplaresRestantes(aPersistir.getEjemplares());
        aPersistir.setEjemplaresPrestados(0);

        //Creo un objeto portada y lo instancio con lo que me devuelve el método guardar del ServicioPortada
        Portada portada = sPortada.guardar(archivo);

        //Le seteo al libro la portada
        aPersistir.setPortada(portada);

        //Guardo el Libro en la base de datos mediante el metodo heredado de RepoLibro
        rLibro.save(aPersistir);
    }

    @Transactional
    public void editaLibro(MultipartFile archivo, Libro editado) throws MiExcepcion {

        try
        {
            //Remuevo espacios al principio y al final del título
            editado.setTitulo(editado.getTitulo().trim());

            //Valido los cambios entre los dos libros, el que viene por parametro y el que ya esta en la base
            Libro persistido = validarCambios(editado, buscarPorId(editado.getId()));
            //Si el Libro en la BD no tiene portada le seteeo al Libro Persistido una nueva portada con el archivo
            if (archivo != null && !archivo.isEmpty())
            {
                persistido.setPortada(sPortada.guardar(archivo));
            }
            //Persistimos el libro en la base de datos
            rLibro.save(persistido);
        } catch (MiExcepcion e)
        {
            throw new MiExcepcion("No se edito el Libro");
        }

    }

    @Transactional(readOnly = true)
    public Libro buscarPorId(String id) {
        Optional<Libro> op = rLibro.findById(id);
        if (op.isPresent())
        {
            return op.get();
        } else
        {
            return null;
        }
    }

    @Transactional(readOnly = true)
    public List<Libro> listaLibro() {
        return rLibro.findAll();
    }

    @Transactional(readOnly = true)
    public List<Libro> listaActivos() throws MiExcepcion{
        return rLibro.listaActivos();
    }

    @Transactional(readOnly = true)
    public List<Libro> listaBuscada(String buscar) {
        return rLibro.buscaTodo(buscar);
    }

    @Transactional(readOnly = true)
    public List<Libro> listaBuscadaActivos(String buscar) {
        return rLibro.buscaActivos(buscar);
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

    private Libro validar(Libro libro) throws MiExcepcion {

        //Como estoy creando un nuevo libro, seteo en verdadero el atributo alta
        libro.setAlta(Boolean.TRUE);
        //Remuevo espacios al principio y al final del título
        libro.setTitulo(libro.getTitulo().trim());

        //valido los atributos que son objetos de otra clase primero
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
            libro.setEditorial(sEditorial.buscaPorId(libro.getEditorial().getId()));
        }

        //uso Optional para validar que no exista repetido un ISBN ya que es un atributo de tipo unico en mi entidad Libro
        Optional<Libro> op = rLibro.validaISBN(libro.getIsbn());
        if (op.isPresent())
        {
            throw new MiExcepcion("El ISBN indicado, ya se encuentra registrado");
        } else if (libro.getIsbn().isEmpty() || libro.getIsbn() == null)
        {
            throw new MiExcepcion("ISBN no valido");
        } else if (libro.getIsbn().length() < 10)
        {
            throw new MiExcepcion("El ISBN no puede tener menos de 10 dígitos");
        }

        if (libro.getTitulo().isEmpty() || libro.getTitulo() == null)
        {
            throw new MiExcepcion("Titulo no valido");
        }

        if (libro.getAnio().toString().length() != 4 || libro.getAnio() == null)
        {
            throw new MiExcepcion("El Año no puede tener menos de cuatro caracteres");
        } else if (libro.getAnio() < Calendar.YEAR)
        {
            throw new MiExcepcion("El Año no puede ser mayor al año actual");
        }

        if (libro.getEjemplares() == null || libro.getEjemplares() < 1)
        {
            throw new MiExcepcion("Error en los Ejemplares");
        }
        return libro;
    }

    private Libro validarCambios(Libro editado, Libro persistido) throws MiExcepcion {
        //Verifico que exista algun cambio entre los dos objetos
        if (editado.getTitulo().equals(persistido.getTitulo())
                && editado.getAnio().equals(persistido.getAnio())
                && editado.getEjemplares().equals(persistido.getEjemplares())
                && editado.getSinopsis().equals(persistido.getSinopsis())
                && editado.getEditorial().getId().equals(persistido.getEditorial().getId())
                && editado.getAutor().getId().equals(persistido.getAutor().getId()))
        {
            throw new MiExcepcion("No existen cambios para editar");
        }

        //La nueva cantidad de ejemplares no puede ser menor a la cantidad de ejemplares que están prestados
        if (editado.getEjemplares() != null && editado.getEjemplares() < persistido.getEjemplaresPrestados())
        {
            throw new MiExcepcion("La cantidad de ejemplares no puede ser menor a " + persistido.getEjemplaresPrestados());
        }

        /*Si los parámetros del objeto editado son diferentes a los del objeto persistido
            setear los nuevos valores
            * */
        if (!editado.getAutor().getId().equals(persistido.getAutor().getId()))
        {
            persistido.setAutor(editado.getAutor());
        }
        if (!editado.getEditorial().getId().equals(persistido.getEditorial().getId()))
        {
            persistido.setEditorial(editado.getEditorial());
        }
        if (!editado.getSinopsis().equals(persistido.getSinopsis()))
        {
            if (!editado.getSinopsis().isEmpty()) {
                persistido.setSinopsis(editado.getSinopsis());
            }
        }
        if (editado.getEjemplares()!= null && !editado.getEjemplares().equals(persistido.getEjemplares()))
        {
            persistido.setEjemplares(editado.getEjemplares());
        }
        if (editado.getAnio()!=null && !editado.getAnio().equals(persistido.getAnio()))
        {
            persistido.setAnio(editado.getAnio());
        }
        if (!editado.getTitulo().isEmpty())
        {
            if (!editado.getTitulo().equals(persistido.getTitulo())) {
                persistido.setTitulo(editado.getTitulo());
            }
        }

        return persistido;
    }

}
