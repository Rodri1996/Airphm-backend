package com.unsam.proyecto.repositorios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.unsam.proyecto.dominio.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {

	Usuario findByUsuarioAndContraseña(String usuario, String contraseña);

}
