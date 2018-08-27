package com.vivo.gmud.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class GmudModel {
	
	public GmudModel () {
		
	}
	
	@NotNull
    @Min(99999)
	@Id
	@Column (name="id_gmud")
	private Integer codigo;
	
	@Size(max = 50)
	@Column (name="ds_gmud")
	private String nome_gmud;
	
	@Size(max = 50)
	@Column (name="ds_fornecedor")
	private String fornecedor;
	
	@Size(max = 50)
	@Column (name="ds_sistema")
	private String sistema;
	
	@Size(max = 50)
	@Column (name="ds_recurso")
	private String recurso;
	
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	@Column (name="data_gmud")
	private LocalDate data;
	
	@Size(max = 50)
	@Column (name="ds_gp")
	private String gerenteprojeto;
	
	@Size(max = 255)
	@Column (name="ds_observacoes")
	private String observacoes;
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome_gmud() {
		return nome_gmud;
	}

	public void setNome_gmud(String nome_gmud) {
		this.nome_gmud = nome_gmud;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getGerenteprojeto() {
		return gerenteprojeto;
	}

	public void setGerenteprojeto(String gerenteprojeto) {
		this.gerenteprojeto = gerenteprojeto;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
