package me.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Empleado {
	
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO )
	private Integer id;
	
	@Column
	private String enombre;
	
	@Column
	private Double salario;
	
	@OneToOne
	private Departamento departamento;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnombre() {
		return enombre;
	}

	public void setEnombre(String enombre) {
		this.enombre = enombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
