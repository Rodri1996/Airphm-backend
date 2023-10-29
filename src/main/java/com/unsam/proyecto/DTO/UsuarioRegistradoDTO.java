package com.unsam.proyecto.DTO;

public class UsuarioRegistradoDTO {

	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static UsuarioRegistradoDTO crear(Integer idUsuario) {
		UsuarioRegistradoDTO usuario = new UsuarioRegistradoDTO();
		usuario.setId(idUsuario);
		return usuario;
	}

}
