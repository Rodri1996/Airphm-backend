package com.unsam.proyecto.repositorios;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.unsam.proyecto.dominio.Hospedaje;

@Component
public class RepositorioHospedaje {
	
	private ArrayList<Hospedaje> hospedajes = new ArrayList<Hospedaje>();
	public Integer id=0;
	
	public Integer getId() {
		return id;
	}

	public ArrayList<Hospedaje> hospedajesFiltrados(
			String destino, 
			Double puntaje,
			Integer pasajeros, LocalDate fechaHasta, LocalDate fechaDesde) {
		ArrayList<Hospedaje> hospedajesPorDestino = this.filtrarPorDestino(destino);
		ArrayList<Hospedaje> hospedajesPorPuntaje = this.filtrarPorPuntaje(puntaje,hospedajesPorDestino);
		ArrayList<Hospedaje> hospedajesPorPasajeros = this.filtrarPorPasajeros(pasajeros,hospedajesPorPuntaje);
		ArrayList<Hospedaje> hospedajesPorFechas = this.filtrarPorFechas(fechaDesde,fechaHasta,hospedajesPorPasajeros);
		return hospedajesPorFechas;
	}

	private ArrayList<Hospedaje> filtrarPorFechas(LocalDate fechaDesde, LocalDate fechaHasta, ArrayList<Hospedaje> hospedajesPorPasajeros) {
		ArrayList<Hospedaje> hospedajesPorFechas = new ArrayList<Hospedaje>();
		for (Hospedaje hospedaje : hospedajesPorPasajeros) {
			if(hospedaje.estaLibre(fechaDesde,fechaHasta)) {
				hospedajesPorFechas.add(hospedaje);
			}
		}		
		return hospedajesPorFechas;
	}

	private ArrayList<Hospedaje> filtrarPorPasajeros(Integer pasajeros, ArrayList<Hospedaje> hospedajesPorPuntaje) {
		ArrayList<Hospedaje> hospedajesPorPasajeros = new ArrayList<Hospedaje>();
		for (Hospedaje hospedaje : hospedajesPorPuntaje) {
			if(hospedaje.getHuespedes()>=pasajeros) {
				hospedajesPorPasajeros.add(hospedaje);
			}
		}		
		return hospedajesPorPasajeros;
	}

	private ArrayList<Hospedaje> filtrarPorPuntaje(Double puntaje, ArrayList<Hospedaje> hospedajesPorDestino) {
		ArrayList<Hospedaje> hospedajesPorPuntaje = new ArrayList<Hospedaje>();
		for (Hospedaje hospedaje : hospedajesPorDestino) {
			hospedaje.calcularPuntajePromedio();
			if(hospedaje.getPuntaje().equals(puntaje)) {
				hospedajesPorPuntaje.add(hospedaje);
			}
		}		
		return hospedajesPorPuntaje;
	}

	private ArrayList<Hospedaje> filtrarPorDestino(String destino) {
		ArrayList<Hospedaje> hospedajesPorDestino = new ArrayList<Hospedaje>();
		for (Hospedaje hospedaje : hospedajes) {
			if(hospedaje.getPaisDestino().equals(destino)) {
				hospedajesPorDestino.add(hospedaje);
			}
		}		
		return hospedajesPorDestino;
	}

	public void guardar(Hospedaje hospedaje) {
		id+=1;
		hospedaje.setId(id);
		hospedajes.add(hospedaje);
	}

	public Hospedaje traerHospedaje(Integer id) {
		return hospedajes.stream().filter(h->h.getId().equals(id)).findFirst().get();
	}
	
	

}
