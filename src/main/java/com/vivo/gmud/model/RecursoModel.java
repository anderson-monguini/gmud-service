package com.vivo.gmud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class RecursoModel {

	public RecursoModel () {}
	
	@Id
 	@GeneratedValue(strategy= GenerationType.AUTO)
 	@Column (name="id_recurso")
	private Integer id_recurso;
	
	@NotNull
	@Column (name = "nome_recurso")
	private String nome_recurso;
	
	@Column (name ="contato_recurso")
	private String contato_recurso;

	public Integer getId_recurso() {
		return id_recurso;
	}

	public void setId_recurso(Integer id_recurso) {
		this.id_recurso = id_recurso;
	}

	public String getNome_recurso() {
		return nome_recurso;
	}

	public void setNome_recurso(String nome_recurso) {
		this.nome_recurso = nome_recurso;
	}

	public String getContato_recurso() {
		return contato_recurso;
	}

	public void setContato_recurso(String contato_recurso) {
		this.contato_recurso = contato_recurso;
	}
	
	
}
