/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.servicios;

import com.mza.biblioteca.entidades.Portada;
import com.mza.biblioteca.excepciones.MiExcepcion;
import java.io.IOException;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.mza.biblioteca.repositorios.RepoPortada;

/**
 *
 * @author Adrian E. Camus
 */
@Service
public class PortadaService {

    @Autowired
    private RepoPortada rPortada;

    @Transactional
    public Portada guardar(MultipartFile archivo) throws MiExcepcion {

        if (archivo != null && !archivo.isEmpty())
        {
            try
            {
                Portada portada = new Portada();
                portada.setMime(archivo.getContentType());
                portada.setNombre(archivo.getName());
                portada.setContenido(archivo.getBytes());

                return rPortada.save(portada);
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
                Portada portada = new Portada();

                if (idFoto != null)
                {
                    Optional<Portada> respuesta = rPortada.findById(idFoto);
                    if (respuesta.isPresent())
                    {
                        portada = respuesta.get();
                    }
                }
                portada.setMime(archivo.getContentType());
                portada.setNombre(archivo.getName());
                portada.setContenido(archivo.getBytes());
                
                return rPortada.save(portada);
            } catch (IOException e)
            {
                System.err.println(e.getMessage());
            }
        }
        return null;
    }

}
