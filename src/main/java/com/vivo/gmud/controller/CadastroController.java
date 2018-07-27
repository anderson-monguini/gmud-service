package com.vivo.gmud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public ModelAndView salvarGmud (GmudModel gmud, ModelAndView request){
		
		try {
				
			this.gmudRepository.save(gmud);
				
				ModelAndView mav = new ModelAndView("cadastro");
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
}
