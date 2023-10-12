package com.unsam.proyecto.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Hospedaje {
	
	protected Integer habitaciones;
	protected Integer huespedes;
	protected Boolean tieneServcLimpieza;
	protected ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	protected ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();
	
	public abstract void plus();
}
