package me.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.api.model.Usuarios;

public interface UsuarioRepositoryBase extends JpaRepository<Usuarios, Integer>, UserRepository{
	
}
