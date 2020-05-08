package me.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pais {
	
	@Id
	private Integer id_pais;
	
	@Column
	private String nombre_pais;
	
	@Column
	private Integer codigo_postal;
	
	public Integer getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(Integer codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	public String getNombre_pais() {
		return nombre_pais;
	}
	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}
	public Integer getId_pais() {
		return id_pais;
	}
	public void setId_pais(Integer id_pais) {
		this.id_pais = id_pais;
	}



}
