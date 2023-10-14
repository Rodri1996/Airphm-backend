package com.unsam.proyecto.repositorios;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.unsam.proyecto.dominio.Hospedaje;

@Component
public class RepositorioHospedaje {
	
	private ArrayList<Hospedaje> hospedajes = new ArrayList<Hospedaje>();
	
	public ArrayList<Hospedaje> hospedajesFiltrados() {
		return hospedajes;
	}

	public void guardar(Hospedaje hospedaje1) {
		hospedajes.add(hospedaje1);
	}

}
