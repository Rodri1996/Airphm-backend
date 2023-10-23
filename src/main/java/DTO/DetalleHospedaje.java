package DTO;

import com.unsam.proyecto.dominio.Hospedaje;

public class DetalleHospedaje {

	String paisDestino;
	Boolean tieneServcLimpieza;
	String detalle;
	String aspectos;
	Integer opiniones;
	Integer baños;
	Integer habitaciones;
	Integer huespedes;
	
	public DetalleHospedaje() {}
	
	public static DetalleHospedaje crearDTO(Hospedaje h) {
		DetalleHospedaje detalleHospedajeDTO = new DetalleHospedaje();
		detalleHospedajeDTO.paisDestino = h.getPaisDestino();
		detalleHospedajeDTO.tieneServcLimpieza = h.getTieneServcLimpieza();
		detalleHospedajeDTO.detalle = h.getDetalle();
		detalleHospedajeDTO.aspectos = h.getDetalle();
		detalleHospedajeDTO.opiniones = h.getCantOpiniones();
		detalleHospedajeDTO.baños = h.getBaños();
		detalleHospedajeDTO.habitaciones = h.getHabitaciones();
		detalleHospedajeDTO.huespedes = h.getHuespedes();
		return detalleHospedajeDTO;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

	public Boolean getTieneServcLimpieza() {
		return tieneServcLimpieza;
	}

	public void setTieneServcLimpieza(Boolean tieneServcLimpieza) {
		this.tieneServcLimpieza = tieneServcLimpieza;
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

	public Integer getOpiniones() {
		return opiniones;
	}

	public void setOpiniones(Integer opiniones) {
		this.opiniones = opiniones;
	}

	public Integer getBaños() {
		return baños;
	}

	public void setBaños(Integer baños) {
		this.baños = baños;
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
	
}
