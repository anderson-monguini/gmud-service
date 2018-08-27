package com.vivo.gmud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vivo.gmud.model.RecursoModel;
import com.vivo.gmud.repository.RecursoRepository;

@Controller
public class CadastroRecursoController {

	@Autowired
	private RecursoRepository recursoRepository;
	
	/**Nova Recurso**/
	
	@PostMapping ("/recurso")
	public ModelAndView salvarRecurso (@Valid RecursoModel recurso, BindingResult brRecurso , ModelAndView request) {
		
		try {
			ModelAndView mav = new ModelAndView("recurso");
		
			if (brRecurso.hasErrors()) {
				
				mav.addObject("critical", "Erro na validação do Código");
				mav.addObject("myRecurso", recurso);
			
				return mav;
			
		}
		
			this.recursoRepository.save(recurso);
			
			mav.addObject("success", "Cadastrado com Sucesso");
			
			mav.addObject("myRecurso", recurso);
			
			return mav;
			
			}catch (Exception e) {
			
			ModelAndView mav = new ModelAndView("recurso");
			mav.addObject("error", "Temos um problema!!");
			
			mav.addObject("myRecurso", recurso);
			
			return mav;	
		
		}
	}
		
		@GetMapping ("/recurso/{codigo}")
		public ModelAndView editarRecurso (@PathVariable Integer id_recurso) {
			
			ModelAndView mav = new ModelAndView("recurso");
			
			mav.addObject("myRecurso", recursoRepository.findById(id_recurso));
			
			return mav;
		}
	}
