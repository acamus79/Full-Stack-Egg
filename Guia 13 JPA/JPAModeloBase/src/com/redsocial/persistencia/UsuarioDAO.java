package com.redsocial.persistencia;


import com.redsocial.dominio.usuario.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class UsuarioDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAModeloBasePU");
    private final EntityManager em = emf.createEntityManager();
                
    public void guardarUsuario(Usuario usuario) throws Exception {
        em.getTransaction().begin();
        em.persist(usuario);       
        em.getTransaction().commit();
    }

    public void modificarUsuario(Usuario usuario) throws Exception {
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
    }

    public void eliminarUsuarioId(String id) throws Exception {
        Usuario usuario = buscarUsuarioPorId(id);
        em.getTransaction().begin();
        em.remove(usuario);
        em.getTransaction().commit();
    }

    public void eliminarUsuarioCorreo(String correo) throws Exception {
        Usuario usuario = buscarUsuarioPorCorreoElectronico(correo);
        em.getTransaction().begin();
        em.remove(usuario);
        em.getTransaction().commit();
    }

    public Usuario buscarUsuarioPorId(String id) throws Exception {
        Usuario usuario = em.find(Usuario.class, id); // Esto que envio es la llave primaria
        return usuario;
    }
    //CONSULTA CON PARAMETROS

    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception {
        Usuario usuario = (Usuario) em.createQuery("SELECT d "
                + " FROM Usuario d"
                + " WHERE d.correoElectronico LIKE :correoElectronico").
                setParameter("correoElectronico", correoElectronico).
                getSingleResult();      
        return usuario;
    }
    //CONSULTA SIN PARAMETROS

    public List<Usuario> listarUsuarios() throws Exception {
        List<Usuario> usuarios = em.createQuery("SELECT d FROM Usuario d")
                .getResultList();
        return usuarios;
    }

  
  
}
