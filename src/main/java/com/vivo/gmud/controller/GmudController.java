package com.vivo.gmud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GmudController {
	
	@GetMapping("/teste")
	public ModelAndView teste () {
		
	ModelAndView mav = new ModelAndView("index");
	
	mav.addObject("texto", "olamundo");
	
	mav.addObject("texto2", "olamundo2");
	
	return mav;
	
	}
	
	@GetMapping("/teste/{id}")
	public ModelAndView teste2 (@PathVariable String id) {
		
	ModelAndView mav = new ModelAndView("teste2");

	mav.addObject("texto", id);
	
	mav.addObject("texto2", "olamundo2");
	
	return mav;
	
	}
	
	@GetMapping("/menu")
	public ModelAndView testemenu () {
		
	ModelAndView mav = new ModelAndView("menu");
	
	return mav;
	
	}
	
}
