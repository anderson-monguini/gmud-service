package com.vivo.gmud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data

@Entity
public class SistemaModel {

	@Id
 	@GeneratedValue(strategy= GenerationType.AUTO)
 	@Column (name="id_sistema")
	private Integer id_sistema;
	
	@NotNull
	@Column (name = "nome_sistema")
	private String nome_sistema;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_fornecedor")
	private FornecedorModel fornecedorModel;
	
	public SistemaModel (String nome_sistema, FornecedorModel fornecedorModel) {
		this.nome_sistema = nome_sistema;
		this.fornecedorModel = fornecedorModel;		
	}

	/* Geters e Seters */

	public Integer getId_sistema() {
		return id_sistema;
	}

	public void setId_sistema(Integer id_sistema) {
		this.id_sistema = id_sistema;
	}

	public String getNome_sistema() {
		return nome_sistema;
	}

	public void setNome_sistema(String nome_sistema) {
		this.nome_sistema = nome_sistema;
	}

	public FornecedorModel getFornecedorModel() {
		return fornecedorModel;
	}

	public void setFornecedorModel(FornecedorModel fornecedorModel) {
		this.fornecedorModel = fornecedorModel;
	}
}
