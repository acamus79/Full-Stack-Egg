package com.proyecto.demo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;		
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.demo.entidades.Usuario;
import com.proyecto.demo.servicios.UsuarioServicio;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired UsuarioServicio usuarioServicio;
	
	@GetMapping("/dashboard")
	public String inicioAdmin(ModelMap modelo) {
		
		List<Usuario> usuarios = usuarioServicio.todosLosUsuarios();
		
		modelo.put("usuarios", usuarios);
		
		return "inicioAdmin";
	}
	
	@GetMapping("/habilitar/{id}")
	public String habilitar(ModelMap modelo, @PathVariable String id) {
		try {
			usuarioServicio.habilitar(id);
			return "redirect:/admin/dashboard";
		}catch(Exception e) {
			modelo.put("error", "No fue posible habilitar");
			return "inicioAdmin";
		}
	}
	
	@GetMapping("/deshabilitar/{id}")
	public String deshabilitar(ModelMap modelo, @PathVariable String id) {
		try {
			usuarioServicio.deshabilitar(id);
			return "redirect:/admin/dashboard";
		}catch(Exception e) {
			modelo.put("error", "No fue posible deshabilitar");
			return "inicioAdmin";
		}
	}
	
	@GetMapping("/cambiar_rol/{id}")
	public String cambiarRol(ModelMap modelo, @PathVariable String id) {
		try {
			usuarioServicio.cambiarRol(id);
			modelo.put("exito", "Rol modificado con Exito!");
			return "redirect:/admin/dashboard";
		}catch(Exception e) {
			modelo.put("error", "No fue posible reasignar el rol");
			return "inicioAdmin";
		}
	}
	
	
}
