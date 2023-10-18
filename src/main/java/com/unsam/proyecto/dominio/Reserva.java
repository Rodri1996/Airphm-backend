package com.unsam.proyecto.dominio;

import java.time.LocalDate;

public class Reserva {

	public LocalDate reservadoDesde;
	public LocalDate reservadoHasta;
	
	public boolean vigente(LocalDate fechaDesde, LocalDate fechaHasta) {
		return (fechaDesde.isBefore(reservadoDesde) && fechaHasta.isBefore(reservadoHasta))
				|| (fechaDesde.isAfter(reservadoHasta) && fechaDesde.isAfter(reservadoHasta));
				
	}

}
