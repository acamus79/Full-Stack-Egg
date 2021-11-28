package com.mza.biblioteca.controladores;

import com.mza.biblioteca.entidades.Libro;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.servicios.LibroService;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/portada")
public class PortadaController {

    @Autowired
    private LibroService sLibro;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/libro/{id}")
    public ResponseEntity<byte[]> portadaLibro(@PathVariable String id) throws MiExcepcion {
        Libro libro = sLibro.buscarPorId(id);

        if(libro == null){
            throw new MiExcepcion("No se puede asignar el archivo a ese ID");
        }

        try
        {
            if (libro.getPortada() == null)
            {
                throw new MiExcepcion("El Libro no tiene una foto asignada.");
            }
            byte[] foto = libro.getPortada().getContenido();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);

            return new ResponseEntity<>(foto, headers, HttpStatus.OK);
        } catch (MiExcepcion ex)
        {
            Logger.getLogger(PortadaController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
