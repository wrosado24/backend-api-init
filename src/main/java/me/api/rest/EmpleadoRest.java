package me.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.api.dao.EmpleadoDAO;
import me.api.model.Empleado;

@CrossOrigin("*")
@RestController
@RequestMapping("/empleados")
public class EmpleadoRest {
	
	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	@GetMapping("/listar")
	public List<Empleado> listarEmpleados(){
		return empleadoDAO.listarEmpleados(2);
	}

}
