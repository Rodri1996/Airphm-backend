package com.unsam.proyecto.servicios;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.dominio.Usuario;
import com.unsam.proyecto.excepciones.ExcepcionElementoNoEncontrado;
import com.unsam.proyecto.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio; 
	
	public Usuario traerUsuarioPorId(Integer idUsuario) {
		try {
			return usuarioRepositorio.buscarUsuarioPorId(idUsuario);
		} catch (Exception e) {
			throw new ExcepcionElementoNoEncontrado("ERROR: El usuario no se ha encontrado");
		}
	}

	public void eliminarUsuario(Integer idUsuario) {
		Usuario usuarioAEliminar = traerUsuarioPorId(idUsuario);
		usuarioRepositorio.eliminarUsuario(usuarioAEliminar);
	}

	public void actualizarUsuario(Integer idUsuario, Usuario contenido) {
		Usuario usuarioAModificar = traerUsuarioPorId(idUsuario);
		usuarioRepositorio.actualizarUsuario(usuarioAModificar,contenido);
	}

}
