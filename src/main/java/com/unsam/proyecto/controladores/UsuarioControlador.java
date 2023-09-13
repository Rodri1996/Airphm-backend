package com.unsam.proyecto.controladores;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unsam.proyecto.dominio.Usuario;
import com.unsam.proyecto.servicios.UsuarioServicio;

@RestController
@RequestMapping("/api/v1")
public class UsuarioControlador {

	@Autowired
	private UsuarioServicio usuarioServicio;
	
	
	
	@GetMapping("/saludo")
	public String saludar() {
		return "Hola!!";
	}
	
	@GetMapping("/{idUsuario}")
	public Usuario traerUsuarioPorId(@PathVariable Integer idUsuario) {
		return usuarioServicio.traerUsuarioPorId(idUsuario);
	}
	
	@DeleteMapping("/eliminar/{idUsuario}")
	public void eliminarUsuario(@PathVariable Integer idUsuario) {
		usuarioServicio.eliminarUsuario(idUsuario);
	}
	
	@PutMapping("/actualizar/{idUsuario}")
	public void actualizarUsuario(@PathVariable Integer idUsuario,@RequestBody Usuario contenido) {
		usuarioServicio.actualizarUsuario(idUsuario,contenido);
	}
	
}
