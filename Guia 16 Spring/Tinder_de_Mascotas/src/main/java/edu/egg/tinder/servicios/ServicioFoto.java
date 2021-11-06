/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package edu.egg.tinder.servicios;

import edu.egg.tinder.entidades.Foto;
import edu.egg.tinder.errores.ErrorServicio;
import edu.egg.tinder.repositorios.RepoFoto;
import java.io.IOException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Adrian E. Camus
 */
@Service
public class ServicioFoto {

    @Autowired
    private RepoFoto fRepo;

    public Foto guardar(MultipartFile archivo) throws ErrorServicio {

        if (archivo != null)
        {
            try
            {
                Foto foto = new Foto();
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());

                return fRepo.save(foto);
            } catch (IOException ex)
            {
                System.err.println(ex.getMessage());
            }
        }
        return null;
    }
    
    public Foto modificar(String idFoto, MultipartFile archivo) throws ErrorServicio {

        if (archivo != null)
        {
            try
            {
                Foto foto = new Foto();
                
                if(idFoto != null){
                    Optional<Foto> respuesta = fRepo.findById(idFoto);
                    if(respuesta.isPresent()){
                        foto = respuesta.get();
                    }
                }
                
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());

                return fRepo.save(foto);
            } catch (IOException ex)
            {
                System.err.println(ex.getMessage());
            }
        }
        return null;
    }

}
