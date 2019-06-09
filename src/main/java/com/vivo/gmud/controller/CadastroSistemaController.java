package com.vivo.gmud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vivo.gmud.model.SistemaModel;
import com.vivo.gmud.repository.SistemaRepository;


@Controller
public class CadastroSistemaController {

	@Autowired
	private SistemaRepository sistemaRepository;
	
	@PostMapping ("/sistema")
public ModelAndView salvarSistema (@Valid SistemaModel sistema, BindingResult brSistema) {
		
		try {
			ModelAndView mav = new ModelAndView("sistema");
			
			
			if (brSistema.hasErrors()) {
				
				mav.addObject("critical", "Erro na validação do Código");
				mav.addObject("mySistema", sistema);
			
				return mav;
			
		}
		
			this.sistemaRepository.save(sistema);
			
			mav.addObject("success", "Cadastrado com Sucesso");
			mav.addObject("mySistema", sistema);
			
			return mav;
			
			}catch (Exception e) {
			
			ModelAndView mav = new ModelAndView("sistema");
			mav.addObject("error", "Temos um problema!!");
			
			mav.addObject("mySistema", sistema);
			
			return mav;	
		
		}
	}
		
		@GetMapping ("/sistema/{codigo}")
		public ModelAndView editarSistema (@PathVariable Integer id_sistema) {
			
			ModelAndView mav = new ModelAndView("sistema");
			
			mav.addObject("mySistema", sistemaRepository.findById(id_sistema));
			
			return mav;
		}
}