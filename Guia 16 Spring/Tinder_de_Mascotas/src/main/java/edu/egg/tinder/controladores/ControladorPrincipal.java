/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package edu.egg.tinder.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Adrian E. Camus
 */
@Controller
@RequestMapping("/")
public class ControladorPrincipal {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}
