package com.unsam.proyecto.servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.repositorios.HospedajeRepositorio;

import DTO.HospedajeDTO;

@Service
public class HospedajeServicio {

	@Autowired
	private HospedajeRepositorio repositorioHospedaje;
	
	public ArrayList<HospedajeDTO> filtrarHospedajes(String destino, Integer pasajeros, Integer puntaje, LocalDate fechaDesde, LocalDate fechaHasta) {
		var hospedajesPorDestino=repositorioHospedaje.findAllByDestino(destino);
		var hospedajesPorPasajeros=filtrarPorPasajeros(hospedajesPorDestino,pasajeros);
		var hospedajesPorPuntaje= filtrarPorPuntaje(hospedajesPorPasajeros,puntaje);
		var hospedajesSegunFechas=filtrarPorFechas(hospedajesPorPuntaje,fechaDesde,fechaHasta);
		return hospedajesSegunFechas.stream()
			    .map(h -> HospedajeDTO.crearHospedajeDTO(h))
			    .collect(Collectors.toCollection(ArrayList::new));

	}

	private ArrayList<Hospedaje> filtrarPorFechas(
			ArrayList<Hospedaje> hospedajesPorPuntaje, 
			LocalDate fechaDesde,
			LocalDate fechaHasta) {
		ArrayList<Hospedaje> hospedajesFiltrados= new ArrayList<Hospedaje>();
		for (Hospedaje hospedaje : hospedajesPorPuntaje) {
			if(!hospedaje.estaReservado(fechaDesde,fechaHasta)) {
				hospedajesFiltrados.add(hospedaje);
			}
		}
		return hospedajesFiltrados;
	}

	private ArrayList<Hospedaje> filtrarPorPuntaje(ArrayList<Hospedaje> hospedajesPorPuntaje, Integer puntaje) {
		ArrayList<Hospedaje> hospedajesFiltrados= new ArrayList<Hospedaje>();
		for (Hospedaje hospedaje : hospedajesPorPuntaje) {
			if(hospedaje.getPuntaje()==puntaje) {
				hospedajesFiltrados.add(hospedaje);
			}
		}
		return hospedajesFiltrados;
	}

	private ArrayList<Hospedaje> filtrarPorPasajeros(Iterable<Hospedaje> hospedajesPorDestino, Integer pasajeros) {
		ArrayList<Hospedaje> hospedajesFiltrados= new ArrayList<Hospedaje>();
		for (Hospedaje hospedaje : hospedajesPorDestino) {
			if(hospedaje.getHuespedes()>=pasajeros) {
				hospedajesFiltrados.add(hospedaje);
			}
		}
		return hospedajesFiltrados;
	}

}
