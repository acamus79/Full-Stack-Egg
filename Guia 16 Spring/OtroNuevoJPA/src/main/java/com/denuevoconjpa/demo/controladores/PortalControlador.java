/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.denuevoconjpa.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Adrian E. Camus
 */
@Controller
public class PortalControlador {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

}
