package com.unsam.proyecto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.servicios.HospedajeServicio;

@RestController
@RequestMapping("/api/hospedaje")
public class HospedajeControlador {

	@Autowired
	private HospedajeServicio hospedajeServicio;

	@GetMapping("/todos")
	public Iterable<Hospedaje> traerTodosLosHospedajes() {
		return hospedajeServicio.traerTodosLosHospedajes();
	}

	/*
	@GetMapping("/porPuntaje/{puntaje}")
	public Iterable<Hospedaje> hospedajesPorPuntaje(@PathVariable Integer puntaje) {
		return hospedajeServicio.hospedajesPorPuntaje(puntaje);
	}
	*/
	
	@GetMapping("/porPuntaje/{puntaje}")
	public Iterable<Hospedaje> hospedajesPorPuntaje(@PathVariable Integer puntaje) {
		return hospedajeServicio.hospedajesPorPuntaje(puntaje);
	}
}
