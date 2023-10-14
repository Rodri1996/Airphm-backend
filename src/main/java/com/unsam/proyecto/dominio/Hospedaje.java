package com.unsam.proyecto.dominio;

import java.util.ArrayList;

public abstract class Hospedaje {
	
	protected String imagen;
	protected String nombre;
	protected String descripcion;
	protected String ubicacion;
	protected Double puntaje;
	protected Double costoPorNoche;
	protected Integer baños;
	protected Integer habitaciones;
	protected Integer huespedes;
	protected String detalle;
	protected String aspectos;
	protected Boolean tieneServcLimpieza;
	protected ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	protected ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
	
	public Double getCostoPorNoche() {
		return costoPorNoche;
	}



	public void setCostoPorNoche(Double costoPorNoche) {
		this.costoPorNoche = costoPorNoche;
	}



	public String getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Double getPuntaje() {
		return puntaje;
	}



	public void setPuntaje(Double puntaje) {
		this.puntaje = puntaje;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Integer getBaños() {
		return baños;
	}



	public void setBaños(Integer baños) {
		this.baños = baños;
	}



	public String getDetalle() {
		return detalle;
	}



	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}



	public String getAspectos() {
		return aspectos;
	}



	public void setAspectos(String aspectos) {
		this.aspectos = aspectos;
	}



	public Integer getHabitaciones() {
		return habitaciones;
	}



	public void setHabitaciones(Integer habitaciones) {
		this.habitaciones = habitaciones;
	}



	public Integer getHuespedes() {
		return huespedes;
	}



	public void setHuespedes(Integer huespedes) {
		this.huespedes = huespedes;
	}



	public Boolean getTieneServcLimpieza() {
		return tieneServcLimpieza;
	}



	public void setTieneServcLimpieza(Boolean tieneServcLimpieza) {
		this.tieneServcLimpieza = tieneServcLimpieza;
	}



	public ArrayList<Reserva> getReservas() {
		return reservas;
	}



	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}



	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}



	public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}



	public abstract void plus();
}
