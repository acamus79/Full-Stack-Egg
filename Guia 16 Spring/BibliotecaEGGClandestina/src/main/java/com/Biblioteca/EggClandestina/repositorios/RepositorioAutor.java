
package com.Biblioteca.EggClandestina.repositorios;

import com.Biblioteca.EggClandestina.entidades.EntidadAutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAutor extends JpaRepository<EntidadAutor, String> {
    //Aca Escribimos Querys personalizadas para nuestros servicios
}
