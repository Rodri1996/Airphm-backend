package com.unsam.proyecto.controladores;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.servicios.HospedajeServicio;

import DTO.HospedajeDTO;

@RestController
@RequestMapping("/api/hospedaje")
public class HospedajeControlador {

	@Autowired
	private HospedajeServicio servicioHospedaje;

	@GetMapping("/filtrar")
	public ArrayList<HospedajeDTO> filtrarHospedajes(
			@RequestParam String destino,
			@RequestParam Integer pasajeros,
			@RequestParam Integer puntaje,
			@RequestParam LocalDate fechaDesde,
			@RequestParam LocalDate fechaHasta) {
		return servicioHospedaje.filtrarHospedajes(
				destino,
				pasajeros,
				puntaje,
				fechaDesde,
				fechaHasta);
	}
}
