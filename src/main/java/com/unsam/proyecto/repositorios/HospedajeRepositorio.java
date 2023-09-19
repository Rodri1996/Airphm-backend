package com.unsam.proyecto.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.unsam.proyecto.dominio.Hospedaje;

public interface HospedajeRepositorio extends CrudRepository<Hospedaje, Integer>{

	Iterable<Hospedaje> findAllByPuntaje(Integer puntaje);

}
