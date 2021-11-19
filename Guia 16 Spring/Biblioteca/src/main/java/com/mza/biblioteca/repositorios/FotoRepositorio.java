package com.mza.biblioteca.repositorios;


import com.mza.biblioteca.entidades.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepositorio extends JpaRepository<Foto, String> {
    
}
