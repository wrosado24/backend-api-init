package me.api.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import me.api.model.Usuarios;

public class UserRepositoryImpl implements UserRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void contadorUsuarios() {
		StoredProcedureQuery query = em.createStoredProcedureQuery("PRO_CONTADOR_USUARIOS");
		query.registerStoredProcedureParameter("resultado", Integer.class, ParameterMode.OUT);
		query.execute();
		int resultado = (int) query.getOutputParameterValue("resultado");
		System.out.println(resultado);
	}

	@Override
	public void insertarUsuario(Usuarios us) {
		StoredProcedureQuery query = em.createStoredProcedureQuery("PRO_REGISTRAR_USUARIOS");
		
		query.registerStoredProcedureParameter(0, Integer.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
		
		query.setParameter(0, us.getId());
		query.setParameter(1, us.getApellido());
		query.setParameter(2, us.getDni());
		query.setParameter(3, us.getNombre());
		
		query.execute();
	}

}
