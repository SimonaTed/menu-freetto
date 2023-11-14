package it.menuFretto.Controller;

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

import it.menuFretto.entity.Lingue;
import it.menuFretto.entity.MenuEntity;
import it.menuFretto.service.MenuService;

@RestController
public class menuController {

	@Autowired
	private MenuService menuService;

	static List<Lingue> lingue = new ArrayList<>();

	static {
		lingue.add(new Lingue("ita", "../italy.png",
				"- FRIGGITORIA ARTIGIANALE - INSALATE - CENTRIFUGHE - CAFFETTERIA -"));
		lingue.add(new Lingue("ingl", "../great_britain.jpg",
				"- COFFEE BAR - SALAD - SANDWICH - FRUIT EXTRACTS - FINE FRIED FOOD -"));
		lingue.add(new Lingue("cin", "../china.png"));
		lingue.add(new Lingue("fra", "../france.png"));
		lingue.add(new Lingue("spa", "../spagna.webp"));
		lingue.add(new Lingue("ger", "../germany.jpg"));
		lingue.add(new Lingue("jap", "../japan.jpg"));
		lingue.add(new Lingue("kor", "../korea.png"));
		lingue.add(new Lingue("neth", "../netherland.webp"));
		lingue.add(new Lingue("port", "../portugal.png"));
		lingue.add(new Lingue("rush", "../russian.png"));
		lingue.add(new Lingue("arab", "../arabo.png"));
	}

	@GetMapping("/menu")
	public ModelAndView home(Model model) {
		ModelAndView mv = new ModelAndView("menu");
		model.addAttribute("lingue", lingue);
		return mv;
	}

	@GetMapping("/menu-freetto/{lingua}")
	public ModelAndView getPiattiLingua(@PathVariable String lingua) {
		ModelAndView mav = new ModelAndView("menu-freetto");
		List<MenuEntity> piatti = menuService.findByLingua(lingua);
		mav.addObject("piatti", piatti);
		mav.addObject("linguaCercata", linguaTrovata(lingua));
		return mav;
	}

	public Lingue linguaTrovata(String lingua) {
		Lingue linguaTrovata = new Lingue();
		for (Lingue li : lingue) {
			if (li.getNome().equals(lingua)) {
				linguaTrovata.setNome(li.getNome());
				linguaTrovata.setUrl(li.getUrl());
				linguaTrovata.setSottotitolo(li.getSottotitolo());
				break;
			}
		}
		return linguaTrovata;
	}

}
