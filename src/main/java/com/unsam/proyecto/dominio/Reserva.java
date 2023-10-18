package com.unsam.proyecto.dominio;

import java.time.LocalDate;

public class Reserva {

	public LocalDate reservadoDesde;
	public LocalDate reservadoHasta;
	
	public boolean disponible(LocalDate fechaDesde, LocalDate fechaHasta) {
	    return (fechaDesde.isBefore(reservadoDesde) && fechaHasta.isBefore(reservadoDesde))
	    		|| (fechaDesde.isAfter(reservadoHasta) && fechaHasta.isAfter(reservadoHasta));
	}

}
