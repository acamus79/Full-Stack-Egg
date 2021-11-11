package com.cursoegg.ejemplopersonas.repositories;

import com.cursoegg.ejemplopersonas.entidades.Ciudad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, String> {

  @Query("select p from Ciudad p where p.nombre LIKE :q")
  List<Ciudad> findAll(@Param("q") String q);
  
}
