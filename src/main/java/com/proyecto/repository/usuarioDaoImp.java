package com.proyecto.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyecto.models.usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class usuarioDaoImp implements usuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public List<usuario> getUsuarios() {
		String query="from Usuario";
		return entityManager.createQuery(query).getResultList();
	}

}
