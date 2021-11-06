/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package edu.egg.tinder.servicios;

import edu.egg.tinder.entidades.Mascota;
import edu.egg.tinder.entidades.Voto;
import edu.egg.tinder.errores.ErrorServicio;
import edu.egg.tinder.repositorios.RepoMascota;
import edu.egg.tinder.repositorios.RepoUsuario;
import edu.egg.tinder.repositorios.RepoVoto;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian E. Camus
 */
@Service
public class ServicioVoto {

    // creo un objeto de la clase RepoMascota y lo denomino mRepo
    @Autowired
    RepoMascota mRepo;

    // creo un objeto de la clase RepoUsuario y lo denomino uRepo
    @Autowired
    RepoVoto vRepo;

    public void votar(String idUsuario, String idMascota1, String idMascota2) throws ErrorServicio {
        
        Voto voto = new Voto();
        voto.setFecha(new Date());
        
        if(idMascota1.equals(idMascota2)){
            throw new ErrorServicio("NO puede votarse a si mismo");
        }

        Optional<Mascota> respuesta = mRepo.findById(idMascota1);
        if (respuesta.isPresent())
        {
            Mascota mascota1 = respuesta.get();
            if (mascota1.getUsuario().getId().equals(idUsuario))
            {
                voto.setMascota1(mascota1);
            } else
            {
                throw new ErrorServicio("NO ES DUEÑO DE LA MASCOTA");
            }

        } else
        {
            throw new ErrorServicio("No existe una Mascota vinculada a ese identificador");
        }

        Optional<Mascota> respuesta2 = mRepo.findById(idMascota2);
        if (respuesta2.isPresent())
        {
            Mascota mascota2 = respuesta2.get();
            voto.setMascota2(mascota2);
        } else
        {
            throw new ErrorServicio("No existe una Mascota vinculada a ese identificador");
        }
        
        vRepo.save(voto);
    }
    
    public void respuesta(String idUsuario, String idVoto) throws ErrorServicio {
        
        Optional<Voto> respuesta = vRepo.findById(idVoto);
        
        if(respuesta.isPresent()){
            Voto voto = respuesta.get();
            voto.setRespuesta(new Date());
            
            if(voto.getMascota2().getUsuario().getId().equals(idUsuario)){
                vRepo.save(voto);
            }else{
                throw new ErrorServicio("No tiene permiso para realizar la acción");
            }
            
        }else{
            throw new ErrorServicio("No existe el voto solicitado");
        }
    }
}
