package me.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import me.api.model.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, Integer>{

	@Query(value="select *from empleado INNER JOIN departamento ON empleado.departamento_id=departamento.id "
			+ "where departamento.id = :id",
			nativeQuery = true)
	public List<Empleado> listarEmpleados(@Param("id") Integer id);
}
