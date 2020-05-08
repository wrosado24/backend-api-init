package me.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Distrito {
	
	@Id
	private Integer id_distrito;
	
	@Column
	private String codigo_distrito;
	
	@Column
	private String nombre_distrito;
	
	@ManyToOne
	@JoinColumn(name="codigo_ciudad")
	private Ciudad ciudad;
	
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

	public String getNombre_distrito() {
		return nombre_distrito;
	}

	public void setNombre_distrito(String nombre_distrito) {
		this.nombre_distrito = nombre_distrito;
	}

	public Integer getId_distrito() {
		return id_distrito;
	}

	public void setId_distrito(Integer id_distrito) {
		this.id_distrito = id_distrito;
	}
	
	
	

	
	

	

}
