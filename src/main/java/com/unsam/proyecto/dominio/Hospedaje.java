package com.unsam.proyecto.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Hospedaje {
	
	protected Integer id;
	protected String imagen;
	protected String nombre;
	protected String descripcion;
	protected String paisDestino;
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
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

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


	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}


	public abstract void plus();

	public void calcularPuntajePromedio() {
		Integer puntajeAcumulado = 0;
		Double puntajePromedio;
		for (Calificacion calificacion : calificaciones) {
			puntajeAcumulado=puntajeAcumulado+calificacion.getPuntaje();
		}
		Integer cantCalificaciones = calificaciones.size();
		if(cantCalificaciones>0) {
			puntajePromedio = (double) (puntajeAcumulado/cantCalificaciones);
		}else {
			puntajePromedio = 0.0;
		}
		this.setPuntaje(puntajePromedio);
	}

	public void calificar(Calificacion calificacion) {
		calificaciones.add(calificacion);
	}

	public boolean estaLibre(LocalDate fechaDesde, LocalDate fechaHasta) {
		Boolean libre=false;
		if(!this.tieneReservas()) {
			libre = true;
		}
		for (Reserva reserva : reservas) {
			if(reserva.disponible(fechaDesde,fechaHasta)) {
				libre = true;
			}
		}
		return libre;
	}

	private boolean tieneReservas() {
		return reservas.size()>0;
	}

	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
	}

	public Integer getCantOpiniones() {
		return calificaciones.size();
	}
}
