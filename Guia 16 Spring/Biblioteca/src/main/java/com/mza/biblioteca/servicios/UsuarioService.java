/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.servicios;

import com.mza.biblioteca.entidades.Usuario;
import com.mza.biblioteca.enumeradores.Rol;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.repositorios.RepoUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author Adrian E. Camus
 */
@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    RepoUsuario rUsuario;

    @Autowired
    PortadaService sFoto;

    @Transactional
    public void registrar(String nombre, String apellido, String email, String clave, String clave2) throws MiExcepcion {

        validar(nombre, apellido, email, clave, clave2);

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setMail(email);
        usuario.setRol(Rol.USUARIO);

        String encriptada = new BCryptPasswordEncoder().encode(clave);
        usuario.setClave(encriptada);

        usuario.setAlta(new Date());
        usuario.setBaja(null);
        usuario.setCantidadPrestamos(0);

        rUsuario.save(usuario);

    }

    @Transactional
    public void modificar(String id, String nombre, String apellido, String mail, String clave, String clave2) throws MiExcepcion {

        validar(nombre, apellido, mail, clave, clave2);

        Optional<Usuario> respuesta = rUsuario.findById(id);
        if (respuesta.isPresent())
        {
            Usuario usuario = respuesta.get();
            usuario.setApellido(apellido);
            usuario.setNombre(nombre);
            usuario.setMail(mail);
            String encriptada = new BCryptPasswordEncoder().encode(clave);
            usuario.setClave(encriptada);

            rUsuario.save(usuario);
        } else
        {

            throw new MiExcepcion("No se encontró el usuario solicitado");
        }

    }

    @Transactional
    public void deshabilitar(String id) throws MiExcepcion {

        Optional<Usuario> respuesta = rUsuario.findById(id);
        if (respuesta.isPresent())
        {
            Usuario usuario = respuesta.get();
            usuario.setBaja(new Date());
            rUsuario.save(usuario);
        } else
        {

            throw new MiExcepcion("No se encontró el usuario solicitado");
        }

    }

    @Transactional
    public void habilitar(String id) throws MiExcepcion {

        Optional<Usuario> respuesta = rUsuario.findById(id);
        if (respuesta.isPresent())
        {
            Usuario usuario = respuesta.get();
            usuario.setBaja(null);
            rUsuario.save(usuario);
        } else
        {

            throw new MiExcepcion("No se encontró el usuario solicitado");
        }

    }

    @Transactional
    public void cambiarRol(String id) throws MiExcepcion {

        Optional<Usuario> respuesta = rUsuario.findById(id);

        if (respuesta.isPresent())
        {

            Usuario usuario = respuesta.get();

            if (usuario.getRol().equals(Rol.USUARIO))
            {
                usuario.setRol(Rol.ADMIN);
            } else if (usuario.getRol().equals(Rol.ADMIN))
            {
                usuario.setRol(Rol.USUARIO);
            }
        }
    }

    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {

        Usuario usuario = rUsuario.buscarPorMail(mail);

        if (usuario != null)
        {
            List<GrantedAuthority> permisos = new ArrayList<>();

            //Creo una lista de permisos! 
            GrantedAuthority p1 = new SimpleGrantedAuthority("ROLE_" + usuario.getRol());
            permisos.add(p1);

            //Esto me permite guardar el OBJETO USUARIO LOG, para luego ser utilizado
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario); // llave + valor

            User user = new User(usuario.getMail(), usuario.getClave(), permisos);

            return user;

        } else
        {
            return null;
        }
    }

    @Transactional(readOnly = true)
    public Usuario buscarPorId(String id) throws MiExcepcion {

        Optional<Usuario> respuesta = rUsuario.findById(id);
        if (respuesta.isPresent())
        {

            Usuario usuario = respuesta.get();
            return usuario;
        } else
        {

            throw new MiExcepcion("No se encontró el usuario solicitado");
        }

    }

    @Transactional(readOnly = true)
    public List<Usuario> todosLosUsuarios() {
        return rUsuario.findAll();
    }

    @Transactional(readOnly = true)
    public List<Usuario> usuariosActivos() throws MiExcepcion{
        return rUsuario.buscaActivos();
    }

    public void validar(String nombre, String apellido, String email, String clave, String clave2) throws MiExcepcion {
        Optional<Usuario> op = rUsuario.validaMail(email);

        if (nombre == null || nombre.isEmpty())
        {
            throw new MiExcepcion("El nombre del usuario no puede ser nulo");
        }

        if (apellido == null || apellido.isEmpty())
        {
            throw new MiExcepcion("El apellido del usuario no puede ser nulo");
        }

        if (email == null || email.isEmpty())
        {
            throw new MiExcepcion("El mail no puede ser nulo");
        }

        if (op.isPresent())
        {
            throw new MiExcepcion("La dirección e-mail indicada, ya se encuentra registrada");
        }

        if (clave == null || clave.isEmpty() || clave.length() < 4)
        {
            throw new MiExcepcion("La clave del usuario no puede ser nula y tiene que tener cuatro o más caracteres");
        }
        if (!clave.equals(clave2))
        {
            throw new MiExcepcion("Las claves deben ser iguales");
        }

    }

}
