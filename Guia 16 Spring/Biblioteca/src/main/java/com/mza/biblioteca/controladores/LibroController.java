/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.controladores;

import com.mza.biblioteca.entidades.Autor;
import com.mza.biblioteca.entidades.Editorial;
import com.mza.biblioteca.entidades.Libro;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.servicios.AutorService;
import com.mza.biblioteca.servicios.EditorialService;
import com.mza.biblioteca.servicios.LibroService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Adrian E. Camus
 */
@Controller
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    LibroService libroServicio;
    
    @Autowired
    EditorialService editorialServicio;
    
    @Autowired
    AutorService autorServicio;

    @GetMapping("/registroLibro")
    public String registro(ModelMap modelo, @RequestParam(required = false) String id) {

        if (id != null)
        {
            Optional<Libro> optional = libroServicio.buscarPorId(id);
            if (optional.isPresent())
            {
                modelo.addAttribute("libro", optional.get());
                
            } else
            {
                return "redirect:/libros/lista";
            }
        } else
        {
            Libro aux = new Libro();
            aux.setAlta(Boolean.TRUE);
            aux.setTitulo("Título del Libro");
            aux.setAnio(0000);
            aux.setEjemplares(0);
            aux.setIsbn("Ingrese código");
            modelo.addAttribute("libro", aux);
        }

        //hermosamente uso los servicios para trerme una lista de autores y editoriales
        List<Autor> autores = autorServicio.buscaAutores();
        modelo.addAttribute("autores", autores);

        List<Editorial> editoriales = editorialServicio.buscaEditoriales();
        modelo.addAttribute("editoriales", editoriales);

        return "nLibro";
    }

    @PostMapping("/registroLibro")
    public String registro(ModelMap modelo, RedirectAttributes redirectAttributes, @ModelAttribute Libro libro) {
        System.out.println("ACA ESTOY INGRESANDO AL REGISTRO LIBRO");
        try
        {
            libroServicio.creaLibro(libro);
            modelo.put("exito", "Registro Exitoso");
            return "redirect:/libros/lista";

        } catch (MiExcepcion e)
        {
            modelo.put("error", e.getMessage());
            return "nLibro";
        }

    }
    
    @GetMapping("/lista")
    public String listaLibros(ModelMap modelo, @RequestParam(required = false) String buscar) {
        //si el parametro "buscar" NO es nulo, agrega al modelo una lista de libros buscados
        if (buscar != null)
        {
            modelo.addAttribute("libros", libroServicio.listaBuscada(buscar));
        } else //si no viene parametro de busqueda, agrega al modelo una lista con todos los libros
        {
            modelo.addAttribute("libros", libroServicio.listaLibro());
        }
        return "libros";
    }

    @GetMapping("/borrar")
    public String borrarLibro(ModelMap modelo, @RequestParam(required = false) String id){
    System.out.println("ACA ESTOY INGRESANDO AL GET");
        if (id != null)
        {
            Optional<Libro> optional = libroServicio.buscarPorId(id);
            if (optional.isPresent())
            {
                modelo.addAttribute("libro", optional.get());
            } else
            {
                return "redirect:/libros/lista";
            }
        } else
        {
            return "borrar";
        }
        return "borrar";
    }

    @PostMapping("/borrar")
    public String borrarLibro(ModelMap modelo, RedirectAttributes redirectAttributes, @ModelAttribute Libro libro){
                        
        try
        {
            libroServicio.bajaLibro(libro);
            modelo.put("exito", "El libro se dio de baja");
            return "redirect:/libros/lista";

        } catch (MiExcepcion e)
        {
            modelo.put("error", "NO SE BORRO EL LIBRO");
            return "borrar";
        }

    }

}
