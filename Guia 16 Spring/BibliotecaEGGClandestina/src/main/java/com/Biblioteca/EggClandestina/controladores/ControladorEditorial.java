
package com.Biblioteca.EggClandestina.controladores;

import com.Biblioteca.EggClandestina.errores.ErrorServicio;
import com.Biblioteca.EggClandestina.servicios.ServicioEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorEditorial {
    
    
    @Autowired
    private ServicioEditorial servEditorial;
    
    @GetMapping("/creareditorial")
    public String registroEditorial() {
        return "creareditorial";
    }

    
    @PostMapping("/creareditorial")
    public String formularioEditorial(ModelMap modelo, @RequestParam String nombre) {
        
        try {
            
            servEditorial.crearEditorial(nombre);
            modelo.addAttribute("exito", "la editorial se ah guardado con exito");
            return "creareditorial";
            
            
        } catch (ErrorServicio e) {
            modelo.put("error", e.getMessage());
            return "creareditorial";
        }
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
