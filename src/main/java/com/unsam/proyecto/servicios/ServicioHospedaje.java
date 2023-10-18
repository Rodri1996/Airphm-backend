package com.unsam.proyecto.servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.repositorios.RepositorioHospedaje;

import DTO.HospedajeCardDTO;

@Service
public class ServicioHospedaje {

	@Autowired
	private RepositorioHospedaje repositorioHospedaje;

	public ArrayList<HospedajeCardDTO> filtrarHospedajes(
			String destino, 
			Double puntaje,
			Integer pasajeros, 
			LocalDate fechaDesde, 
			LocalDate fechaHasta) {
		ArrayList<HospedajeCardDTO> hospedajesMapeados = new ArrayList<HospedajeCardDTO>();
		ArrayList<Hospedaje> hospedajes = repositorioHospedaje.hospedajesFiltrados(
				destino,
				puntaje, 
				pasajeros, 
				fechaDesde, 
				fechaHasta);

		for (Hospedaje hospedaje : hospedajes) {
			HospedajeCardDTO h = HospedajeCardDTO.crearDTO(hospedaje);
			hospedajesMapeados.add(h);
		};
		return hospedajesMapeados;
	}

}
