
package com.redsocial.persistencia;

import com.redsocial.dominio.direccion.Direccion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DireccionDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAModeloBasePU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarDireccion(Direccion direccion) throws Exception {
        em.getTransaction().begin();
        em.persist(direccion);
        em.getTransaction().commit();
    }

    public Direccion buscarPorId(String id) throws Exception {
        Direccion direccion = em.find(Direccion.class, id);
        return direccion;
    }

    public void eliminar(String id) throws Exception {
        Direccion direccion = buscarPorId(id);
        em.getTransaction().begin();
        em.remove(direccion);
        em.getTransaction().commit();
    }

    public List<Direccion> listarTodos() throws Exception {
        List<Direccion> direcciones = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        return direcciones;
    }

}

