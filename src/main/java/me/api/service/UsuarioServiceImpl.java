package me.api.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import me.api.model.Usuario;

public class UsuarioServiceImpl implements UsuarioService{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings( "unchecked" )
	@Override
	public List<Usuario> listarUsuarios() {
		/*EJEMPLO DE INVOCAR PROCEDIMIENTOS CON PARAMETROS*/
		/*Query query = em.createNativeQuery("{call getEmployeeDetails(?,?)}",
                EmployeeDetails.class)           
                .setParameter(1, employeeId)
                .setParameter(2, companyId);

		List<EmployeeDetails> result = query.getResultList();*/
		//List<Usuario> result = query.getResultList();
		Query query = em.createNativeQuery("{call PRO_LISTAR_USUARIOS()}",Usuario.class);
		return query.getResultList();
	}

}
