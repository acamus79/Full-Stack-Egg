
package com.Biblioteca.EggClandestina.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorEditorial {
    @GetMapping("/creareditorial")
    public String registroEditorial() {
        return "creareditorial";
    }

    
    @PostMapping("/creareditorial")
    public String formularioEditorial() {
        return "creareditorial";
    }
    
    @GetMapping("/editorial")
    public String listarTodos(){
        return "editorial";
    }

    @PostMapping("/editorial")
    public String listaEditorial(){
        return "editorial";
    }
    
     @GetMapping("/editareditorial")
    public String editarEditorial(){
        return "editareditorial";
    }
    
    @PostMapping("/editareditorial")
    public String editarEdit(){
        return "editareditorial";
    }
}
