package me.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import me.api.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Integer>{
	
	@Query(value = "select *from pais", nativeQuery = true)
	public List<Pais> listarPaises();
	
}
