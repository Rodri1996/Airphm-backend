package com.unsam.proyecto.dominio;

import java.time.LocalDate;

public abstract class Hospedaje {
	
	protected Integer habitaciones;
	protected Integer huespedes;
	protected Boolean tieneServcLimpieza;
	
	public abstract void plus();
}
