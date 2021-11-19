
package com.Biblioteca.EggClandestina.servicios;

import com.Biblioteca.EggClandestina.entidades.EntidadAutor;
import com.Biblioteca.EggClandestina.errores.ErrorServicio;
import com.Biblioteca.EggClandestina.repositorios.RepositorioAutor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioAutor {
    
    
    @Autowired
    private RepositorioAutor repoAutor;
    
    
    public void crearAutor(String nombre)throws ErrorServicio{
        
        if (nombre == null || nombre.length() < 3) {
            throw new ErrorServicio("El autor no puede ser nulo ni menor a 3 caracteres");
        }
        
        EntidadAutor autor = new EntidadAutor();
        
        autor.setAlta(Boolean.TRUE);
        autor.setNombre(nombre);
        
        repoAutor.save(autor);
         
     }
    
    public List <EntidadAutor> listaAutor(){
        
        return repoAutor.findAll();
    }
}
