package me.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import me.api.model.Usuario;
import me.api.service.UsuarioService;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>, UsuarioService{
	
	@Query(nativeQuery = true, value = "select *from usuario")
	public List<Usuario> listarUsuarios();
}
