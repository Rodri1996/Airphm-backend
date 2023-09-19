package com.unsam.proyecto.servicios;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.dominio.Usuario;
import com.unsam.proyecto.excepciones.CredencialesInvalidasExcepcion;
import com.unsam.proyecto.excepciones.ExcepcionElementoNoEncontrado;
import com.unsam.proyecto.repositorios.UsuarioRepositorio;

import DTO.UsuarioLogeadoDTO;


@Service
public class UsuarioServicio {

	@Autowired
	private UsuarioRepositorio repositorioUsuario; 
	
	public Usuario traerUsuarioPorId(Integer idUsuario) {
		try {
			return repositorioUsuario.findById(idUsuario).get();
		} catch (Exception e) {
			throw new ExcepcionElementoNoEncontrado("ERROR: El usuario no se ha encontrado");
		}
	}

	public void eliminarUsuario(Integer idUsuario) {
		Usuario usuarioAEliminar = traerUsuarioPorId(idUsuario);
		repositorioUsuario.delete(usuarioAEliminar);
	}

	public void actualizarUsuario(Integer idUsuario, Usuario contenido) {
		Usuario usuarioAModificar = traerUsuarioPorId(idUsuario);
		usuarioAModificar.actualizar(contenido);
		repositorioUsuario.save(usuarioAModificar);
	}

	public UsuarioLogeadoDTO validarInicioSesion(String usuario, String contraseña) {
		try {			
			Usuario usuarioEncontrado = repositorioUsuario.findByUsuarioAndContraseña(usuario,contraseña);
			return new UsuarioLogeadoDTO(usuarioEncontrado.getIdUsuario());
		} catch (Exception error) {
			throw new CredencialesInvalidasExcepcion("No se ha encontrado un usuario con esas credenciales.Pruebe de nuevo con otras");
		}
	}
}

