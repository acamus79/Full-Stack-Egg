package edu.egg.library.repository;

import edu.egg.library.LibraryApplication;
import edu.egg.library.entity.Libro;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = LibraryApplication.class)
class LibroRepositoryTest {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LibroRepository libroRepository;

    @Test
    void findByAutor_Nombre() {
        List<Libro> libros = libroRepository.findByAutor_Nombre("Julio");
        LOGGER.info("Libros -> {}", libros);
    }

    @Test
    void findByAutor_Apellido() {
        List<Libro> libros = libroRepository.findByAutor_Apellido("Cortázar");
        LOGGER.info("Libros -> {}", libros);
    }

    @Test
    void findByEditorial_Nombre() {
        List<Libro> libros = libroRepository.findByEditorial_Nombre("Lumen");
        LOGGER.info("Libros -> {}", libros);
    }
}
