package com.victordevelops.springboot.backend.apirest.models.services;

import com.victordevelops.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String userename);
}
