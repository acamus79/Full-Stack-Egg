/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package edu.egg.tinder.servicios;

import edu.egg.tinder.entidades.Mascota;
import edu.egg.tinder.entidades.Usuario;
import edu.egg.tinder.enumeradores.Sexo;
import edu.egg.tinder.errores.ErrorServicio;
import edu.egg.tinder.repositorios.RepoMascota;
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
public class ServicioMascota {

    // creo un objeto de la clase RepoMascota y lo denomino mRepo
    @Autowired
    RepoMascota mRepo;

    // creo un objeto de la clase RepoUsuario y lo denomino uRepo
    @Autowired
    RepoUsuario uRepo;

    public void agregar(String idUsuario, String nombre, Sexo sexo) throws ErrorServicio {

        Usuario usuario = uRepo.findById(idUsuario).get();

        validar(nombre, sexo);

        Mascota mascota = new Mascota();

        mascota.setAlta(new Date());
        mascota.setNombre(nombre);
        mascota.setSexo(sexo);

        mRepo.save(mascota);
    }
    
        
    public void modificar(String idUsuario, String idMascota, String nombre, Sexo sexo) throws ErrorServicio{
        
        validar(nombre, sexo);
        //Esta linea va a la base de datos y busca segun el id si hay una mascota
        Optional<Mascota> respuesta = mRepo.findById(idMascota);

        if (respuesta.isPresent())
        {
            Mascota mascota = respuesta.get();
            //si el ID del usuario dueño de la mascota es igual al id de usuario que me 
            //viene por parametro hago las modificaciones
            if(mascota.getUsuario().getId().equals(idUsuario)){
                mascota.setNombre(nombre);
                mascota.setSexo(sexo);
                
                mRepo.save(mascota);
            }else{
                throw new ErrorServicio("NO ES DUEÑO DE LA MASCOTA");
            }
                        
        }else{
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
