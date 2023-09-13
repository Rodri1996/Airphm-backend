package com.unsam.proyecto.repositorios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.unsam.proyecto.dominio.Usuario;

@Component
public class UsuarioRepositorio {
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	private UsuarioRepositorio() {
		Usuario usuario1 = new Usuario();
		usuario1.setIdUsuario(1);
		usuario1.setNombre("Rodrigo");
		Usuario usuario2 = new Usuario();
		usuario2.setIdUsuario(4);
		usuario2.setNombre("Pedro");
		usuarios.add(usuario1);
		usuarios.add(usuario2);
	}
	

	public Usuario buscarUsuarioPorId(Integer idUsuario) {		
		return usuarios.stream().filter(usuario->usuario.getIdUsuario()==idUsuario).findFirst().get();
	}

	
	public void eliminarUsuario(Usuario usuarioAEliminar) {
		usuarios.remove(usuarioAEliminar);
	}


	public void actualizarUsuario(Usuario usuarioAModificar,Usuario contenido) {
		usuarioAModificar.actualizar(contenido);
		
	}


}
