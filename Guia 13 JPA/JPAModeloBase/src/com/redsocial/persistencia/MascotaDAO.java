package com.redsocial.persistencia;

import com.redsocial.dominio.mascota.Mascota;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class MascotaDAO  {

    //El parametro de este atributo, es COMO SE NOMBRA MI ARCHIVO PERSISTENCIA (persistence.xml, Persistencia Unit Name)
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAModeloBasePU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarMascota(Mascota mascota) throws Exception { // Este metodo es para ingresar 
        em.getTransaction().begin();
        em.persist(mascota); // Para guardar - envio el objeto completo
        em.getTransaction().commit();       
    }
//
    public void modificarMascota(Mascota mascota) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(mascota); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();    
    }

    public void eliminarMascota(String id) throws Exception {
        Mascota mascota = buscarMascotaPorId(id);
        em.getTransaction().begin(); //Inicio   
        em.remove(mascota);
        em.getTransaction().commit(); //Fin (Si algo fallo ... vuelve pa atras)    
    }

    public Mascota buscarMascotaPorId(String id) throws Exception {
        Mascota mascota = em.find(Mascota.class, id); // Para traer objeto con el ID
        return mascota;
    }

    //CONSULTA SIN PARAMETROS
    public List<Mascota> listarMascotas() throws Exception {
        List<Mascota> mascotas = em.createQuery("SELECT d FROM Mascota d")
                .getResultList();
        return mascotas;
    }

    //CONSULTA CON PARAMETROS
    public List<Mascota> listarMascotasRaza(String raza) throws Exception {
        List<Mascota> mascotasFiltradas = em.createQuery("SELECT d "
                + " FROM Mascota d"
                + " WHERE d.raza = :raza").
                setParameter("raza", raza)
                .getResultList();
        return mascotasFiltradas;
    }

}
