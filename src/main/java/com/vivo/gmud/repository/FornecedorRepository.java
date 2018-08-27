package com.vivo.gmud.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.vivo.gmud.model.FornecedorModel;

public interface FornecedorRepository extends Repository<FornecedorModel, Integer> {

	public void save(FornecedorModel fornecedor);
	 
	public void delete(FornecedorModel fornecedor);
 
	public List<FornecedorModel> findAll();
	
	FornecedorModel findById(Integer id_fonecedor);
			
}
