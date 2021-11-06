/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package edu.egg.tinder.servicios;

import edu.egg.tinder.entidades.Usuario;
import edu.egg.tinder.errores.ErrorServicio;
import edu.egg.tinder.repositorios.RepoUsuario;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian E. Camus
 */
@Service
public class ServicioUsuario {
    // creo un objeto de la clase RepoUsuario y lo denomino uRepo
    @Autowired
    RepoUsuario uRepo;

    public void registrar(String nombre, String apellido, String mail, String clave) throws ErrorServicio {
        //creo un un objeto de tipo Usuario y lo denomino "usuario"
        Usuario usuario = new Usuario();
        //con los parametros recibidos invoco al metodo validar
        validar(nombre, apellido, mail, clave);
        //en esta linea si el metodo validar no arroja excepcion continuo seteando los parametros al usuario
        usuario.setAlta(new Date());
        usuario.setApellido(apellido);
        usuario.setNombre(nombre);
        usuario.setMail(mail);
        //luego hay que meter mas seguridad
        usuario.setClave(clave);
        //Mediante el Repositorio de usuario utilizo el metodo save para persistir en la base
        uRepo.save(usuario);
    }

    public void modificar(String id, String apellido, String nombre, String mail, String clave) throws ErrorServicio {

        validar(nombre, apellido, mail, clave);
        
        Optional<Usuario> respuesta = uRepo.findById(id);

        if (respuesta.isPresent())
        {

            Usuario usuario = respuesta.get();

            usuario.setApellido(apellido);
            usuario.setMail(mail);
            usuario.setNombre(nombre);
            usuario.setClave(clave);

            uRepo.save(usuario);
        } else
        {
            throw new ErrorServicio("No se encontro el usuario solicitado");
        }

    }

    public void deshabilitar(String id) throws ErrorServicio {
        Optional<Usuario> respuesta = uRepo.findById(id);

        if (respuesta.isPresent())
        {

            Usuario usuario = respuesta.get();

            usuario.setBaja(new Date());
            
            uRepo.save(usuario);
        } else
        {
            throw new ErrorServicio("No se encontro el usuario solicitado");
        }
    }
    
    public void habilitar(String id) throws ErrorServicio {
        Optional<Usuario> respuesta = uRepo.findById(id);

        if (respuesta.isPresent())
        {

            Usuario usuario = respuesta.get();

            usuario.setBaja(null);
            
            uRepo.save(usuario);
        } else
        {
            throw new ErrorServicio("No se encontro el usuario solicitado");
        }
    }
    
    public void validar(String nombre, String apellido, String mail, String clave) throws ErrorServicio {

        if (nombre == null || nombre.isEmpty())
        {
            throw new ErrorServicio("El Nombre no puede ser nulo");
        }

        if (apellido == null || apellido.isEmpty())
        {
            throw new ErrorServicio("El Apellido no puede ser nulo");
        }

        if (mail == null || mail.isEmpty())
        {
            throw new ErrorServicio("El mail no puede ser nulo");
        }

        if (clave == null || clave.isEmpty() || clave.length() <= 5)
        {
            throw new ErrorServicio("La clave no puede ser menor a 6 caracteres");
        }
    }

    
}
