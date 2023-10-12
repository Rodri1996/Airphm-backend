package com.unsam.proyecto.dominio;

import java.util.ArrayList;

public class Usuario {

	protected ArrayList<Usuario> amigos = new ArrayList<Usuario>();
	protected ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	protected ArrayList<Hospedaje> publicaciones = new ArrayList<Hospedaje>();
}
