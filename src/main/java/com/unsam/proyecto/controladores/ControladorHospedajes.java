package com.unsam.proyecto.controladores;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.servicios.ServicioHospedaje;

import DTO.DetalleHospedaje;
import DTO.HospedajeCardDTO;


@RestController
@RequestMapping("/hospedajes")
public class ControladorHospedajes {

	@Autowired
	private ServicioHospedaje servicioHospedajes;

	//Terminar el filtrado de hospedajes y cargar lo necesario en el bootstrap sobre los hospedajes
	@GetMapping("/tarjetas")
	public ArrayList<HospedajeCardDTO> hospedajesFiltrados(
			@RequestParam String destino,
			@RequestParam Double puntaje,
			@RequestParam Integer pasajeros,
			@RequestParam LocalDate fechaDesde,
			@RequestParam LocalDate fechaHasta) {
		return servicioHospedajes.filtrarHospedajes(destino,puntaje, pasajeros,fechaDesde,fechaHasta);
	}
	
	@GetMapping("/{id}")
	public DetalleHospedaje traerHospedaje(@PathVariable Integer id) {
		return servicioHospedajes.traerHospedaje(id);
	}
}
