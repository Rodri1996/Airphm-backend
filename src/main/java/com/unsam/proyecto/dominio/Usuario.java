package com.unsam.proyecto.dominio;

public class Usuario {

	protected Integer idUsuario;
	protected String nombre;
	
	public Usuario() {}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void actualizar(Usuario contenido) {
		setNombre(contenido.nombre);
	}

	
	
	
}
