package com.vivo.gmud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class FornecedorModel {
	
	public FornecedorModel () {
		
	}	
	@Id
 	@GeneratedValue(strategy= GenerationType.AUTO)
 	@Column (name="id_fonecedor")
	private Integer id_fonecedor;
	
	@NotNull
	@Column (name = "nome_fornecedor")
	private String nome_fornecedor;
	
	@Column (name ="contato_plantao")
	private String contato_plantao;
	
	/* Geters e Seters */

	public Integer getId_fonecedor() {
		return id_fonecedor;
	}

	public void setId_fonecedor(Integer id_fonecedor) {
		this.id_fonecedor = id_fonecedor;
	}

	public String getNome_fornecedor() {
		return nome_fornecedor;
	}

	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}

	public String getContato_plantao() {
		return contato_plantao;
	}

	public void setContato_plantao(String contato_plantao) {
		this.contato_plantao = contato_plantao;
	}

}
