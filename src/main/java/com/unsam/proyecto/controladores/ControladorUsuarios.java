package com.unsam.proyecto.controladores;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unsam.proyecto.DTO.UsuarioRegistradoDTO;
import com.unsam.proyecto.servicios.ServicioUsuario;

import DTO.HospedajeCardDTO;

@RestController
//TODO: averiguar que hace el cross origin.Con esto se eliminaron los bloqueos por politicas de cors
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
public class ControladorUsuarios {
	
	@Autowired
	private ServicioUsuario servicioUsuarios;

	@GetMapping("/validar")
	public UsuarioRegistradoDTO inicioSesion(
			@RequestParam String nombreUsuario,
			@RequestParam String contraseña) {
		return servicioUsuarios.validarInicioSesion(nombreUsuario,contraseña);
	}
}
