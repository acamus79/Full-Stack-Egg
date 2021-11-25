package com.mza.biblioteca.repositorios;


import com.mza.biblioteca.entidades.Portada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPortada extends JpaRepository<Portada, String> {
    
}
