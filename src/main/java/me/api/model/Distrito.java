package me.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Distrito {
	
	@Id
	private Integer id;
	
	@Column
	private String codigo_distrito;
	
	@Column
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="codigo_ciudad")
	private Ciudad ciudad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo_distrito() {
		return codigo_distrito;
	}

	public void setCodigo_distrito(String codigo_distrito) {
		this.codigo_distrito = codigo_distrito;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}


	
	

	

}
