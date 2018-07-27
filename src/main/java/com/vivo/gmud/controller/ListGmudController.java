package com.vivo.gmud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vivo.gmud.repository.GmudRepository;

@Controller
public class ListGmudController {

	private GmudRepository gmudRepository;
	
	@Autowired
	public void setGmudListService(GmudRepository gmudRepository) {
		
		this.gmudRepository = gmudRepository;
		
	}
	
	@RequestMapping ("/consulta")
	public ModelAndView listGmuds (){
		
		ModelAndView mav = new ModelAndView("consulta");
		
		mav.addObject("listagmud", gmudRepository.findAll());
		
		//System.out.println(gmudRepository.findAll().size());
		
		return mav;
	}
	
}
