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

    public void guardarAutor(Autor autor) throws Exception {
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }

    public Autor buscarPorId(String id) throws Exception {
        Autor autor = em.find(Autor.class, id);
        return autor;
    }

    public void eliminar(String id) throws Exception {
        Autor autor = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }

    public List<Autor> listarTodos() throws Exception {
        List<Autor> autores = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        return autores;
    }

}
