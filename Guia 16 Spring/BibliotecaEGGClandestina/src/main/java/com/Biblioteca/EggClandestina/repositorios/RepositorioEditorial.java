
package com.Biblioteca.EggClandestina.repositorios;

import com.Biblioteca.EggClandestina.entidades.EntidadEditorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEditorial extends JpaRepository<EntidadEditorial, String>{
   //Aca Escribimos Querys personalizadas para nuestros servicios
}
