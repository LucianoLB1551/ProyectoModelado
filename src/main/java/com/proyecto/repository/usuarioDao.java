package com.proyecto.repository;

import java.util.List;

import com.proyecto.models.usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface usuarioDao {
	
	public List<usuario> getUsuarios();
}
