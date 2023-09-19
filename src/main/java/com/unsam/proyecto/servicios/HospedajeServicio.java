package com.unsam.proyecto.servicios;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.repositorios.HospedajeRepositorio;

@Service
public class HospedajeServicio {

	@Autowired
	private HospedajeRepositorio hospedajeRepositorio;
	
	public Iterable<Hospedaje> traerTodosLosHospedajes() {
		return hospedajeRepositorio.findAll();
	}

	public Iterable<Hospedaje> hospedajesPorPuntaje(Integer puntaje) {
		Iterable<Hospedaje> hospedajes = traerTodosLosHospedajes();
		ArrayList<Hospedaje> hospedajesFiltradosPuntaje = new ArrayList<Hospedaje>();
		
		for (Hospedaje hospedaje : hospedajes) {
			if(hospedaje.getPuntaje().equals(puntaje)) {
				hospedajesFiltradosPuntaje.add(hospedaje);
			}
		}
		
		return hospedajesFiltradosPuntaje;
	}

}
