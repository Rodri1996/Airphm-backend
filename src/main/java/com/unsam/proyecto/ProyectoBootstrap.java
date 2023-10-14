package com.unsam.proyecto;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.dominio.Cabania;
import com.unsam.proyecto.dominio.Casa;
import com.unsam.proyecto.dominio.Departamento;
import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.dominio.Usuario;
import com.unsam.proyecto.repositorios.RepositorioHospedaje;

@Service
public class ProyectoBootstrap implements InitializingBean{

	Usuario usuario1;
	Usuario usuario2;
	
	 Hospedaje hospedaje1;
	 Hospedaje hospedaje2;
	 Hospedaje hospedaje3;
	
	@Autowired
	RepositorioHospedaje repositorioHospedaje;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		this.inicializarUsuarios();
		this.inicializarHospedajes();
		
	}

	private void inicializarHospedajes() {
		hospedaje1 = new Casa();
		hospedaje2 = new Departamento();
		hospedaje3 = new Cabania();
	
		hospedaje1.setNombre("Casa quinta");
		hospedaje1.setDescripcion("Tiene dos baños y vista al lago");
		hospedaje1.setUbicacion("Av. Siembre Viva 742");
		hospedaje1.setCostoPorNoche(2500.00);
		hospedaje1.setImagen("");

		hospedaje2.setNombre("Departamento a orillas del mar");
		hospedaje2.setDescripcion("Tiene living luminoso y vista al mar");
		hospedaje2.setUbicacion("Calle false 1234");
		hospedaje2.setCostoPorNoche(4200.00);
		hospedaje2.setImagen("");
		
		hospedaje3.setNombre("Cabaña");
		hospedaje3.setDescripcion("Dos dormitorios,cochera y vista al mar");
		hospedaje3.setUbicacion("Av. Siembre Viva 555");
		hospedaje3.setCostoPorNoche(3600.00);
		hospedaje3.setImagen("");
		
		repositorioHospedaje.guardar(hospedaje1);
		repositorioHospedaje.guardar(hospedaje2);
		repositorioHospedaje.guardar(hospedaje3);
	}

	private void inicializarUsuarios() {
		
	}

}
