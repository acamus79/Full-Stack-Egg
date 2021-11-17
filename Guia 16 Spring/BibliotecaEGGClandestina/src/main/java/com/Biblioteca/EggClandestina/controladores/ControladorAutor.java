
package com.Biblioteca.EggClandestina.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorAutor {
    
    @GetMapping("/crearautor")
    public String registroAutor() {
        return "crearautor";
    }

    
    @PostMapping("/crearautor")
    public String formularioAutor() {
        return "crearautor";
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
