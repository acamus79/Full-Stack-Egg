/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.controladores;

import com.mza.biblioteca.entidades.Autor;
import com.mza.biblioteca.servicios.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Adrian E. Camus
 */
@Controller
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    AutorService autorServicio;

    @GetMapping("/autores")
    public String autores(ModelMap modelo) {
        List<Autor> autores = autorServicio.buscaAutores();
        modelo.addAttribute("autores", autores);
        return "autores.html";
    }
    
    @GetMapping("/registroAutor")
    public String formulario() {
        return "nAutor.html";
    }
    
    @PostMapping("/registroAutor")
    public String registro(ModelMap modelo, @RequestParam String nombre) {
                       
        try
        {
            autorServicio.creaAutor(nombre);
            modelo.put("exito", "Registro Exitoso");
            return "nAutor";
        } catch (Exception e)
        {
            modelo.put("error", "Falló el registro");
            return "nAutor";
        }
        
    }
}
