package me.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pais {
	
	@Id
	private Integer id;
	
	@Column
	private String nombre;
	
	@Column
	private Integer codigo_postal;
	
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
	public Integer getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(Integer codigo_postal) {
		this.codigo_postal = codigo_postal;
	}


}
