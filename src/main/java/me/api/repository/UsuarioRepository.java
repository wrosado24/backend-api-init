package me.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.api.model.Usuario;
import me.api.service.UsuarioService;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>, UsuarioService{

}
