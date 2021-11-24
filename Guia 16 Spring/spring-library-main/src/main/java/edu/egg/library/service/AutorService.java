package edu.egg.library.service;

import edu.egg.library.entity.Autor;
import edu.egg.library.exception.SpringException;
import edu.egg.library.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private FotoService fotoService;

    private String mensaje = "No existe ningún autor asociado con el ID %s";

    @Transactional
    public void crear(Autor dto, MultipartFile foto) throws SpringException {
        if (autorRepository.existsByNombreAndApellido(dto.getNombre(), dto.getApellido())) {
            throw new SpringException("Ya existe un autor registrado con ese nombre y apellido");
        }
        Autor autor = new Autor();
        autor.setNombre(dto.getNombre());
        autor.setApellido(dto.getApellido());
        if (!foto.isEmpty()) {
            autor.setImage(fotoService.copiar(foto));
        }
        autor.setAlta(true);
        autorRepository.save(autor);
    }

    @Transactional
    public void modificar(Autor dto, MultipartFile foto) throws SpringException {
        Autor autor = autorRepository.findById(dto.getId()).orElseThrow(() -> new SpringException(String.format(mensaje, dto.getId())));
        autor.setNombre(dto.getNombre());
        autor.setApellido(dto.getApellido());
        if (!foto.isEmpty()) {
            autor.setImage(fotoService.copiar(foto));
        }
        autorRepository.save(autor);
    }

    @Transactional(readOnly = true)
    public List<Autor> buscarTodos() {
        return autorRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Autor buscarPorId(Integer id) throws SpringException {
        return autorRepository.findById(id).orElseThrow(() -> new SpringException(String.format(mensaje, id)));
    }

    @Transactional
    public void habilitar(Integer id) {
        autorRepository.habilitar(id);
    }

    @Transactional
    public void eliminar(Integer id) {
        autorRepository.deleteById(id);
    }
}
