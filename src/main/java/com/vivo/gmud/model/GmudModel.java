package com.vivo.gmud.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_gmud")
@Entity
public class GmudModel {
	
	@Id
	@Column (name="id_gmud")
	private Integer codigo;

	@Column (name="ds_gmud")
	private String nome_gmud;
	
	@Column (name="ds_fornecedor")
	private String fornecedor;
	
	@Column (name="ds_sistema")
	private String sistema;
	
	@Column (name="ds_recurso")
	private String recurso;
	
	@Column (name="data_gmud")
	private LocalDate data;
	
	@Column (name="fl_ativo")
	private boolean ativo;
	
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
