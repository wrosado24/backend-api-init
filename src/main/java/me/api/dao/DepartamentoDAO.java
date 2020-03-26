package me.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.api.model.Departamento;

public interface DepartamentoDAO extends JpaRepository<Departamento, Integer>{
	
}
