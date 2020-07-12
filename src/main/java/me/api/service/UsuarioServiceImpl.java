package me.api.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import me.api.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listarUsuarios() {
		Query query = em.createNativeQuery("{call PRO_LISTAR_USUARIOS()}",Usuario.class);
		return query.getResultList();
	}
	
}
