/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.libreria.repositorios;

import com.mza.libreria.entidades.Autor;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Adrian E. Camus
 */
@Repository
public interface RepoAutor extends JpaRepositoryImplementation<Autor, String>{
            @Query ("SELECT a FROM Autor")
            public List<Autor> buscaAutor();
}

/*
   @Query ("SELECT a FROM Autor a WHERE a.nombre LIKE %?1%")
    public List<Autor> buscarPorAutor(@Param("nombre") String nombre);
*/
