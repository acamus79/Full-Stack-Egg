/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.libreria.repositorios;

import com.mza.libreria.entidades.Autor;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Adrian E. Camus
 */
@Repository
public interface RepoAutor extends JpaRepositoryImplementation<Autor, String>{

}
