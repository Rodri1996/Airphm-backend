package com.unsam.proyecto.servicios;

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

	public ArrayList<HospedajeCardDTO> hospedajesFiltrados() {
		ArrayList<HospedajeCardDTO> hospedajesMapeados = new ArrayList<HospedajeCardDTO>();
		ArrayList<Hospedaje> hospedajes = repositorioHospedaje.hospedajesFiltrados();
		for (Hospedaje hospedaje : hospedajes) {
			HospedajeCardDTO h = HospedajeCardDTO.crearDTO(hospedaje);
			hospedajesMapeados.add(h);
		};
		return hospedajesMapeados;
	}

}
