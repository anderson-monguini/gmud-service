package com.vivo.gmud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vivo.gmud.model.FornecedorModel;
import com.vivo.gmud.repository.FornecedorRepository;

@Controller
public class CadastroFornecedorController {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	
	/**Nova Fábrica**/
	
	@PostMapping ("/fornecedor")
	public ModelAndView salvarFornecedor (@Valid FornecedorModel fornecedor, BindingResult brFornecedor){
	
		
		try {
			ModelAndView mav = new ModelAndView("fornecedor");
		
			if (brFornecedor.hasErrors()) {
				
				mav.addObject("critical", "Erro na validação do Código");
				mav.addObject("myFornecedor", fornecedor);
			
				return mav;
			
		}		
		
			this.fornecedorRepository.save(fornecedor);
			
			mav.addObject("success", "Cadastrado com Sucesso");
			
			mav.addObject("myFornecedor", fornecedor);
			
			return mav;
			
		}catch (Exception e) {
			
			ModelAndView mav = new ModelAndView("fornecedor");
			mav.addObject("error", "Temos um problema!!");
			
			mav.addObject("myFornecedor", fornecedor);
			
			return mav;
		
		}
		
	}
	
	@GetMapping ("/fornecedor/{codigo}")
	public ModelAndView editarFornecedor (@PathVariable Integer id_fonecedor) {
		
		ModelAndView mav = new ModelAndView("fornecedor");
		
		mav.addObject("myFornecedor", fornecedorRepository.findById(id_fonecedor));
		
		return mav;
	}
}
