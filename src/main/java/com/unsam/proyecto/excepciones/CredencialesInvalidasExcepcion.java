package com.unsam.proyecto.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class CredencialesInvalidasExcepcion extends RuntimeException{
	
	public CredencialesInvalidasExcepcion(String mensaje){
		super(mensaje);
	}
}
