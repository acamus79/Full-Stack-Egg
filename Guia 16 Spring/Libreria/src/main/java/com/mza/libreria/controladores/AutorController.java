/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.libreria.controladores;

import com.mza.libreria.entidades.Autor;
import com.mza.libreria.servicios.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Adrian E. Camus
 */
@Controller
public class AutorController {
    @Autowired
    AutorService autorServicio;

    @RequestMapping(value = "/autores", method = RequestMethod.GET)
    public String launchPage(Model model) {
        List<Autor> autores = autorServicio.buscaAutor();
        model.addAttribute("autores", autores);

        return "autores";
    }

}
