package com.unsam.proyecto;

import java.time.LocalDate;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.dominio.Usuario;

@Service
public class ProyectoBootstrap implements InitializingBean{

	Usuario usuario1;
	Usuario usuario2;
	
	Hospedaje hospedaje1;
	Hospedaje hospedaje2;
	Hospedaje hospedaje3;
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		this.inicializarUsuarios();
		this.inicializarHospedajes();
		
	}

	private void inicializarHospedajes() {
		
	}

	private void inicializarUsuarios() {
		
	}

}
