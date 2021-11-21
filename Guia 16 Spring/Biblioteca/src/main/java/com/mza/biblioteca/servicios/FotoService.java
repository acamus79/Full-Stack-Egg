/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.servicios;

import com.mza.biblioteca.entidades.Portada;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.repositorios.FotoRepositorio;
import java.io.IOException;
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
public class FotoService {

    @Autowired
    private FotoRepositorio rFoto;

    @Transactional
    public Portada guardar(MultipartFile archivo) throws MiExcepcion {

        if (archivo != null && !archivo.isEmpty())
        {
            try
            {
                Portada foto = new Portada();
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());

                return rFoto.save(foto);
            } catch (IOException e)
            {
                System.err.println(e.getMessage());
            }
        }
        return null;

    }

    @Transactional
    public Portada actualizar(String idFoto, MultipartFile archivo) throws MiExcepcion {

        if (archivo != null)
        {
            try
            {
                Portada foto = new Portada();

                if (idFoto != null)
                {
                    Optional<Portada> respuesta = rFoto.findById(idFoto);
                    if (respuesta.isPresent())
                    {
                        foto = respuesta.get();
                    }
                }
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());
                
                return rFoto.save(foto);
            } catch (IOException e)
            {
                System.err.println(e.getMessage());
            }
        }
        return null;
    }

}
