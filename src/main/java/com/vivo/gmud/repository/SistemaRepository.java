package com.vivo.gmud.repository;

import org.springframework.data.repository.Repository;

import com.vivo.gmud.model.SistemaModel;

public interface SistemaRepository extends Repository<SistemaModel, Integer> {
	
	void save(SistemaModel sistema);
	void delete (SistemaModel sistema);
	
	SistemaModel findById(Integer id_sistema);
	
}
