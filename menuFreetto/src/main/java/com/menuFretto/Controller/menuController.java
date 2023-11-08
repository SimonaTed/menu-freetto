package com.menuFretto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.menuFretto.entity.MenuItaEntity;
import com.menuFretto.service.MenuService;

@RestController
@RequestMapping("/freetto")
public class menuController {
	
	@Autowired
	private MenuService menuService;
	
	/*classico get 
	@GetMapping("/menu-ita/")
	public ResponseEntity<List<MenuItaEntity>> trovaTuttiiPiatti(){
		return menuService.tuttiPiatti();
	}*/
	
	@GetMapping("/menu-ita/")
	public ModelAndView home () {
		ModelAndView mv = new ModelAndView("home-page");
		mv.addObject("titoloPagina", "Portale Studenti");
		return mv;
	}
	
	/*
	@GetMapping("/elenco-studenti")
	public ModelAndView getStudenti() {
		ModelAndView mav = new ModelAndView("elenco-studenti");
		mav.addObject("allStudenti", ss.getStudenti());
		return mav;
	}
	*/
}
