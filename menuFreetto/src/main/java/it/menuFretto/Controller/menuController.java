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
import it.menuFretto.entity.StrutturaEntity;
import it.menuFretto.service.MenuService;

@RestController
public class menuController {

	@Autowired
	private MenuService menuService;

	static List<Lingue> lingue = new ArrayList<>();

	static {
		lingue.add(new Lingue("ita", "../images/italy.png",
				"- FRIGGITORIA ARTIGIANALE - INSALATE - CENTRIFUGHE - CAFFETTERIA -","BENVENUTI DA",
				"**TUTTI I NOSTRI PRODOTTI SONO ABBATTUTI E CONSERVATI A -28° ** COSTO DEL COPERTO €1**",
				"**PER INFO SU SOSTANZE E ALLERGENI È POSSIBILE CONSULTARE L'APPOSITA DOCUMENTAZIONE FORNITA A RICHIESTA DAL PERSONALE**"));
		lingue.add(new Lingue("ingl", "../images/great_britain.jpg",
				"- COFFEE BAR - SALAD - SANDWICH - FRUIT EXTRACTS - FINE FRIED FOOD -", "WELCOME TO",
				"**ALL OUR PRODUCT ARE FREEZED -28° ** COVER CHARGE €1 PER PERSON**",
				"**FOR INFO ON SUBSTANCES AND ALLERGENS, IT IS POSSIBLE TO CONSULT THE APPROPRIATE DOCUMENTATION PROVIDED UPON REQUEST BY THE STAFF**"));
		lingue.add(new Lingue("cin", "../images/china.png", "- 工匠油炸锅 - 沙拉 - 离心机 - 自助餐厅 -","欢迎来到",
				"我们所有的产品均经过急速冷冻并储存在 -28° ** 成本 €1",
				"**有关物质和过敏原的信息，您可以查阅工作人员根据要求提供的特别文件**"));
		lingue.add(new Lingue("fra", "../images/france.png",
				"- FRITEUSES ARTISANALES - SALADES - CENTRIFUGES - CAFÉ -","BIENVENUE CHEZ",
				"**TOUS NOS PRODUITS SONT REFROIDIS ET CONSERVÉS À -28° ** COÛT DE COUVERURE 1 €**",
				"**POUR INFORMATIONS SUR LES SUBSTANCES ET LES ALLERGÈNES VOUS POUVEZ CONSULTER LA DOCUMENTATION SPÉCIALE FOURNIE SUR DEMANDE DU PERSONNEL**"));
		lingue.add(new Lingue("spa", "../images/spagna.webp",
				"- FREIDORAS ARTESANALES - ENSALADAS - CENTRIFUGAS - CAFETERIA -","BIENVENIDO A",
				"**TODOS NUESTROS PRODUCTOS SON REFRIGERADOS Y ALMACENADOS A -28° ** CUBIERTO 1€**",
				"**PARA INFORMACIÓN SOBRE SUSTANCIAS Y ALÉRGENOS PUEDE CONSULTAR LA DOCUMENTACIÓN ESPECIAL QUE SE PROPORCIONA A SOLICITUD POR EL PERSONAL**"));
		lingue.add(new Lingue("ger", "../images/germany.jpg",
				"- HANDWERKLICHE FRITEUSEN – SALATE – ZENTRIFUGALEN – COFFEESHOP –","WILLKOMMEN BEI",
				"**ALLE UNSERE PRODUKTE WERDEN SCHOCKGEKÜHLT UND BEI -28° GELAGERT ** DECKUNGSKOSTEN 1 €**",
				"**INFORMATIONEN ZU STOFFEN UND ALLERGENEN KÖNNEN SIE AUF ANFRAGE DES PERSONALS IN DER SPEZIELLEN DOKUMENTATION EINSCHREIBEN**"));
		lingue.add(new Lingue("jap", "../images/japan.jpg",
				"- 職人のフライヤー - サラダ - 遠心分離機 - コーヒーショップ -","ようこそ",
				"**当社の製品はすべて急速冷却され、-28°で保管されています。** カバーコスト €1**",
				"**物質とアレルゲンに関する情報については、スタッフのリクエストに応じて提供される特別文書を参照してください**"));
		lingue.add(new Lingue("kor", "../images/korea.png",
				"- 장인 튀김기 - 샐러드 - 원심분리기 - 커피숍 -","환영합니다",
				"**우리의 모든 제품은 급속 냉각되어 -28°에서 보관됩니다. ** 커버 비용 €1**",
				"**물질 및 알레르기 유발 물질에 대한 정보는 직원의 요청 시 제공되는 특별 문서를 참조할 수 있습니다**"));
		lingue.add(new Lingue("neth", "../images/netherland.webp",
				"- AMBACHTELIJKE FRITEUSES - SALADES - CENTRIFUGAALEN - KOFFIESHOP -", "WELKOM BIJ",
				"**AL ONZE PRODUCTEN WORDEN BLAASTGEKOELD EN OPGESLAGEN BIJ -28° ** DEKKINGSKOSTEN € 1**",
				"**VOOR INFORMATIE OVER STOFFEN EN ALLERGENEN KUNT U DE SPECIALE DOCUMENTATIE RAADPLEGEN DIE OP VERZOEK DOOR HET PERSONEEL WORDT VERSTREKT**"));
		lingue.add(new Lingue("port", "../images/portugal.png",
				"- FRITADEIRAS ARTESANAIS - SALADAS - CENTRÍFUGAS - CAFETEIRA -","BEM-VINDO A",
				"**TODOS OS NOSSOS PRODUTOS SÃO REFRIGERADOS E ARMAZENADOS A -28° ** CUSTO DE COBERTURA 1€**",
				"**PARA INFORMAÇÕES SOBRE SUBSTÂNCIAS E ALERGÉNIOS PODE CONSULTAR A DOCUMENTAÇÃO ESPECIAL FORNECIDA MEDIANTE PEDIDO DO PESSOAL**"));
		lingue.add(new Lingue("rush", "../images/russian.png",
				"- ARTISAN ФРИТЮРНИЦЫ - САЛАТЫ - ЦЕНТРОБЕГИ - КОФЕ МАГАЗИН -", "ДОБРО ПОЖАЛОВАТЬ В",
				"**ВСЕ НАШИ ПРОДУКТЫ ПРОДОЛЖАЮТСЯ ШОКОВОГО ОХЛАЖДЕНИЯ И ХРАНЯТСЯ ПРИ -28° ** СТОИМОСТЬ 1 ЕВРО**",
				"**ДЛЯ ИНФОРМАЦИИ О ВЕЩЕСТВАХ И АЛЛЕРГЕНАХ ВЫ МОЖЕТЕ СОДЕРЖАТЬ СПЕЦИАЛЬНУЮ ДОКУМЕНТАЦИЮ, ПРЕДОСТАВЛЯЕМУЮ ПО ЗАПРОСУ ПЕРСОНАЛА**"));
		lingue.add(new Lingue("arab", "../images/arabo.png",
				"- مقالي حرفية - السلطات - أجهزة الطرد المركزي - مقهى -","مرحبًا بك في",
				"** جميع منتجاتنا يتم تبريدها وتخزينها في درجة حرارة -28 درجة ** تكلفة التغطية 1 يورو **",
				"**للحصول على معلومات حول المواد والمواد المسببة للحساسية، يمكنك الرجوع إلى الوثائق الخاصة المقدمة بناءً على طلب الموظفين**"));
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
		List<StrutturaEntity> sezioni = menuService.findStrutturaEntityByLingua(lingua);
		mav.addObject("piatti", piatti);
		mav.addObject("linguaCercata", linguaTrovata(lingua));
		mav.addObject("sezioni", sezioni);
		return mav;
	}

	public Lingue linguaTrovata(String lingua) {
		Lingue linguaTrovata = new Lingue();
		for (Lingue li : lingue) {
			if (li.getNome().equals(lingua)) {
				linguaTrovata.setNome(li.getNome());
				linguaTrovata.setUrl(li.getUrl());
				linguaTrovata.setSottotitolo(li.getSottotitolo());
				linguaTrovata.setBenvenuto(li.getBenvenuto());
				linguaTrovata.setAvvertenze(li.getAvvertenze());
				linguaTrovata.setAllergeni(li.getAllergeni());
				break;
			}
		}
		return linguaTrovata;
	}

}
