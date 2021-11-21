package com.mza.biblioteca.controladores;

import com.mza.biblioteca.entidades.Usuario;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.servicios.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class MainControlller {
    
    @Autowired
    private UsuarioService sUsuario;

    @GetMapping("/")
    public String index(ModelMap modelo) {
        List<Usuario> usuariosActivos = sUsuario.todosLosUsuarios();
        //Recordar que utilizo el modelo,para viajar con la llave usuarios al HTML la lista usuariosactivos
        modelo.addAttribute("usuarios", usuariosActivos);
        return "index.html";
    }
    
    @GetMapping("/registro")
    public String registro() {
        return "nUsuario";
    }

    @PostMapping("/registro")
    public String registrar(ModelMap modelo, 
            @RequestParam String nombre, 
            @RequestParam String apellido, 
            @RequestParam String email, 
            @RequestParam String clave1, 
            @RequestParam String clave2) {

        try {
            sUsuario.registrar(nombre, apellido, email, clave1, clave2);
        } catch (MiExcepcion ex) {
            
            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("apellido", apellido);
            modelo.put("email", email);
            modelo.put("clave1", clave1);
            modelo.put("clave2", clave2);
            return "nUsuario";
        }
        modelo.put("titulo", "Bienvenido al Sistema de Gestion de Biblioteca");
        modelo.put("descripcion", "Tu usuario fue registrado correctamente");
        return "registro-exitoso";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/inicio")
    public String inicio(ModelMap modelo) {
    	
    	List<Usuario> usuarios = sUsuario.todosLosUsuarios();
    	
    	modelo.addAttribute("usuarios", usuarios);
    	
        return "inicio.html";
    }

    @GetMapping("/login")
    public String login(ModelMap modelo, @RequestParam(required = false) String error, @RequestParam(required = false) String logout) {
        if (error != null) {
            modelo.put("error", "Usuario o clave incorrectos");
        }
        if (logout != null) {
            modelo.put("logout", "Ha salido correctamente.");
        }
        return "login.html";
    }

    
    

}
