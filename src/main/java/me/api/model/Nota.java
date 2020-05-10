package me.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nota {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_nota;
	
	@Column
	private String titulo;
	
	@Column
	private String descripcion;
	
	
	/*
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	@JsonBackReference
	private Usuario usuario;
	*/

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getId_nota() {
		return id_nota;
	}

	public void setId_nota(Integer id_nota) {
		this.id_nota = id_nota;
	}

	
	
	
	
	
}
