
package com.Biblioteca.EggClandestina.servicios;

import com.Biblioteca.EggClandestina.entidades.EntidadEditorial;
import com.Biblioteca.EggClandestina.errores.ErrorServicio;
import com.Biblioteca.EggClandestina.repositorios.RepositorioEditorial;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEditorial {
    
     @Autowired
    private RepositorioEditorial repoEditorial;
     
     
     
    public void crearEditorial(String nombre)throws ErrorServicio{
        
        if (nombre == null || nombre.length() < 3) {
            throw new ErrorServicio("La editorial no puede ser nula ni menor a 3 caracteres");
        }
        
        EntidadEditorial editorial = new EntidadEditorial();
        
        editorial.setAlta(Boolean.TRUE);
        editorial.setNombre(nombre);
        
        repoEditorial.save(editorial);
         
     }
    
    public List <EntidadEditorial> listaEditorial(){
        
        return repoEditorial.findAll();
    }
}
