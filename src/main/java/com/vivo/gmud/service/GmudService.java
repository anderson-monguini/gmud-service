package com.vivo.gmud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivo.gmud.model.GmudModel;
import com.vivo.gmud.model.ResponseModel;
import com.vivo.gmud.repository.GmudRepository;


@RestController
@RequestMapping("/service")
public class GmudService {

	@Autowired
	private GmudRepository gmudRepository;
	
	/**Salvar novo registro para GMUD*/
	
	@RequestMapping (value = "/gmud", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody GmudModel gmud){
		
		try {
			
			this.gmudRepository.save(gmud);
			
			return new ResponseModel(1, "Registro salvo com sucesso!");
			
		}catch (Exception e) {
			
			return new ResponseModel (0,e.getMessage());
		}
	
	}
	
	
	/**Atualizar registro de GMUD **/
	
	@RequestMapping(value="/gmud", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody GmudModel gmud){
 
		try {
 
			this.gmudRepository.save(gmud);		
 
			return new ResponseModel(1,"Registro atualizado com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());
		}
	}
	
	/**consultar as gmuds **/
	
	@RequestMapping(value="/gmud", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<GmudModel> consultar(){
 
		return this.gmudRepository.findAll();
	}
	
	
	/**consultar as gmuds pelo código**/
	
	@RequestMapping(value="/gmud/{codigo}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody GmudModel buscar(@PathVariable("codigo") Integer codigo){
 
		return this.gmudRepository.findById(codigo);
	}
		
	
	/**excluir gmuds pelo código**/
	
	@RequestMapping(value="/gmud/{codigo}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel excluir(@PathVariable("codigo") Integer codigo){
 
		GmudModel gmudModel = gmudRepository.findById(codigo);
 
		try {
 
			gmudRepository.delete(gmudModel);
 
			return new ResponseModel(1, "Registro excluido com sucesso!");
 
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}
	
}
