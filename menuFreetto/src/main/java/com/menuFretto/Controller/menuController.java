package com.menuFretto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.menuFretto.entity.MenuEntity;
import com.menuFretto.service.MenuService;

@RestController
public class menuController {
	
	@Autowired
	private MenuService menuService;
	
	
	/* prova json su postman
	 * @GetMapping("/menu-ita/")
	
	
	public ResponseEntity<List<MenuEntity>> trovaTuttiiPiatti(){
		return menuService.tuttiPiatti();
	}
	
	
	@GetMapping("/menu-freetto/{lingua}")
	public ResponseEntity<List<MenuEntity>> trovaTuttiIPiattiPerLingua(@PathVariable String lingua){
		return menuService.findByLingua(lingua);
	}
	*/
	
	
	
	/*
	 * non se serve ancora per la navigazione
	@GetMapping("/menu-ita/")
	public ModelAndView home () {
		ModelAndView mv = new ModelAndView("home-page");
		mv.addObject("titoloPagina", "Portale Studenti");
		return mv;
	}
	
	*/
	
	
	//bisogna aggiungere il nome pagina da scegliere 
	@GetMapping("/menu-freetto/{lingua}")
	public ModelAndView getPiattiPerLingua(@PathVariable String lingua) {
		ModelAndView mav = new ModelAndView("");
		mav.addObject("",menuService.findByLingua(lingua));
		return mav;
	}
	
	
}
