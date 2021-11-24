package edu.egg.library.repository;

import edu.egg.library.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

    @Modifying
    @Query("UPDATE Libro l SET l.alta = true WHERE l.id = :id")
    void habilitar(@Param("id") Integer id);

    List<Libro> findByAutor_NombreAndAutor_Apellido(String nombre, String apellido);

    List<Libro> findByAutor_Nombre(String nombre);

    List<Libro> findByAutor_Apellido(String apellido);

    List<Libro> findByEditorial_Nombre(String nombre);

    boolean existsByTitulo(String titulo);
}
