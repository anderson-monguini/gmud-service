package com.vivo.gmud.repository;

import org.springframework.data.repository.Repository;

import com.vivo.gmud.model.GmudModel;

public interface GmudRepository extends Repository<GmudModel, Integer> {
	 
	void save(GmudModel gmud);
 
	void delete(GmudModel gmud);
 	
	GmudModel findById(Integer codigo);
	
}
