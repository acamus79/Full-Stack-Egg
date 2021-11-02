/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.libreria.servicios;

import com.mza.libreria.entidades.*;
import com.mza.libreria.excepciones.MiExcepcion;
import com.mza.libreria.repositorios.RepoLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;


/**
 * 
 * @author Adrian E. Camus
 */
@Service
public class LibroService {

    @Autowired
    private RepoLibro rLibro;


    public void creaLibro(Long isbn,
                           String titulo,
                           Integer anio,
                           Integer ejemplares,
                           Autor autor,
                           Editorial editorial) throws MiExcepcion{

    }

    private void validar(String titulo, Long isbn,
                         Integer anio, Integer ejemplares,
                         Autor autor, Editorial editorial) throws MiExcepcion {

        if(titulo.isEmpty() || titulo == null){
            throw new MiExcepcion("Titulo no valido");
        }
        if (isbn == null || isbn.toString().length()!=13){
            throw new MiExcepcion("ISBN no valido");
        }
        if (anio.toString().length()!=4 || anio< Calendar.YEAR){
            throw new MiExcepcion("Error en el AÑO");
        }
        if (ejemplares==0 || ejemplares <0){
            throw new MiExcepcion("Error en los Ejemplares");
        }
        if(autor.toString().isEmpty() || autor == null){
            //aca deberia llamar un metodo que busque Autores
            throw new MiExcepcion("Autor no valido");
        }
        if (editorial.toString().isEmpty() || editorial == null){
            //aca deberia llamar un metodo que busque editoriales
            throw new MiExcepcion("Editorial no valida");
        }

    }

}
