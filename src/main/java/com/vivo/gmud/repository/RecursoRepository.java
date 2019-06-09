package com.vivo.gmud.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.vivo.gmud.model.RecursoModel;

public interface RecursoRepository extends Repository<RecursoModel, Integer> {

	public void save(RecursoModel recurso);
		 
	public void delete(RecursoModel recurso);
	 
	public List<RecursoModel> findAll();
		
	RecursoModel findById(Integer id_recurso);
			
	}
