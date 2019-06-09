package com.vivo.gmud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vivo.gmud.model.FornecedorModel;
import com.vivo.gmud.model.GmudModel;
import com.vivo.gmud.model.RecursoModel;
import com.vivo.gmud.model.SistemaModel;
import com.vivo.gmud.repository.FornecedorRepository;

@Controller
public class GmudController {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	
	@GetMapping("/menu")
	public ModelAndView testemenu () {
		
	ModelAndView mav = new ModelAndView("/menu");
	
	return mav;
	
	}
	
	@GetMapping("/cadastro")
	public ModelAndView testecadastro (Model model){
		
	ModelAndView mav = new ModelAndView("/cadastro");
	
	mav.addObject("myVal",new GmudModel());
	
	List<FornecedorModel> fornecedores = fornecedorRepository.findAll();
	model.addAttribute("fornecedores", fornecedores);
	
	return mav;
	
	}
	
	@GetMapping("/fornecedor")
	public ModelAndView cadastrofornecedor () {
		
	ModelAndView mav = new ModelAndView("/fornecedor");
	
	mav.addObject("myFornecedor",new FornecedorModel(null));
		
	return mav;
	
	}
	
	@GetMapping("/recurso")
	public ModelAndView cadastrorecurso () {
		
	ModelAndView mav = new ModelAndView("/recurso");
	
	mav.addObject("myRecurso",new RecursoModel());
		
	return mav;
	
	}
	

	@GetMapping("/sistema")
	public ModelAndView cadastrosistema (Model model) {
			
	ModelAndView mav = new ModelAndView("/sistema");
	
	mav.addObject("mySistema",new SistemaModel(null, null));
	
	List<FornecedorModel> fornecedores = fornecedorRepository.findAll();
	model.addAttribute("fornecedores", fornecedores);
	
	return mav;
	
	}
	
	@GetMapping("/")
    public String root() {
        return "menu";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

}
