
package com.Biblioteca.EggClandestina.controladores;

import com.Biblioteca.EggClandestina.errores.ErrorServicio;
import com.Biblioteca.EggClandestina.servicios.ServicioAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorAutor {
    
    @Autowired
    private ServicioAutor servAutor;
    
    @GetMapping("/crearautor")
    public String registroAutor() {
        return "crearautor";
    }

    
    @PostMapping("/crearautor")
    public String formularioAutor(ModelMap modelo , @RequestParam String nombre) {
        
        try {
            
            servAutor.crearAutor(nombre);
            modelo.addAttribute("exito", "el autor se ah creado con exito");
            return "crearautor";
            
        } catch (ErrorServicio e) {
            modelo.put("error", e.getMessage());
            return "crearautor";
        }
    }
    
    
    @GetMapping("/autor")
    public String listarTodos(){
        return "autor";
    }

    @PostMapping("/autor")
    public String listaAutor(){
        return "autor";
    }
    
     @GetMapping("/editarautor")
    public String editarAutor(){
        return "editarautor";
    }
    
    @PostMapping("/editarautor")
    public String editarAut(){
        return "editarautor";
    }
}
