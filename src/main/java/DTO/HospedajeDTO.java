package DTO;

import com.unsam.proyecto.dominio.Hospedaje;

public class HospedajeDTO {
	public Integer idHospedaje;
	public Integer puntaje;
	public String nombre;
	public String descripcion;
	public Integer huespedes;
	public String ubicacion;
	public Double costoPorNoche;
	

	public void setIdHospedaje(Integer idHospedaje) {
		this.idHospedaje = idHospedaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}
		

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setHuespedes(Integer huespedes) {
		this.huespedes = huespedes;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void setCostoPorNoche(Double costoPorNoche) {
		this.costoPorNoche = costoPorNoche;
	}

	public static HospedajeDTO crearHospedajeDTO(Hospedaje unHospedaje) {
		HospedajeDTO hospedajeDTO = new HospedajeDTO();
		hospedajeDTO.setIdHospedaje(unHospedaje.getIdHospedaje());
		hospedajeDTO.setNombre(unHospedaje.getNombre());
		hospedajeDTO.setDescripcion(unHospedaje.getDescripcion());
		hospedajeDTO.setUbicacion(unHospedaje.getUbicacion());
		hospedajeDTO.setCostoPorNoche(unHospedaje.getCostoPorNoche());
		hospedajeDTO.setPuntaje(unHospedaje.getPuntaje());
		return hospedajeDTO;
	}
}
