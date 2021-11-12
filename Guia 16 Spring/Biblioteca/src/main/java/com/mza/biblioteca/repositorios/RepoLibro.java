/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.biblioteca.repositorios;

import com.mza.biblioteca.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Adrian E. Camus
 */
@Repository
public interface RepoLibro extends JpaRepository<Libro, String>{
    
    @Query("SELECT p from Libro p WHERE p.titulo LIKE :buscar or p.autor.nombre LIKE :buscar or p.editorial.nombre LIKE :buscar")
    List<Libro> buscar(@Param("buscar") String buscar);

}
