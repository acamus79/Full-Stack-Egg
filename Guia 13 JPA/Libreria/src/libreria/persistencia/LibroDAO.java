/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package libreria.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author Adrian E. Camus
 */
public class LibroDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarLibro(Libro libro) throws Exception {
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }

    public Libro buscarPorId(String id) throws Exception {
        Libro libro = em.find(Libro.class, id);
        return libro;
    }

    public List<Libro> buscaPorTitulo(String titulo) throws Exception {

        try
        {
            List<Libro> libros = em.createQuery("SELECT l "
                    + " FROM Libro l"
                    + " WHERE l.titulo LIKE CONCAT('%', :titulo, '%')", Libro.class)
                    .setParameter("titulo", titulo)
                    .getResultList();
            return libros;
        } catch (Exception e)
        {
            System.out.println("ERROR al buscar por titulo");
            return null;
        }

    }

    public Libro buscaPorISBN(Long isbn) throws Exception {
        try
        {
            Libro libro = (Libro) em.createQuery("SELECT l "
                    + " FROM Libro l"
                    + " WHERE l.isbn = :isbn").
                    setParameter("isbn", isbn).
                    getSingleResult();
            return libro;

        } catch (Exception e)
        {
            System.out.println("ERROR al buscar por ISBN");
            return null;
        }
    }

    public List<Libro> buscaPorAutor(String nombAut) throws Exception {
        try
        {
            List<Libro> libros = em.createQuery("SELECT l "
                    + " FROM Libro l"
                    + " WHERE l.autor.nombre LIKE CONCAT('%', :nombre, '%')", Libro.class)
                    .setParameter("nombre", nombAut)
                    .getResultList();
            return libros;
        } catch (Exception e)
        {
            System.out.println("ERROR al buscar por Autor");
            return null;
        }
    }

    public List<Libro> buscaPorEditorial(String nombEdit) throws Exception {
        try
        {
            List<Libro> libros = em.createQuery("SELECT l "
                    + " FROM Libro l"
                    + " WHERE l.editorial.nombre LIKE CONCAT('%', :nombre, '%')", Libro.class)
                    .setParameter("nombre", nombEdit)
                    .getResultList();
            return libros;
        } catch (Exception e)
        {
            System.out.println("ERROR al buscar por Autor");
            return null;
        }
    }

    /*
        public List<Alumnos> findAlumnosByDni(Alumnos alumnos) {
        
        Query q = em.createQuery("select a 
        from Alumnos a 
        where a.dni = " + alumnos.getDni());
     
        return q.getResultList();
     
     return em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE CONCAT('%', :nombre, '%')", Autor.class).setParameter("nombre", nombre).getResultList();
              
     
     public Autor buscarAutorPorNombre(String nombre, Boolean estado) throws MiExcepcion {
        try {
            Autor autor = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre AND a.alta = :estado", Autor.class)
                    .setParameter("nombre", nombre)
                    .setParameter("estado", estado)
                    .getSingleResult();

            return autor;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new MiExcepcion("ERROR AL BUSCAR AUTOR POR ID");
        }
    }

     
     
        }
     */
    public void eliminar(String id) throws Exception {
        Libro libro = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }

    public void eliminaPorTitulo(String titulo) throws Exception {
        List<Libro> libros = buscaPorTitulo(titulo);
        Libro buscado = new Libro();
        try
        {
            if (libros == null)
            {
                System.out.println("NO existe un libro con ese titulo");
            } else
            {
                for (Libro aux : libros)
                {
                    if (aux.getTitulo() == titulo)
                    {
                        buscado = aux;
                    }
                }
                em.getTransaction().begin();
                em.remove(buscado);
                em.getTransaction().commit();
            }
        } catch (Exception e)
        {
            System.out.println("Error al Eliminar");
        }
    }

    public void eliminaPorEditorial(Editorial edit) throws Exception {
        List<Libro> libros = buscaPorEditorial(edit.getNombre());
        //Libro buscado = new Libro();
        try
        {
            if (libros == null)
            {
                System.out.println("NO existe un libro con esa Editorial");
            } else
            {
                for (Libro aux : libros)
                {
                    if (aux.getEditorial().getId().equals(edit.getId()))
                    {
                        em.getTransaction().begin();
                        em.remove(aux);
                        em.getTransaction().commit();
                    }

                }
            }
        } catch (Exception e)
        {
            System.out.println("Error al Eliminar");
        }
    }

    /*
    
    public void modificarLibro(String titulo, Libro libro) throws Exception { // Este metodo es para ingresar o modificar
        eliminaPorTitulo(titulo);
        
        em.getTransaction().begin();
        em.merge(libro); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();    
    }
     */
    public List<Libro> listarTodos() throws Exception {
        List<Libro> libros = em.createQuery("SELECT d FROM Libro d")
                .getResultList();
        return libros;
    }

}
