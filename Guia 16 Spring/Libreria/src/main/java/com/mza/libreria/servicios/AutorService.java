/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.libreria.servicios;

import com.mza.libreria.entidades.Autor;
import com.mza.libreria.entidades.Libro;
import com.mza.libreria.excepciones.MiExcepcion;
import com.mza.libreria.repositorios.RepoAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Adrian E. Camus
 */
@Service
public class AutorService {
    @Autowired
    private RepoAutor aRepo;

    public void creaAutor(String nombre, List<Libro> libros) throws MiExcepcion{
        
        validar(nombre);

        Autor autor = new Autor();
        if(libros.isEmpty()){
            List<Libro> listaLibros = new ArrayList<Libro>();
            autor.setLibros(listaLibros);
        }else{
            autor.setLibros(libros);}

        autor.setAlta(Boolean.TRUE);
        autor.setNombre(nombre);

        aRepo.save(autor);
    }


    private void validar(String nombre) throws MiExcepcion{

        if(nombre.isEmpty() || nombre == null){
            throw new MiExcepcion("Nombre no valido");
        }

    }
}
