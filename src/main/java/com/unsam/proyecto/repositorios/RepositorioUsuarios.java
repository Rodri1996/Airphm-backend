package com.unsam.proyecto.repositorios;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.unsam.proyecto.dominio.Usuario;

@Component
public class RepositorioUsuarios {

	private ArrayList<Usuario> usuariosRegistrados = new ArrayList<Usuario>();
	public Integer id=0;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer validarUsuario(String nombreUsuario, String contraseña) {
		return buscarUsuarioRegistrado(nombreUsuario,contraseña);
	}

	private Integer buscarUsuarioRegistrado(String nombreUsuario, String contraseña) {
		Usuario usuarioEncontrado = null;
		for (Usuario usuario : usuariosRegistrados ) {
			if(usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña)) {
				usuarioEncontrado = usuario;
			}
		}
		return usuarioEncontrado.getId();
	}

	public void guardar(Usuario usuario) {
		id+=1;
		usuario.setId(id);
		usuariosRegistrados.add(usuario);
	}

}
