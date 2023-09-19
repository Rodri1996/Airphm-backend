package com.unsam.proyecto.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unsam.proyecto.dominio.Usuario;
import com.unsam.proyecto.servicios.UsuarioServicio;

import DTO.UsuarioLogeadoDTO;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {

	@Autowired
	private UsuarioServicio servicioUsuario;
	
	@GetMapping("/saludo")
	public String saludar() {
		return "Hola!!";
	}
	
	@GetMapping("/login")
	public UsuarioLogeadoDTO validarInicioSesion(
			@RequestParam String usuario, 
			@RequestParam String contraseña) {
		return servicioUsuario.validarInicioSesion(usuario,contraseña);
	}
	
	@GetMapping("/{idUsuario}")
	public Usuario traerUsuarioPorId(@PathVariable Integer idUsuario) {
		return servicioUsuario.traerUsuarioPorId(idUsuario);
	}
	
	@DeleteMapping("/eliminar/{idUsuario}")
	public void eliminarUsuario(@PathVariable Integer idUsuario) {
		servicioUsuario.eliminarUsuario(idUsuario);
	}
	
	@PutMapping("/actualizar/{idUsuario}")
	public void actualizarUsuario(@PathVariable Integer idUsuario,@RequestBody Usuario contenido) {
		servicioUsuario.actualizarUsuario(idUsuario,contenido);
	}
	
}
