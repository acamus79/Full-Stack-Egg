package com.cursoegg.ejemplopersonas.servicios;

import com.cursoegg.ejemplopersonas.entidades.Ciudad;
import com.cursoegg.ejemplopersonas.entidades.Persona;
import com.cursoegg.ejemplopersonas.excepciones.WebException;
import com.cursoegg.ejemplopersonas.repositories.PersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicio {

  @Autowired
  private PersonaRepository personaRepository;

  @Autowired
  private CiudadService ciudadService;

  @Transactional
  public Persona save(Persona persona) throws WebException {
    if (persona.getNombre().isEmpty() || persona.getNombre() == null || persona.getNombre().length() < 3) {
      throw new WebException(" El nombre no puede estar vacío o tener menos de 3 caracteres");
    }
    if (persona.getApellido().isEmpty() || persona.getApellido() == null) {
      throw new WebException(" El apellido no puede estar vacío");
    }
    if (persona.getEdad() == null || persona.getEdad() < 1) {
      throw new WebException(" La edad no puede estar vacía o ser menor a 1");
    }
    if (persona.getCiudad() == null) {
      throw new WebException(" La ciudad no puede ser nula");
    } else {
      persona.setCiudad(ciudadService.findById(persona.getCiudad()));
    }
    
    return personaRepository.save(persona);
  }

  @Transactional
  public Persona save(String nombre, String apellido, Integer edad) {
    Persona persona = new Persona();
    persona.setNombre(nombre);
    persona.setApellido(apellido);
    persona.setEdad(edad);
    return personaRepository.save(persona);
  }

  public List<Persona> listAll() {
    return personaRepository.findAll();
  }

  public List<Persona> listAllByQ(String q) {
    return personaRepository.findAllByQ("%" + q + "%");
  }

  public List<Persona> listAllbyCiudad(String nombre) {
    return personaRepository.findAllByCiudad(nombre);
  }

  public Optional<Persona> findById(String id) {
    return personaRepository.findById(id);
  }

  @Transactional
  public void delete(Persona persona) {
    personaRepository.delete(persona);
  }

  @Transactional
  public void deleteFieldCiudad(Ciudad ciudad) {
    List<Persona> personas = listAllbyCiudad(ciudad.getNombre());
    for (Persona persona : personas) {
      persona.setCiudad(null);
    }
    personaRepository.saveAll(personas);
  }

  @Transactional
  public void deleteById(String id) {
    Optional<Persona> optional = personaRepository.findById(id);
    if (optional.isPresent()) {
      personaRepository.delete(optional.get());
      
    }

  }

}
