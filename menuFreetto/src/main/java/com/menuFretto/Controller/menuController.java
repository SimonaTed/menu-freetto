package com.menuFretto.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.menuFretto.entity.Lingue;
import com.menuFretto.entity.MenuEntity;
import com.menuFretto.service.MenuService;

@RestController
public class menuController {
	
	@Autowired
	private MenuService menuService;
	


	@GetMapping("/menu-freetto/{lingua}")
	public ModelAndView getPiattiLingua(@PathVariable String lingua) {
	ModelAndView mav = new ModelAndView("menu-freetto");
	List<MenuEntity> piatti = menuService.findByLingua(lingua);
	mav.addObject("piatti", piatti);
	return mav;
	}
	
  
    
	@GetMapping("/menu")
	public  ModelAndView home (Model model) {
		List<Lingue> lingue = new ArrayList<>();
		ModelAndView mv = new ModelAndView("menu");
		lingue.add(new Lingue("ita","italy.png"));
		lingue.add(new Lingue("ingl","great_britain.jpg"));
		lingue.add(new Lingue("cin","china.png"));
		model.addAttribute("lingue", lingue);
		return mv;
	}
}

