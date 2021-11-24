package edu.egg.library.service;

import edu.egg.library.exception.SpringException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FotoService {

    @Value("${my.property}")
    private String directory;

    public String copiar(MultipartFile archivo) throws SpringException {
        try {
            String nombreFoto = archivo.getOriginalFilename();
            Path rutaFoto = Paths.get(directory, nombreFoto).toAbsolutePath();
            Files.copy(archivo.getInputStream(), rutaFoto, StandardCopyOption.REPLACE_EXISTING);
            return nombreFoto;
        } catch (IOException e) {
            throw new SpringException("Error al guardar foto");
        }
    }
}
