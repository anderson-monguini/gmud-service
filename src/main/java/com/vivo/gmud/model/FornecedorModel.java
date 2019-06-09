package com.vivo.gmud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data

@Entity
public class FornecedorModel {
	
	public FornecedorModel () {
		
	}
	
	@Id
 	@GeneratedValue(strategy= GenerationType.AUTO)
 	@Column (name="id_fornecedor")
	private Integer id_fornecedor;
	
	@NotNull(message="O fornecedor não pode ser vazio")
	@Column (name = "nome_fornecedor")
	private String nome_fornecedor;
	
	@Column (name ="contato_plantao")
	private String contato_plantao;
	
	public FornecedorModel (String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
        
    }
		
	/* Geters e Seters */

	public Integer getId_fornecedor() {
		return id_fornecedor;
	}

	public void setId_fornecedor(Integer id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
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
