package com.unsam.proyecto.excepciones;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExcepcionElementoNoEncontrado extends RuntimeException{
	
	public ExcepcionElementoNoEncontrado(String message) {
		super(message);
	}
}
