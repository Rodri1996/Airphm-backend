package com.unsam.proyecto;

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
		hospedaje2.setDestino("Brasil");
		hospedaje2.setPuntaje(4);
		hospedaje3.setDestino("Argentina");
		hospedaje3.setPuntaje(4);
		
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
