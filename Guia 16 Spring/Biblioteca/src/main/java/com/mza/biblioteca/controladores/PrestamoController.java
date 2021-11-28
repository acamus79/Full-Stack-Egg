/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.controladores;

import com.mza.biblioteca.entidades.Prestamo;
import com.mza.biblioteca.entidades.Usuario;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.servicios.LibroService;
import com.mza.biblioteca.servicios.PrestamoService;
import com.mza.biblioteca.servicios.UsuarioService;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Adrian E. Camus
 */
@Controller
@RequestMapping("/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService sPrestamo;

    @Autowired
    private UsuarioService sUsuario;

    @Autowired
    private LibroService sLibro;

    /**
     * Controlador GET del formulario para efectuar un nuevo préstamo y
     * persistirlo en la base de datos Solo pueden acceder los Usuarios activos,
     * y solo a los libros activos y con ejemplares restantes.
     *
     * @param modelo ModelMap
     * @param session
     * @param id
     * @return solicitud.html
     */
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/solicitud/{id}")
    public String solicitud(ModelMap modelo, HttpSession session, @PathVariable String id) {

        //mediante la HttpSession obtengo el Usuario que esta haciendo el prestamo
        Usuario usuario = (Usuario) session.getAttribute("usuariosession");

        //inyecto al modelo un Libro y un Usuario y un Prestamo
        try
        {
            modelo.addAttribute("libro", sLibro.buscarPorId(id));
            modelo.addAttribute("usuario", sUsuario.buscarPorId(usuario.getId()));

        } catch (MiExcepcion e)
        {
            modelo.put("error", "Hubo un problema: " + e.getMessage());
        }
        return "solicitud";
    }

    /**
     * Controlador GET que recibe un solo argumentos e intenta
     * persistir un Objeto Prestamo en la Base de Datos
     *
     * @param modelo ModelMap
     * @param session
     * @param id
     * @return solicitud.html
     */
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/confirmacion/{id}")
    public String guardarSolicitud(ModelMap modelo, HttpSession session, @PathVariable String id) {
        
        SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
        //mediante la HttpSession obtengo el Usuario que esta haciendo el prestamo
        Usuario usuario = (Usuario) session.getAttribute("usuariosession");
        
        try
        {
            modelo.addAttribute("libro", sLibro.buscarPorId(id));
            modelo.addAttribute("usuario", sUsuario.buscarPorId(usuario.getId()));
            //Intento persistir el nuevo Objeto Prestamo usando un método de la Clase Service
            Prestamo prestamo = sPrestamo.creaPrestamo(id, usuario.getId());
            modelo.addAttribute("prestamo", prestamo);
            modelo.addAttribute("exito", "¡Reservamos tu libro, pasa a retirarlo! con el código " + prestamo.getId());

        } catch (MiExcepcion e)
        {
            //Inyección del mensaje de error
            modelo.put("error", "¡Algo salió mal! " + e.getMessage());
        }
        return "prestamo";
    }


    /**
     * Controlador GET que devuelve a la vista un modelo con el listado de todos
     * los préstamos no importa el estado, solo se puede acceder si se posee el
     * ROL ADMIN
     *
     * @param modelo ModelMap
     * @return listaPrestamos.html
     */
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/lista")
    public String listado_prestamos(ModelMap modelo) {
        //Inyección del listado con todos los Prestamos dentro del MOdelMap
        try
        {
            List<Prestamo> prestamos = sPrestamo.listaPrestamos();
            modelo.addAttribute("prestamos", prestamos);
        } catch (MiExcepcion ex)
        {
            modelo.put("error", "Hubo un problema: " + ex.getMessage());
        }
        return "prestamos/lista";
    }

}
