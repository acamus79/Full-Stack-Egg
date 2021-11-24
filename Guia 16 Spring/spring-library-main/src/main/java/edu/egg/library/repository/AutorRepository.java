package edu.egg.library.repository;

import edu.egg.library.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

    @Modifying
    @Query("UPDATE Autor a SET a.alta = true WHERE a.id = :id")
    void habilitar(@Param("id") Integer id);

    boolean existsByNombreAndApellido(String nombre, String apellido);
}
