package edu.egg.library.repository;

import edu.egg.library.entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer> {

    @Modifying
    @Query("UPDATE Editorial e SET e.alta = true WHERE e.id = :id")
    void habilitar(@Param("id") Integer id);

    boolean existsByNombre(String nombre);
}
