/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package com.mza.biblioteca.controladores;

import com.mza.biblioteca.entidades.Autor;
import com.mza.biblioteca.entidades.Editorial;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.servicios.EditorialService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/borrar")
    public String borrarEditorial(ModelMap modelo, @RequestParam(required = false) String id) {

        if (id != null)
        {
            Optional<Editorial> optional = editorialServicio.opcionalPorId(id);
            if (optional.isPresent())
            {
                modelo.addAttribute("editorial", optional.get());
            } else
            {
                return "redirect:/editoriales/lista";
            }
        } else
        {
            return "bEditorial";
        }
        return "bEditorial";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/borrar")
    public String borrarEditorial(ModelMap modelo, RedirectAttributes redirectAttributes, @ModelAttribute Editorial editorial) {

        try
        {
            editorialServicio.borraEditorial(editorial);
            modelo.put("exito", "Se Modifico el estado de la Editorial correctamente");
            return "redirect:/editoriales/lista";

        } catch (MiExcepcion e)
        {
            modelo.put("error", "NO SE BORRO LA EDITORIAL");
            return "bEditorial";
        }

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/activar")
    public String activarEditorial(ModelMap modelo, @RequestParam(required = false) String id) {

        if (id != null)
        {
            Optional<Editorial> optional = editorialServicio.opcionalPorId(id);
            if (optional.isPresent())
            {
                modelo.addAttribute("editorial", optional.get());
            } else
            {
                return "redirect:/editoriales/lista";
            }
        } else
        {
            return "aEditorial";
        }
        return "aEditorial";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/activar")
    public String activarEditorial(ModelMap modelo, RedirectAttributes redirectAttributes, @ModelAttribute Editorial editorial) {

        try
        {
            editorialServicio.activaEditorial(editorial);
            modelo.put("exito", "La Editorial se activo correctamente");
            return "aEditorial";

        } catch (MiExcepcion e)
        {
            modelo.put("error", "NO SE ACTIVO LA EDITORIAL");
            return "aEditorial";
        }

    }

}
