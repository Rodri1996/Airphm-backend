package DTO;

import com.unsam.proyecto.dominio.Hospedaje;

public class HospedajeCardDTO {
	Integer id;
	String imagen;
	String nombre;
	String descripcion;
	String ubicacion;
	Double puntaje;
	Double costoPorNoche;
	private Double costoTotal;

	public HospedajeCardDTO() {
		
	}
	
	public static HospedajeCardDTO crearDTO(Hospedaje h) {
		HospedajeCardDTO hospedajeCardDTO = new HospedajeCardDTO();
		hospedajeCardDTO.id = h.getId();
		hospedajeCardDTO.imagen = h.getImagen();
		hospedajeCardDTO.nombre = h.getNombre();
		hospedajeCardDTO.descripcion = h.getDescripcion();
		hospedajeCardDTO.ubicacion = h.getUbicacion();
		hospedajeCardDTO.puntaje = h.getPuntaje();
		hospedajeCardDTO.costoPorNoche = h.getCostoPorNoche();
		hospedajeCardDTO.costoTotal = h.getCostoTotal();
		return hospedajeCardDTO;
	}
	
	public Double getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(Double costoTotal) {
		this.costoTotal = costoTotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Double puntaje) {
		this.puntaje = puntaje;
	}

	public Double getCostoPorNoche() {
		return costoPorNoche;
	}

	public void setCostoPorNoche(Double costoPorNoche) {
		this.costoPorNoche = costoPorNoche;
	}


}
