package edu.egg.library.service;

import edu.egg.library.entity.Editorial;
import edu.egg.library.exception.SpringException;
import edu.egg.library.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    private String mensaje = "No existe ninguna editorial asociada con el ID %s";

    @Transactional
    public void crear(Editorial dto) throws SpringException {
        if (editorialRepository.existsByNombre(dto.getNombre())) {
            throw new SpringException("Ya existe una editorial con el nombre ingresado");
        }
        Editorial editorial = new Editorial();
        editorial.setNombre(dto.getNombre());
        editorial.setAlta(true);
        editorialRepository.save(editorial);
    }

    @Transactional
    public void modificar(Editorial dto) throws SpringException {
        Editorial editorial = editorialRepository.findById(dto.getId()).orElseThrow(() -> new SpringException(String.format(mensaje, dto.getId())));
        editorial.setNombre(dto.getNombre());
        editorialRepository.save(editorial);
    }

    @Transactional(readOnly = true)
    public List<Editorial> buscarTodos() {
        return editorialRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Editorial buscarPorId(Integer id) throws SpringException {
        return editorialRepository.findById(id).orElseThrow(() -> new SpringException(String.format(mensaje, id)));
    }

    @Transactional
    public void habilitar(Integer id) {
        editorialRepository.habilitar(id);
    }

    @Transactional
    public void eliminar(Integer id) {
        editorialRepository.deleteById(id);
    }
}
