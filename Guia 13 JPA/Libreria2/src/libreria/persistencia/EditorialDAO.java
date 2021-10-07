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

/**
 *
 * @author Adrian E. Camus
 */
public class EditorialDAO {

    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();

    public Editorial buscarPorNombre(String nombre) throws Exception {
        // Para traer objeto con el nombre
        Editorial editorial = (Editorial) em.createQuery("SELECT d "
                + " FROM Editorial d"
                + " WHERE d.nombre LIKE :nombre").
                setParameter("nombre", nombre).
                getSingleResult();
        return editorial;
    }

    public Editorial buscarPorId(String id) throws Exception {
        Editorial editorial = em.find(Editorial.class, id);
        return editorial;
    }

    //CRUD
    public void guardarEditorial(Editorial editorial) throws Exception {
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
    }

    public List<Editorial> listarTodos() throws Exception {
        List<Editorial> editoriales = em.createQuery("SELECT d FROM Editorial d")
                .getResultList();
        return editoriales;
    }

    public void modificarEditorial(Editorial editorial) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(editorial); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();
    }

    public void eliminar(String id) throws Exception {
        Editorial editorial = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
    }

    public void eliminarPorNombre(String nombre) throws Exception {
        Editorial editorial = buscarPorNombre(nombre);
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
    }
    

}
