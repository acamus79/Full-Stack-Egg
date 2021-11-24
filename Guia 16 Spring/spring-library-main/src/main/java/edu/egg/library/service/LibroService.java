package edu.egg.library.service;

import edu.egg.library.entity.Autor;
import edu.egg.library.entity.Editorial;
import edu.egg.library.entity.Libro;
import edu.egg.library.exception.SpringException;
import edu.egg.library.repository.AutorRepository;
import edu.egg.library.repository.EditorialRepository;
import edu.egg.library.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private EditorialRepository editorialRepository;

    private final String MENSAJE = "No existe ningún libro asociado con el ID %s";

    @Transactional
    public void crear(Libro dto) throws SpringException {
        if (libroRepository.existsByTitulo(dto.getTitulo())) {
            throw new SpringException("Ya existe un libro registrado con el nombre ingresado");
        }
        Libro libro = new Libro();
        libro.setIsbn(dto.getIsbn());
        libro.setTitulo(dto.getTitulo());
        libro.setAnio(dto.getAnio());
        libro.setEjemplares(dto.getEjemplares());
        libro.setPrestados(dto.getPrestados());
        libro.setRestantes(dto.getEjemplares() - dto.getPrestados());
        libro.setAutor(dto.getAutor());
        libro.setEditorial(dto.getEditorial());
        libro.setAlta(true);
        libroRepository.save(libro);
    }

    @Transactional
    public void modificar(Libro dto) throws SpringException {
        Libro libro = libroRepository.findById(dto.getId()).orElseThrow(() -> new SpringException(String.format(MENSAJE, dto.getId())));
        libro.setIsbn(dto.getIsbn());
        libro.setTitulo(dto.getTitulo());
        libro.setAnio(dto.getAnio());
        libro.setEjemplares(dto.getEjemplares());
        libro.setPrestados(dto.getPrestados());
        libro.setRestantes(dto.getEjemplares() - dto.getPrestados());
        libro.setAutor(dto.getAutor());
        libro.setEditorial(dto.getEditorial());
        libroRepository.save(libro);
    }

    @Transactional(readOnly = true)
    public List<Libro> buscarTodos() {
        return libroRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Libro buscarPorId(Integer id) throws SpringException {
        return libroRepository.findById(id).orElseThrow(() -> new SpringException(String.format(MENSAJE, id)));
    }

    @Transactional
    public void habilitar(Integer id) {
        libroRepository.habilitar(id);
    }

    @Transactional
    public void eliminar(Integer id) {
        libroRepository.deleteById(id);
    }
}
