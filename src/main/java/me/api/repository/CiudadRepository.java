package me.api.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import me.api.model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer>{
	
	@Query(value = "select *from pais p inner join ciudad c ON p.id_pais = c.id_pais where c.id_pais = :codPais", nativeQuery = true)
	public List<Ciudad> listarCiudades(@Param("codPais") Integer codPais);
	
}
