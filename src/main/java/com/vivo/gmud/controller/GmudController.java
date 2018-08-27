package com.vivo.gmud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vivo.gmud.model.FornecedorModel;
import com.vivo.gmud.model.GmudModel;
import com.vivo.gmud.model.RecursoModel;
import com.vivo.gmud.model.SistemaModel;
import com.vivo.gmud.repository.FornecedorRepository;
import com.vivo.gmud.repository.RecursoRepository;
import com.vivo.gmud.repository.SistemaRepository;

@Controller
public class GmudController {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@Autowired
	private RecursoRepository recursoRepository;
	
	@Autowired
	private SistemaRepository sistemaRepository;
		
	@GetMapping("/menu")
	public ModelAndView testemenu () {
		
	ModelAndView mav = new ModelAndView("menu");
	
	return mav;
	
	}
	
	@GetMapping("/cadastro")
	public ModelAndView testecadastro () {
		
	ModelAndView mav = new ModelAndView("cadastro");
	
	mav.addObject("myVal",new GmudModel());
	
	mav.addObject("listaFornecedor", fornecedorRepository.findAll());
	
	mav.addObject("listaRecurso", recursoRepository.findAll());
	
	mav.addObject("listaSistema", sistemaRepository.findAll());
		
	return mav;
	
	}
	
	@GetMapping("/fornecedor")
	public ModelAndView cadastrofornecedor () {
		
	ModelAndView mav = new ModelAndView("fornecedor");
	
	mav.addObject("myFornecedor",new FornecedorModel());
		
	return mav;
	
	}
	
	@GetMapping("/recurso")
	public ModelAndView cadastrorecurso () {
		
	ModelAndView mav = new ModelAndView("recurso");
	
	mav.addObject("myRecurso",new RecursoModel());
		
	return mav;
	
	}
	

	@GetMapping("/sistema")
	public ModelAndView cadastrosistema() {
	
	ModelAndView mav = new ModelAndView("sistema");
	
	mav.addObject("mySistema",new SistemaModel());
	
	mav.addObject("listaFornecedor", fornecedorRepository.findAll());
	
	return mav;
	
	}

}
