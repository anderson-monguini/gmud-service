package com.vivo.gmud.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.vivo.gmud.model.GmudModel;

public interface ConsultaRepository extends PagingAndSortingRepository<GmudModel,Long> {
	
	Page<GmudModel> findAllByOrderByDataDesc(Pageable pageable);
	
}
