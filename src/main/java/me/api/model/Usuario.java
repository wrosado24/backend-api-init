package me.api.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
	
	@Id
	private Integer id_usuario;
	
	@Column
	private String nombre_usuario;
	
	@Column
	private String dni;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_usuario")
	private Set<Nota> notas;
	
	@OneToOne
	private Foto foto;
	
	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Set<Nota> getNotas() {
		return notas;
	}

	public void setNotas(Set<Nota> notas) {
		this.notas = notas;
	}

	public Foto getFoto() {
		return foto;
	}

	public void setFoto(Foto foto) {
		this.foto = foto;
	}
	








	

}
