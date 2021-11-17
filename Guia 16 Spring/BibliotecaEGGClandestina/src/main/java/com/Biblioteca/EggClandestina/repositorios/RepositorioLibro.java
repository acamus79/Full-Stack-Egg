
package com.Biblioteca.EggClandestina.repositorios;

import com.Biblioteca.EggClandestina.entidades.EntidadLibro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository/*Declarando como repositorio y extendiendo JpaRepository tenemos ya el 
CRUD (Create[Crear],Read[Leer],Update[Actualizad],Delete[Borrar]) completo*/
public interface RepositorioLibro extends JpaRepository<EntidadLibro, String> {
    /*Aca declaramos query personalizadas Ejemplo:
  @Query("select p from EntidadLibro p where p.titulo LIKE :q")
  List<EntidadLibro> findAll(@Param("q") String q);*/
}
