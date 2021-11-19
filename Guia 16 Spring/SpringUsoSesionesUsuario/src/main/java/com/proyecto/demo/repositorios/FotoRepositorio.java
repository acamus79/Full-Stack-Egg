package com.proyecto.demo.repositorios;

import com.proyecto.demo.entidades.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepositorio extends JpaRepository<Foto, String> {

    
}
