/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package edu.egg.tinder.controladores;

import edu.egg.tinder.errores.ErrorServicio;
import edu.egg.tinder.servicios.ServicioUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@RequestMapping("/")
public class ControladorPrincipal {
    
    @Autowired
    ServicioUsuario sUsuario;
    

    @GetMapping("/")
    public String index() {
        return "index.html";
    }
    
    @GetMapping("/login")
    public String login() {
        return "login.html";
    }
    
    @GetMapping("/registro")
    public String registro() {
        return "registro.html";
    }
    
    @PostMapping("/registrar")
    public String registrar(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String mail, @RequestParam String clave, @RequestParam String clave2) {
//        System.out.println("nombre "+nombre);
//        System.out.println("nombre "+apellido);
//        System.out.println("nombre "+mail);
//        System.out.println("nombre "+clave);
//        System.out.println("nombre "+clave2);
       
        try
        {
            sUsuario.registrar(null, nombre, apellido, mail, clave);
        } catch (ErrorServicio ex)
        {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            return "registro.html";
        }
        return "index.html";
    }
    
    
    
}
