package com.vivo.gmud.repository;


import org.springframework.data.repository.Repository;

import com.vivo.gmud.model.RecursoModel;


public interface RecursoRepository extends Repository<RecursoModel, Integer> {

		void save(RecursoModel recurso);
		 
		void delete(RecursoModel recurso);
	 
		RecursoModel findById(Integer id_recurso);
			
	}
