package com.unsam.proyecto.dominio;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Hospedaje {

	@Id
	@GeneratedValue
	protected Integer idHospedaje;
	protected String nombre;
	protected String descripcion;
	protected Integer huespedes;
	protected String ubicacion;
	protected Double costoPorNoche;
	protected Integer puntaje;
	protected String destino;
	private LocalDate reservadoDesde=LocalDate.of(0001, 01, 01);
	private LocalDate reservadoHasta=LocalDate.of(0001, 01, 01);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Double getCostoPorNoche() {
		return costoPorNoche;
	}

	public void setCostoPorNoche(Double costoPorNoche) {
		this.costoPorNoche = costoPorNoche;
	}
	
	public Integer getIdHospedaje() {
		return idHospedaje;
	}

	public LocalDate getReservadoDesde() {
		return reservadoDesde;
	}
	public void setReservadoDesde(LocalDate reservadoDesde) {
		this.reservadoDesde = reservadoDesde;
	}
	public LocalDate getReservadoHasta() {
		return reservadoHasta;
	}
	public void setReservadoHasta(LocalDate reservadoHasta) {
		this.reservadoHasta = reservadoHasta;
	}

	
	
	public Integer getHuespedes() {
		return huespedes;
	}
	public void setHuespedes(Integer huespedes) {
		this.huespedes = huespedes;
	}
	public Integer getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public boolean estaReservado(LocalDate fechaDesde, LocalDate fechaHasta) {
	    return (fechaDesde.isBefore(reservadoHasta) || fechaDesde.isEqual(reservadoHasta))
	        && (fechaHasta.isAfter(reservadoDesde) || fechaHasta.isEqual(reservadoDesde));
	}
	
	
}
