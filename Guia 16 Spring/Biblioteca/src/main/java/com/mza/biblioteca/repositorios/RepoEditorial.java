/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.biblioteca.repositorios;

import com.mza.biblioteca.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * @author Adrian E. Camus
 */
@Repository
public interface RepoEditorial extends JpaRepository<Editorial, String>{

    @Query("SELECT e FROM Editorial e WHERE e.nombre = :nombre")
    public Editorial buscaPorNombre(@Param("nombre") String nombre);

    @Query("SELECT e FROM Editorial e WHERE e.alta = true")
    public List<Editorial> buscaActivos();
}
