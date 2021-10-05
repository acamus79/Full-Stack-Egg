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

    public Libro buscaPorTitulo(String titulo) throws Exception {

        Libro libro = (Libro) em.createQuery("SELECT l "
                + " FROM Libro l"
                + " WHERE l.titulo LIKE :titulo").
                setParameter("titulo", titulo).
                getSingleResult();
        return libro;
    }
    
    public Libro buscaPorISBN(Long isbn) throws Exception {

        Libro libro = (Libro) em.createQuery("SELECT l "
                + " FROM Libro l"
                + " WHERE l.isbn LIKE :isbn").
                setParameter("isbn", isbn).
                getSingleResult();
        return libro;
    }
    
     public Libro buscaPorAutor(String id) throws Exception {

        Libro libro = (Libro) em.createQuery("SELECT l "
                + " FROM Libro l"
                + " WHERE l.AUTOR_ID LIKE :id").
                setParameter("AUTOR_ID", id).
                getSingleResult();
        return libro;
    }
    

    public void eliminar(String id) throws Exception {
        Libro libro = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }

    public void eliminaPorTitulo(String titulo) throws Exception {
        Libro libro = buscaPorTitulo(titulo);
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
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
        List<Libro> libros = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        return libros;
    }

}
