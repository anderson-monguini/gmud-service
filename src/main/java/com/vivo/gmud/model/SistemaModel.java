package com.vivo.gmud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class SistemaModel {

	public SistemaModel () {}
	
	@Id
 	@GeneratedValue(strategy= GenerationType.AUTO)
 	@Column (name="id_sistema")
	private Integer id_sistema;
	
	@NotNull
	@Column (name = "nome_sistema")
	private String nome_sistema;
	
	@NotNull
	@JoinColumn (name = "nome_fornecedor")
	@OneToOne
	private FornecedorModel fornecedorModel;
	
	/* Geters e Seters */

	public Integer getId_sistema() {
		return id_sistema;
	}

	public void setId_sistema(Integer id_sistema) {
		this.id_sistema = id_sistema;
	}

	public FornecedorModel getFornecedorModel() {
		return fornecedorModel;
	}

	public void setFornecedorModel(FornecedorModel fornecedorModel) {
		this.fornecedorModel = fornecedorModel;
	}

	public String getNome_sistema() {
		return nome_sistema;
	}

	public void setNome_sistema(String nome_sistema) {
		this.nome_sistema = nome_sistema;
	}
	
}
