package com.unsam.proyecto.dominio;

import java.util.ArrayList;

public class Usuario {

	protected ArrayList<Usuario> amigos = new ArrayList<Usuario>();
	protected ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	protected ArrayList<Hospedaje> publicaciones = new ArrayList<Hospedaje>();
	
	public Integer id;
	public String nombreUsuario;
	public String contraseña;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
