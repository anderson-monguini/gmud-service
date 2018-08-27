package com.vivo.gmud.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@NotNull
	@JoinColumn (name = "nome_fornecedor")
	@OneToOne
	private FornecedorModel fornecedorModel;
	
	@NotNull
	@JoinColumn (name = "ds_sistema")
	@OneToOne	
	private SistemaModel sistemaModel;
	
	
	@NotNull
	@JoinColumn (name = "ds_recurso")
	@OneToOne
	private RecursoModel recursoModel;
	
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

	//Geters e Seters
		
	public String getNome_gmud() {
		return nome_gmud;
	}

	public void setNome_gmud(String nome_gmud) {
		this.nome_gmud = nome_gmud;
	}

	public FornecedorModel getFornecedorModel() {
		return fornecedorModel;
	}

	public void setFornecedorModel(FornecedorModel fornecedorModel) {
		this.fornecedorModel = fornecedorModel;
	}

	public SistemaModel getSistemaModel() {
		return sistemaModel;
	}

	public void setSistemaModel(SistemaModel sistemaModel) {
		this.sistemaModel = sistemaModel;
	}

	public RecursoModel getRecursoModel() {
		return recursoModel;
	}

	public void setRecursoModel(RecursoModel recursoModel) {
		this.recursoModel = recursoModel;
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

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}	
	
}
