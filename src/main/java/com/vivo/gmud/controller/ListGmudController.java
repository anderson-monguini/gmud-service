package com.vivo.gmud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vivo.gmud.model.GmudModel;
import com.vivo.gmud.model.PagerModel;
import com.vivo.gmud.repository.ConsultaRepository;
import com.vivo.gmud.repository.GmudRepository;

@Controller
public class ListGmudController {
	
	
	private static final int BUTTONS_TO_SHOW = 5;
    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 10;
    private static final int[] PAGE_SIZES = { 5, 10};
    
    @Autowired
    ConsultaRepository consultarepository;
    GmudRepository gmudrepository;
	
	@RequestMapping ("/consulta")
    public ModelAndView homepage(@RequestParam("pageSize") Optional<Integer> pageSize, @RequestParam("page") Optional<Integer> page){
        
		if(consultarepository.count()!=0){
            ;//pass
        }else{
        	System.out.println("Teste mal sucedido");
        }
        
		ModelAndView mav = new ModelAndView("consulta");
                
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
      
        System.out.println("Aqui é o Repositorio de GMUD " + consultarepository.findAll());
              
        Page<GmudModel> gmudlist = consultarepository.findAllByOrderByDataDesc(PageRequest.of(evalPage, evalPageSize));
                     
        System.out.println("Lista de GMUD total paginas" + gmudlist.getTotalPages() + "gmud list get number " + gmudlist.getNumber());
        
        PagerModel pager = new PagerModel(gmudlist.getTotalPages(),gmudlist.getNumber(),BUTTONS_TO_SHOW);
        
        
        mav.addObject("gmudlist",gmudlist);
        
        mav.addObject("selectedPageSize", evalPageSize);
        
        mav.addObject("pageSizes", PAGE_SIZES);
        
        mav.addObject("pager", pager);
               
        return mav;

	}
	
}
