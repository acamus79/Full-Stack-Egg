/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.libreria.servicios;

import com.mza.libreria.entidades.*;
import com.mza.libreria.excepciones.MiExcepcion;
import com.mza.libreria.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import javax.transaction.Transactional;


/**
 * 
 * @author Adrian E. Camus
 */
@Service
public class LibroService {

    @Autowired
    private RepoLibro rLibro;
  
    @Transactional
    public void creaLibro( Long isbn,
                           String titulo,
                           Integer anio,
                           Integer ejemplares,
                           Autor autor,
                           Editorial editorial) throws Exception{
        
        Libro lib1 = new Libro();
        
        validar(titulo,isbn,anio,ejemplares,autor,editorial);
        
        lib1.setAlta(Boolean.TRUE);
        lib1.setAnio(anio);
        lib1.setAutor(autor);
        lib1.setEditorial(editorial);
        lib1.setEjemplares(ejemplares);
        lib1.setIsbn(isbn);
        lib1.setTitulo(titulo);
        
        rLibro.save(lib1);
                
    }
    
    
    public void validar(String titulo, Long isbn,
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
