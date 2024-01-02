package it.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import it.menu.entity.DescrizioneEntity;
import it.menu.service.MenuService;

@RestController
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	@GetMapping("/menu-freetto-controllerStandard/{sigla}")
	public List<DescrizioneEntity> getPiattiLinguaStandard(@PathVariable String sigla) {
		return menuService.findDescrizioneByLingua(sigla);
	}
	

	@GetMapping("/menu-freetto/{sigla}")
	public ModelAndView getPiattiLingua(@PathVariable String sigla) {
		ModelAndView mav = new ModelAndView("menu-freetto");
		List<DescrizioneEntity> sezioni = menuService.findDescrizioneByLingua(sigla);
		mav.addObject("sezioni", sezioni);
		return mav;
	}
	
	
}
