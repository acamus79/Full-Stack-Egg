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

    public void guardarEditorial(Editorial editorial) throws Exception {
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
    }

    public Editorial buscarPorId(String id) throws Exception {
        Editorial editorial = em.find(Editorial.class, id);
        return editorial;
    }

    public void eliminar(String id) throws Exception {
        Editorial editorial = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
    }

    public List<Editorial> listarTodos() throws Exception {
        List<Editorial> editoriales = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        return editoriales;
    }

}
