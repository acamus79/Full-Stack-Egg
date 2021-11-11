package com.cursoegg.ejemplopersonas.servicios;

import com.cursoegg.ejemplopersonas.entidades.Ciudad;
import com.cursoegg.ejemplopersonas.excepciones.WebException;
import com.cursoegg.ejemplopersonas.repositories.CiudadRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CiudadService {

  @Autowired
  private CiudadRepository ciudadRepository;

  @Autowired
  private PersonaServicio personaService;

  public Ciudad save(String name) {
    Ciudad ciudad = new Ciudad();
    ciudad.setNombre(name);
    return ciudadRepository.save(ciudad);
  }

  public Ciudad save(Ciudad ciudad) throws WebException {
    if (ciudad.getNombre() == null) {
      throw new WebException("El nombre de la ciudad no puede ser nulo");
    }
    return ciudadRepository.save(ciudad);
  }

//  public Ciudad saveByPersona(Ciudad ciudad) throws WebException {
//    if (ciudad.getId() == null) {
//      throw new WebException("Ocurrio un error al querer guardar la ciudad");
//    } else {
//      Optional<Ciudad> optional = ciudadRepository.findById(ciudad.getId());
//      if (optional.isPresent()) {
//        ciudad = optional.get();
//      }
//    }
//    return save(ciudad);
//  }

  public List<Ciudad> listAll() {
    return ciudadRepository.findAll();
  }

  public List<Ciudad> listAll(String q) {
    return ciudadRepository.findAll("%" + q + "%");
  }

  public Ciudad findById(Ciudad ciudad) {
    Optional<Ciudad> optional = ciudadRepository.findById(ciudad.getId());
    if (optional.isPresent()) {
      ciudad = optional.get();
    }
    return ciudad;
  }

  public Optional<Ciudad> findById(String id) {
    return ciudadRepository.findById(id);
  }

  @Transactional
  public void delete(Ciudad ciudad) {

    ciudadRepository.delete(ciudad);
  }

  @Transactional
  public void deleteById(String id) {
    Optional<Ciudad> optional = ciudadRepository.findById(id);
    if (optional.isPresent()) {
      Ciudad ciudad = optional.get();
      personaService.deleteFieldCiudad(ciudad);
      ciudadRepository.delete(ciudad);
    }

  }
}
