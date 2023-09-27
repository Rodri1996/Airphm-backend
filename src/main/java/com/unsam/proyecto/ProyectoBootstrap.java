package com.unsam.proyecto;

import java.time.LocalDate;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.dominio.Usuario;
import com.unsam.proyecto.repositorios.HospedajeRepositorio;
import com.unsam.proyecto.repositorios.UsuarioRepositorio;

@Service
public class ProyectoBootstrap implements InitializingBean{

	Usuario usuario1;
	Usuario usuario2;
	
	Hospedaje hospedaje1;
	Hospedaje hospedaje2;
	Hospedaje hospedaje3;
	
	@Autowired
	UsuarioRepositorio unUsuarioRepositorio;
	@Autowired
	HospedajeRepositorio unHospedajeRepositorio;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		this.inicializarUsuarios();
		this.inicializarHospedajes();
		
	}

	private void inicializarHospedajes() {
		hospedaje1=new Hospedaje();
		hospedaje2=new Hospedaje();
		hospedaje3=new Hospedaje();
	
		hospedaje1.setDestino("Argentina");
		hospedaje1.setPuntaje(3);
		hospedaje1.setNombre("Departamento en centro turistico a orillas del mar");
		hospedaje1.setDescripcion("Cuenta con un living luminoso,dos baños y cochera");
		hospedaje1.setUbicacion("Lincoln 1234");
		hospedaje1.setCostoPorNoche(1500.50);
		hospedaje1.setHuespedes(3);
		
		hospedaje2.setDestino("Brasil");
		hospedaje2.setPuntaje(4);
		hospedaje2.setHuespedes(2);
		
		hospedaje3.setDestino("Argentina");
		hospedaje3.setPuntaje(4);
		hospedaje3.setHuespedes(1);
		
		unHospedajeRepositorio.save(hospedaje1);
		unHospedajeRepositorio.save(hospedaje2);
		unHospedajeRepositorio.save(hospedaje3);
	}

	private void inicializarUsuarios() {
		usuario1=new Usuario();
		usuario2=new Usuario();
		usuario1.setNombre("Rodrigo");
		usuario1.setUsuario("Rodri1996");
		usuario1.setContraseña("1234");
		usuario2.setNombre("Pepe");
		
		unUsuarioRepositorio.save(usuario1);
		unUsuarioRepositorio.save(usuario2);
	}

}
