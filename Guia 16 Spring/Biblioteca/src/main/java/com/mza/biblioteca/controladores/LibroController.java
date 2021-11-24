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
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@PreAuthorize("isAuthenticated()")
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    LibroService libroServicio;

    @Autowired
    EditorialService editorialServicio;

    @Autowired
    AutorService autorServicio;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
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
            aux.setAnio(0);
            aux.setEjemplares(0);
            aux.setIsbn("Ingrese código");
            modelo.addAttribute("libro", aux);
        }

        //hermosamente uso los servicios para trerme una lista de autores y editoriales
        List<Autor> autores = autorServicio.buscaActivos();
        modelo.addAttribute("autores", autores);

        List<Editorial> editoriales = editorialServicio.buscaActivos();
        modelo.addAttribute("editoriales", editoriales);

        return "nLibro";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/registroLibro")
    public String registro(ModelMap modelo, RedirectAttributes redirectAttributes, @ModelAttribute Libro libro) {

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
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    public String listaLibros(ModelMap modelo, @RequestParam(required = false) String buscar) {
        //si el parametro "buscar" NO es nulo, agrega al modelo una lista de libros buscados
        if (buscar != null)
        {
            modelo.addAttribute("libros", libroServicio.listaBuscada(buscar));

        } else //si no viene parametro de busqueda, agrega al modelo una lista con todos los libros
        {
            modelo.addAttribute("libros", libroServicio.listaLibro());
        }
        return "listalibros";
    }

    @GetMapping("/cardboard")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    public String libro (ModelMap modelo, @RequestParam(required = false) String buscar) {
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


    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/borrar")
    public String borrarLibro(ModelMap modelo, @RequestParam(required = false) String id) {
        
        if (id != null)
        {
            Optional<Libro> optional = libroServicio.buscarPorId(id);
            if (optional.isPresent())
            {
                modelo.addAttribute("libro", optional.get());
            } else
            {
                return "bLibro";
            }
        } else
        {
            return "bLibro";
        }
        return "bLibro";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/borrar")
    public String borrarLibro(ModelMap modelo, RedirectAttributes redirectAttributes, @ModelAttribute Libro libro) {

        try
        {
            libroServicio.bajaLibro(libro);
            modelo.put("exito", "El libro se dio de baja");
            //return "redirect:/libros/lista";
            return "bLibro";
        } catch (MiExcepcion e)
        {
            modelo.put("error", "NO SE BORRO EL LIBRO");
            return "bLibro";
        }

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/activar")
    public String activarLibro(ModelMap modelo, @RequestParam(required = false) String id) {
        
        if (id != null)
        {
            Optional<Libro> optional = libroServicio.buscarPorId(id);
            if (optional.isPresent())
            {
                modelo.addAttribute("libro", optional.get());
            } else
            {
                return "aLibro";
            }
        } else
        {
            return "aLibro";
        }
        return "aLibro";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/activar")
    public String activarLibro(ModelMap modelo, RedirectAttributes redirectAttributes, @ModelAttribute Libro libro) {

        try
        {
            libroServicio.altaLibro(libro);
            modelo.put("exito", "El libro activo correctamente");
            //return "redirect:/libros/lista";
            return "aLibro";
        } catch (MiExcepcion e)
        {
            modelo.put("error", "NO SE BORRO EL LIBRO");
            return "aLibro";
        }

    }
    
}
