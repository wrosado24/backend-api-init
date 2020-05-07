package me.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personal {
	
	@Id
	private Integer id;
	
	@Column
	private String nombre;

}
