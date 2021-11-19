package com.proyecto.demo.repositorios;

import com.proyecto.demo.entidades.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaRepositorio extends JpaRepository<Zona, String> {
    
    
    
}
