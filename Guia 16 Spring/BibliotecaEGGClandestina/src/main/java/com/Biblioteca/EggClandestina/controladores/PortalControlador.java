
package com.Biblioteca.EggClandestina.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador {
    // Mapping al Index(Ruta Principal a mi web)
    @GetMapping("/")
    public String index(ModelMap modelo){
    return "index.html";
    }
}
