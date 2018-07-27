package com.vivo.gmud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vivo.gmud.model.GmudModel;
import com.vivo.gmud.repository.GmudRepository;


@Controller
public class AlterarGmudController {

	
	@Autowired
	private GmudRepository gmudRepository;
		
	/**consultar as gmuds pelo código**/
	
	@RequestMapping(value="/alterar/{codigo}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody GmudModel buscar(@PathVariable("codigo") Integer codigo){
 
		return this.gmudRepository.findById(codigo);
	}
	
	
}
