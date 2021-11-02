/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.libreria.servicios;

import com.mza.libreria.entidades.Autor;
import com.mza.libreria.entidades.Editorial;
import com.mza.libreria.entidades.Libro;
import com.mza.libreria.excepciones.MiExcepcion;
import com.mza.libreria.repositorios.RepoEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Adrian E. Camus
 */
@Service
public class EditorialService {

    @Autowired
    private RepoEditorial rEdito;

    public void creaEditorial(String nombre, List<Libro> libros) throws MiExcepcion {

        validar(nombre);

        Editorial edito = new Editorial();

        if(libros.isEmpty()){
            List<Libro> listLibros = new ArrayList<Libro>();
            edito.setLibros(listLibros);
        }else{
            edito.setLibros(libros);}

        edito.setAlta(Boolean.TRUE);
        edito.setNombre(nombre);

        rEdito.save(edito);
    }


    private void validar(String nombre) throws MiExcepcion{

        if(nombre.isEmpty() || nombre == null){
            throw new MiExcepcion("Nombre no valido");
        }

    }

}
