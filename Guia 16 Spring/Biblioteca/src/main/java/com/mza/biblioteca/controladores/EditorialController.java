/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.biblioteca.controladores;

import com.mza.biblioteca.entidades.Editorial;
import com.mza.biblioteca.servicios.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/editoriales")
public class EditorialController {
    
    @Autowired
    EditorialService editorialServicio;

    @GetMapping("/lista")
    public String editoriales(ModelMap modelo) {
        List<Editorial> editoriales = editorialServicio.buscaEditoriales();
        modelo.addAttribute("editoriales", editoriales);
        return "editoriales.html";
    }
    
    @GetMapping("/registroEditorial")
    public String formulario() {
        return "nEditorial.html";
    }
    
    @PostMapping("/registroEditorial")
    public String registro(ModelMap modelo, @RequestParam String nombre) {
                       
        try
        {
            editorialServicio.creaEditorial(nombre);
            modelo.put("exito", "Registro Exitoso");
            return "nEditorial";
        } catch (Exception e)
        {
            modelo.put("error", "Falló el registro");
            return "nEditorial";
        }
        
    }

}
