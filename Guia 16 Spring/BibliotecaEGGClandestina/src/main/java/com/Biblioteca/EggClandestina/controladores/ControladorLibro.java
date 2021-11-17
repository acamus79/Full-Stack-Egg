package com.Biblioteca.EggClandestina.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorLibro {

    @GetMapping("/crearlibro")
    public String registroLibro() {
        return "crearlibro";
    }

    
    @PostMapping("/crearlibro")
    public String formularioLibro() {
        return "crearlibro";
    }
    
    
    @GetMapping("/libro")
    public String listarTodos(){
        return "libro";
    }

    @PostMapping("/libro")
    public String listaLibro(){
        return "libro";
    }
    
    @GetMapping("/editarlibro")
    public String editarLibro(){
        return "editarlibro";
    }
    
    @PostMapping("/editarlibro")
    public String editar(){
        return "editarlibro";
    }
}
