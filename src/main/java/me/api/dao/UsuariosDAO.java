package me.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.api.model.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Integer>{
	
}
