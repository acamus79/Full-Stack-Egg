package com.Biblioteca.EggClandestina.controladores;

import com.Biblioteca.EggClandestina.entidades.EntidadAutor;
import com.Biblioteca.EggClandestina.entidades.EntidadEditorial;
import com.Biblioteca.EggClandestina.entidades.EntidadLibro;
import com.Biblioteca.EggClandestina.errores.ErrorServicio;
import com.Biblioteca.EggClandestina.servicios.ServicioAutor;
import com.Biblioteca.EggClandestina.servicios.ServicioEditorial;
import com.Biblioteca.EggClandestina.servicios.ServicioLibro;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ControladorLibro {

    @Autowired
    private ServicioLibro servLibro;
    
    @Autowired
    private ServicioAutor servAutor;
    
    @Autowired
    private ServicioEditorial servEditorial;
    
    @GetMapping("/crearlibro")
    public String registroLibro(ModelMap modelo,@RequestParam(required=false) String id) {
        
        List <EntidadAutor> autores = servAutor.listaAutor();
        List <EntidadEditorial> editoriales = servEditorial.listaEditorial();
        
        modelo.addAttribute("listaa",autores);
        modelo.addAttribute("listae",editoriales);
        
        if (id != null) {
            
            servLibro.buscarPorId(id);
            Optional <EntidadLibro> op = servLibro.buscarPorId(id);
            
            if (op.isPresent()) {
                modelo.addAttribute("libro", op.get());
            }else{
                return "crearlibro";
            }
            
            
        } else {
            EntidadLibro aux = new EntidadLibro();
            aux.setAlta(Boolean.TRUE);
            aux.setAnio(0);
            aux.setEmplares(null);
            aux.setAutor(null);
            aux.setEditorial(null);
            aux.setIsbn("Ingrese el ISBN");
            aux.setTitulo("Ingrese el titulo del Nuevo Libro");
            modelo.addAttribute("pepe",aux);
        } 
        
        
        
        return "crearlibro";
    }

    
    @PostMapping("/crearlibro")
    public String formularioLibro(ModelMap modelo,RedirectAttributes redirectAtr,@ModelAttribute EntidadLibro libro) throws ErrorServicio {
        
        try {
            
            servLibro.crearLibro(libro);
            modelo.put("exito", "Libro guardado exitosamente.");
            return  "redirect:/crearlibro";
            
        } catch (ErrorServicio e) {
            
            modelo.put("error", e.getMessage());
            return "redirect:/crearlibro";
        }
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
