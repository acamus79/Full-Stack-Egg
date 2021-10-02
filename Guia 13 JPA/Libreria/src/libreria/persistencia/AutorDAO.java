/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package libreria.persistencia;

import libreria.entidades.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Adrian E. Camus
 */
public class AutorDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();

    public Autor buscarPorNombre(String nombre) throws Exception {
         // Para traer objeto con el nombre
         Autor autor = (Autor) em.createQuery("SELECT d "
                + " FROM Autor d"
                + " WHERE d.nombre LIKE :nombre").
                setParameter("nombre", nombre).
                getSingleResult(); 
        return autor;
    }
    
    
    public Autor buscarPorId(String id) throws Exception {
        Autor autor = em.find(Autor.class, id);
        return autor;
    }
    
    
    //C R U D
    
    //CREATE
    public void guardarAutor(Autor autor) throws Exception {
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }
    //READ
    public List<Autor> listarTodos() throws Exception {
        List<Autor> autores = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        return autores;
    }
    //UPDATE
    
    public void modificarAutor(Autor autor) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(autor); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();    
    }
    
    
    //DELETE
    public void eliminar(String id) throws Exception {
        Autor autor = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }
     
    public void eliminarPorNombre(String nombre) throws Exception {
        Autor autor = buscarPorNombre(nombre);
        em.getTransaction().begin(); //Inicio   
        em.remove(autor);
        em.getTransaction().commit(); //Fin (Si algo fallo ... vuelve pa atras)    
    }
   
        
    
}
