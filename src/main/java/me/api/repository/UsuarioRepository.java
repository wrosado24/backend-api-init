package me.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.api.model.Usuario;
import me.api.service.UsuarioService;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>, UsuarioService{
}
