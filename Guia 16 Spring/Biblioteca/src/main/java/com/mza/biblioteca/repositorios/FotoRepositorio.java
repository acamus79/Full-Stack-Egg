package com.mza.biblioteca.repositorios;


import com.mza.biblioteca.entidades.Portada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepositorio extends JpaRepository<Portada, String> {
    
}
