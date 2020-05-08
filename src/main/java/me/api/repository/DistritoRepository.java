package me.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import me.api.model.Distrito;

public interface DistritoRepository extends JpaRepository<Distrito, Integer>{
	
	@Query(value = "select *from distrito d inner join ciudad c ON d.codigo_ciudad=c.id_ciudad where c.id_ciudad = :codCiudad", nativeQuery = true)
	public List<Distrito> listarDistritos(@Param("codCiudad") Integer codCiudad);
	
}
