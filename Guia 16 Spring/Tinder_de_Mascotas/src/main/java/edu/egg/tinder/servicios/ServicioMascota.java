/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package edu.egg.tinder.servicios;

import edu.egg.tinder.entidades.Foto;
import edu.egg.tinder.entidades.Mascota;
import edu.egg.tinder.entidades.Usuario;
import edu.egg.tinder.enumeradores.Sexo;
import edu.egg.tinder.errores.ErrorServicio;
import edu.egg.tinder.repositorios.RepoMascota;
import edu.egg.tinder.repositorios.RepoUsuario;
import java.util.Date;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Adrian E. Camus
 */
@Service
public class ServicioMascota {

    // creo un objeto de la clase RepoMascota y lo denomino mRepo
    @Autowired
    RepoMascota mRepo;

    // creo un objeto de la clase RepoUsuario y lo denomino uRepo
    @Autowired
    RepoUsuario uRepo;
    
    @Autowired
    ServicioFoto sFoto;

    @Transactional
    public void agregar(MultipartFile archivo, String idUsuario, String nombre, Sexo sexo) throws ErrorServicio {

        Usuario usuario = uRepo.findById(idUsuario).get();

        validar(nombre, sexo);

        Mascota mascota = new Mascota();

        mascota.setAlta(new Date());
        mascota.setNombre(nombre);
        mascota.setSexo(sexo);
        
        Foto foto = sFoto.guardar(archivo);
        mascota.setFoto(foto);

        mRepo.save(mascota);
    }
    
    @Transactional
    public void modificar(MultipartFile archivo, String idUsuario, String idMascota, String nombre, Sexo sexo) throws ErrorServicio {

        validar(nombre, sexo);
        //Esta linea va a la base de datos y busca segun el id si hay una mascota
        Optional<Mascota> respuesta = mRepo.findById(idMascota);

        if (respuesta.isPresent())
        {
            Mascota mascota = respuesta.get();
            //si el ID del usuario dueño de la mascota es igual al id de usuario que me 
            //viene por parametro hago las modificaciones
            if (mascota.getUsuario().getId().equals(idUsuario))
            {
                mascota.setNombre(nombre);
                mascota.setSexo(sexo);
                
                String idFoto = null;
                if(mascota.getFoto()!= null){
                    idFoto= mascota.getFoto().getId();
                }
                Foto foto = sFoto.modificar(idFoto, archivo);
                mascota.setFoto(foto);
                
                mRepo.save(mascota);
            } else
            {
                throw new ErrorServicio("NO ES DUEÑO DE LA MASCOTA");
            }

        } else
        {
            throw new ErrorServicio("No existe una mascota con el identificador solicitado");
        }

    }
    
    @Transactional
    public void eliminar(String idUsuario, String idMascota, String nombre, Sexo sexo) throws ErrorServicio {

        validar(nombre, sexo);
        Optional<Mascota> respuesta = mRepo.findById(idMascota);

        if (respuesta.isPresent())
        {
            Mascota mascota = respuesta.get();
            if (mascota.getUsuario().getId().equals(idUsuario))
            {
                mascota.setBaja(new Date());
                mRepo.save(mascota);
            } else
            {
                throw new ErrorServicio("NO ES DUEÑO DE LA MASCOTA");
            }
        } else
        {
            throw new ErrorServicio("No existe una mascota con el identificador solicitado");
        }
    }

    public void validar(String nombre, Sexo sexo) throws ErrorServicio {

        if (nombre == null || nombre.isEmpty())
        {
            throw new ErrorServicio("El Nombre no puede ser nulo");
        }

        if (sexo == null)
        {
            throw new ErrorServicio("El Sexo no puede ser nulo");
        }

    }

}
