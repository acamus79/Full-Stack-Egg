/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.controladores;

import com.mza.biblioteca.entidades.Usuario;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.servicios.UsuarioService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService sUsuario;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/editar-perfil")
    public String editarPerfil(HttpSession session,
            ModelMap modelo,
            @RequestParam String id) {
        Usuario login = (Usuario) session.getAttribute("usuariosession");
        if (login == null || !login.getId().equals(id))
        {
            return "redirect:/";
        }

        try
        {
            Usuario usuario = sUsuario.buscarPorId(id);
            modelo.addAttribute("perfil", usuario);
        } catch (MiExcepcion e)
        {
            modelo.addAttribute("error", e.getMessage());
        }
        return "inicio.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @PostMapping("/actualizar-perfil")
    public String registrar(HttpSession session, ModelMap modelo, 
            @RequestParam String id,
            @RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam String mail,
            @RequestParam String clave1,
            @RequestParam String clave2) {
        Usuario usuario = null;
        try
        {
            Usuario login = (Usuario) session.getAttribute("usuariosession");
            if (login == null || !login.getId().equals(id))
            {
                return "redirect:/inicio";
            }
            usuario = sUsuario.buscarPorId(id);
            sUsuario.modificar(id, nombre, apellido, mail, clave2, clave2);
            session.setAttribute("usuariosession", usuario);

        } catch (MiExcepcion e)
        {
            modelo.put("error", e.getMessage());
            modelo.put("perfil", usuario);
            return "perfil.html";
        }
        return null;
    }

}
