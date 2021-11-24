/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.repositorios;

import com.mza.biblioteca.entidades.Autor;
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
public interface RepoAutor extends JpaRepositoryImplementation<Autor, String> {

    @Query("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    public List<Autor> buscaPorNombre(@Param("nombre") String nombre);

    @Query("SELECT a FROM Autor a Where a.alta = true")
    public List<Autor> buscaActivos();

}

/*
   @Query("SELECT c FROM Usuario c WHERE c.mail = :mail")
    public Usuario buscarPorMail(@Param("mail") String id);

@Query("SELECT a FROM Autor a WHERE a.nombre LIKE %?1%")
    public List<Autor> buscaPorNombre(@Param("nombre") String nombre);


    @Query ("SELECT a FROM Autor a")
            public List<Autor> buscaAutor();
 */
