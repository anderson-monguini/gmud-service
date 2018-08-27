package com.vivo.gmud.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.vivo.gmud.model.SistemaModel;

public interface SistemaRepository extends Repository<SistemaModel, Integer> {
	
	public void save(SistemaModel sistema);
	
	public void delete (SistemaModel sistema);
	
	public List<SistemaModel> findAll();
	
	SistemaModel findById(Integer id_sistema);
	
}
