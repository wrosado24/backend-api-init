package me.api.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import me.api.model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer>{
	
	@Query(value = "select *from pais inner join ciudad ON pais.id = ciudad.codigo_pais where ciudad.codigo_pais = :codPais", nativeQuery = true)
	public List<Ciudad> listarCiudades(@Param("codPais") Integer codPais);
	
}
