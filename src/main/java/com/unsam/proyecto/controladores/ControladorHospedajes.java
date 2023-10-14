package com.unsam.proyecto.controladores;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unsam.proyecto.servicios.ServicioHospedaje;

import DTO.HospedajeCardDTO;


@RestController
@RequestMapping("/hospedajes")
public class ControladorHospedajes {

	@Autowired
	private ServicioHospedaje servicioHospedajes;

	//TODO: Encontrar la manera de mapear un Hospedaje a un HospedajeCardDTO
	@GetMapping("/filtrados")
	public ArrayList<HospedajeCardDTO> hospedajesFiltrados() {
		return servicioHospedajes.hospedajesFiltrados();
	}
}
