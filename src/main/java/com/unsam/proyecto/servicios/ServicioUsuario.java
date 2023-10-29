package com.unsam.proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.DTO.UsuarioRegistradoDTO;
import com.unsam.proyecto.repositorios.RepositorioUsuarios;

@Service
public class ServicioUsuario {

	@Autowired
	private RepositorioUsuarios repositorioUsuarios;

	public UsuarioRegistradoDTO validarInicioSesion(String nombreUsuario, String contraseña) {
		Integer idUsuario = repositorioUsuarios.validarUsuario(nombreUsuario,contraseña);
		return UsuarioRegistradoDTO.crear(idUsuario);
	}

}
