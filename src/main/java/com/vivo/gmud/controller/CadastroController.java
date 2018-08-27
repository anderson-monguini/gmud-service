package com.vivo.gmud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vivo.gmud.model.GmudModel;
import com.vivo.gmud.repository.GmudRepository;

@Controller
public class CadastroController {
	
	@Autowired
	private GmudRepository gmudRepository;
	
	/**Novo registro de GMUD **/
	
	@PostMapping ("/cadastrar")
	public ModelAndView salvarGmud (@Valid GmudModel gmud, BindingResult brGmud , ModelAndView request){
		
		try {
				ModelAndView mav = new ModelAndView("cadastro");
			
				if (brGmud.hasErrors()) {
					
					mav.addObject("critical", "Erro na validação do Código");
					mav.addObject("myVal", gmud);
				
					return mav;
				
			}
			
			
				this.gmudRepository.save(gmud);
				
				mav.addObject("success", "Cadastrado com Sucesso");
				
				mav.addObject("myVal", gmud);				
				return mav;
				
			}catch (Exception e) {
				
				ModelAndView mav = new ModelAndView("cadastro");
				mav.addObject("error", "Temos um problema!!");
				
				mav.addObject("myVal", gmud);				
				return mav;
			
			}
		
		}
	
	/**Fim serviço de cadastro**/
	
	@GetMapping ("/cadastro/{codigo}")
	public ModelAndView editar (@PathVariable Integer codigo) {
		
		ModelAndView mav = new ModelAndView("cadastro");
		
		mav.addObject("myVal", gmudRepository.findById(codigo));
		
		return mav;
		
	}	
}
