package com.menuFretto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import com.menuFretto.entity.MenuEntity;
import com.menuFretto.entity.StrutturaEntity;
import com.menuFretto.service.MenuService;
import com.menuFretto.service.MenuServiceImpl;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@SpringBootApplication
public class MenuFreettoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MenuFreettoApplication.class, args);
	}
	
	@Autowired
	MenuService menuService;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
	private String nomePiatto;
	private String ingredienti;
	private String prezzo;
	private String prezzoDue;
	private String lingua;
		
		stuttura
		this.sottoSezione = sottoSezione;
		this.sezione = sezione;
		
		*/
	
	StrutturaEntity sezioneUno=new StrutturaEntity("I Classici");
	StrutturaEntity sezioneDue=new StrutturaEntity("I nostri Cartocci");
	StrutturaEntity sezioneTre=new StrutturaEntity("I Cartocci di pesce");
	StrutturaEntity sezioneQuattro=new StrutturaEntity("Piatti Romani");
	StrutturaEntity sezioneCinque=new StrutturaEntity("Zuppa del giorno");
	StrutturaEntity sezioneSei=new StrutturaEntity("La golosità di Nonna");
	StrutturaEntity sezioneSette=new StrutturaEntity("I nostri menù");
	StrutturaEntity sezioneOtto=new StrutturaEntity("Le Insalatone 100% Vegane","Direttamente dal contadino ... fresco e genuino");
	StrutturaEntity sezioneNove=new StrutturaEntity("Le Insalatone dello Chef","Direttamente dal contadino ... fresco e genuino");
	StrutturaEntity sezioneDieci=new StrutturaEntity("La ciabatta romana","I consigli del Salumiere Gourmet");
	StrutturaEntity sezioneUndici=new StrutturaEntity("Sandwich Light","I consigli del Salumiere Gourmet");
	StrutturaEntity sezioneDodici=new StrutturaEntity("Panini Gourmet(10 minuti)","I consigli del Salumiere Gourmet");
	StrutturaEntity sezioneTredici=new StrutturaEntity("Semplici... ma di gran valore ","I consigli del Salumiere Gourmet");
	StrutturaEntity sezioneQuatordici=new StrutturaEntity("I Taglieri Salumi e Formaggi");
	StrutturaEntity sezioneQuindici=new StrutturaEntity("Dessert monoporzione");
	StrutturaEntity sezioneSedici=new StrutturaEntity("Centrifugati");
	StrutturaEntity sezioneDiciasette=new StrutturaEntity("La Nostra Cantina");
	StrutturaEntity sezioneDiciaotto=new StrutturaEntity("Birra");
	StrutturaEntity sezioneDicianove=new StrutturaEntity("da Bere");
	StrutturaEntity sezioneVenti=new StrutturaEntity("Fine Pasto");
	StrutturaEntity sezioneVentuno=new StrutturaEntity("Cocktail");
	StrutturaEntity sezioneVentidue=new StrutturaEntity("Caffetteria");
	StrutturaEntity sezioneVentitre=new StrutturaEntity("Pasticceria");
	
	
	/*
	MenuEntity piattoIta=new MenuEntity("spaghetti al sugo","(pasta di grano 0)","5 €","","ita",sezioneUno);
	MenuEntity piattoItaDue=new MenuEntity("maltagliati","(pasta fatta a mano)","6,5 €","12,8 €","ita");
	MenuEntity piattoItaTre=new MenuEntity("bistecca","(cinta senese frollata 18 mesi)","18 €","","ita");
	menuService.addStruttura(sezioneUno);
	menuService.addPiatto(piattoIta);
	menuService.addPiatto(piattoItaDue);
	menuService.addPiatto(piattoItaTre);
	
	StrutturaEntity strutturaCineseProva=new StrutturaEntity("经典小吃");
	MenuEntity piattoProvaCinese=new MenuEntity("自制炸米团","","2,80 €","","cin",strutturaCineseProva);
	MenuEntity piattoProvaCineseDue=new MenuEntity("伴以番茄肉醬的米饭团","饭团内有拉丝莫札瑞拉奶酪","2,80 €","","cin");
	menuService.addStruttura(strutturaCineseProva);
	menuService.addPiatto(piattoProvaCinese);
	menuService.addPiatto(piattoProvaCineseDue);
	*/
	StrutturaEntity sezioneUnoIngl=new StrutturaEntity("Our Classies");
	StrutturaEntity sezioneDueIngl=new StrutturaEntity("Our Paper Cones");
	StrutturaEntity sezioneTreIngl=new StrutturaEntity("Fish paper cones");
	StrutturaEntity sezioneQuattroIngl=new StrutturaEntity("Roman dishes");
	StrutturaEntity sezioneCinqueIngl=new StrutturaEntity("Soup of the Day");
	StrutturaEntity sezioneSeiIngl=new StrutturaEntity("grandma's goodies");
	StrutturaEntity sezioneSetteIngl=new StrutturaEntity("Fretto's Menù");
	StrutturaEntity sezioneOttoIngl=new StrutturaEntity("Salads 100% Vegan","From the farmer ...fresh and genuine");
	StrutturaEntity sezioneNoveIngl=new StrutturaEntity("The Chef's Salads","From the farmer ...fresh and genuine");
	
	MenuEntity piattoIngl=new MenuEntity("Homemade Supplì","","€2,80","","ingl",sezioneUnoIngl);
	MenuEntity piattoInglDue=new MenuEntity("Codfish buttered fillet","","€4,00","","ingl",sezioneUnoIngl);
	MenuEntity piattoInglTre=new MenuEntity("Mozzarella in Carrozza","(with anchovies or speck)","€3,80","","ingl",sezioneUnoIngl);
	MenuEntity piattoInglQuattro=new MenuEntity("Arancini from Sicily","","€3,80","","ingl",sezioneUnoIngl);
	MenuEntity piattoInglCinque=new MenuEntity("Potato croquettes","","€2,80","","ingl",sezioneUnoIngl);
	MenuEntity piattoInglSei=new MenuEntity("Deep fried battered vegetables","","€10,50","","ingl",sezioneDueIngl);
	MenuEntity piattoInglSette=new MenuEntity("Chicken cutlet & chips","","€ 10,50","","ingl",sezioneDueIngl);
	MenuEntity piattoInglOtto=new MenuEntity("Chicken cnuggets & chips","","€ 10,50","","ingl",sezioneDueIngl);
	MenuEntity piattoInglNove=new MenuEntity("Chips or Frech fries","","€ 3,50","€ 5,00","ingl",sezioneDueIngl);
	MenuEntity piattoInglDieci=new MenuEntity("Mix of mini-Supplì","(Classic,Amatrciana sauce,cheese & pepper)","€ 7,50(8pz)","€ 10,00(12pz)","ingl",sezioneDueIngl);
	MenuEntity piattoInglUndici=new MenuEntity("Deep fried calamari","","€ 10,00","€ 13,50","ingl",sezioneTreIngl);
	MenuEntity piattoInglDodici=new MenuEntity("Deep fried moscardini","","€ 10,00","€ 13,50","ingl",sezioneTreIngl);
	MenuEntity piattoInglTredici=new MenuEntity("Filet of anchovies","","€ 10,00","€ 14,00","ingl",sezioneTreIngl);
	MenuEntity piattoInglQuattordici=new MenuEntity("Fish & chips","","€ 9,00","€ 12,50","ingl",sezioneTreIngl);
	MenuEntity piattoInglQuindici=new MenuEntity("Gran mix","(Calamari,moscardini,anchovies,paranza,prawn)","€ 14,50","€ 19,50","ingl",sezioneTreIngl);
	MenuEntity piattoInglSedici=new MenuEntity("Pasta","(Carbonara,amatriciana,cacio & pepe)","€ 13,00","","ingl",sezioneQuattroIngl);
	MenuEntity piattoInglDiciasette=new MenuEntity("Pasta with bolognese","","€ 14,00","","ingl",sezioneQuattroIngl);
	MenuEntity piattoInglDiciotto=new MenuEntity("Pasta with seadfood","","€ 18,00","","ingl",sezioneQuattroIngl);
	MenuEntity piattoInglDicianove=new MenuEntity("Pasta with meatballs","","€ 16,00","","ingl",sezioneQuattroIngl);
	MenuEntity piattoInglVenti=new MenuEntity("Meatnalls in sauce","","€ 14,50","","ingl",sezioneQuattroIngl);
	MenuEntity piattoInglVentUno=new MenuEntity("Roast beef","","€ 14,50","","ingl",sezioneQuattroIngl);
	MenuEntity piattoInglVentiDue=new MenuEntity("Served with two mearballs or veggieballs and spicy fried bread","","€ 12,00","","ingl",sezioneCinqueIngl);
	MenuEntity piattoInglVentiTre=new MenuEntity("Lasagna with bolognese sauce","","€ 13,00","","ingl",sezioneSeiIngl);
	MenuEntity piattoInglVentiQuattro=new MenuEntity("Lasagna with vegetables","","€ 13,00","","ingl",sezioneSeiIngl);
	MenuEntity piattoInglVentiCinque=new MenuEntity("Eggplant parmigiana","","€ 13,00","","ingl",sezioneSeiIngl);
	MenuEntity piattoInglVentiSei=new MenuEntity("Portofino","(Calamari served in peper cone + battered codifish + glass of white wine","€ 17,00","","ingl",sezioneSetteIngl);
	MenuEntity piattoInglVentiSette=new MenuEntity("Frascati","(Mix of mini-Supplì + Mozzarella in carozza + beer 300ml)","€ 13,50","","ingl",sezioneSetteIngl);
	MenuEntity piattoInglVentOtto=new MenuEntity("Vagetarian","(Potato croquette + deep fried battered vegetables + soft drink)","€ 13,50","","ingl",sezioneSetteIngl);
	MenuEntity piattoInglVentNove=new MenuEntity("Pic Nic","(Breaded chicken + french fries + soft drink)","€ 10,00","","ingl",sezioneSetteIngl);
	MenuEntity piattoInglTrenta=new MenuEntity("Tasting traditional recipes menù","(Supplì + codifish buttered fillet + Mozzarella in Carozza + arancini + croquette)","€ 15,00","","ingl",sezioneSetteIngl);
	MenuEntity piattoInglTrentuno=new MenuEntity("Tasting traditional recipes menù with Beer","","€ 18,00","","ingl",sezioneSetteIngl);
	MenuEntity piattoInglTrentDue=new MenuEntity("Green","(Mixed salad with carrot, fennet, tomato and chickpeas)","€ 9,00","","ingl",sezioneOttoIngl);
	MenuEntity piattoInglTrentaTre=new MenuEntity("Splet with Vegetables","(Fresh and light,spelt with seasonal vegetables)","€ 9,00","","ingl",sezioneOttoIngl);
	MenuEntity piattoInglTrentQuattro=new MenuEntity("Cous cous","(Strean coocked semolina with fresh seasonal vegetables)","€ 9,00","","ingl",sezioneOttoIngl);
	MenuEntity piattoInglTrentCinque=new MenuEntity("Tuna salad","(Green sald and red radish with tuna in olive oil, artichokes, black olives and tomato)","€ 12,50","","ingl",sezioneNoveIngl);
	MenuEntity piattoInglTrentSei=new MenuEntity("Salmon and avocado salad","(Green sald with crispy bread chicked bites,parmigiano cheese and fried bread, dressed with origianl Ceaser souce)","€ 12,50","","ingl",sezioneNoveIngl);
	MenuEntity piattoInglTrentSette=new MenuEntity("Pier 39","(Green sald and red radish with with king prawns, grapefruit, fennel and cherry tomatoes)","€ 12,50","","ingl",sezioneNoveIngl);
	
	
	menuService.addStruttura(sezioneUnoIngl); menuService.addStruttura(sezioneDueIngl);
	menuService.addStruttura(sezioneTreIngl); menuService.addStruttura(sezioneQuattroIngl);
	menuService.addStruttura(sezioneCinqueIngl); menuService.addStruttura(sezioneSeiIngl);
	menuService.addStruttura(sezioneSetteIngl);	menuService.addStruttura(sezioneOttoIngl);
	menuService.addStruttura(sezioneNoveIngl); 
	
	menuService.addPiatto(piattoIngl); menuService.addPiatto(piattoInglDue);
	menuService.addPiatto(piattoInglTre); menuService.addPiatto(piattoInglQuattro);
	menuService.addPiatto(piattoInglCinque); menuService.addPiatto(piattoInglSei);
	menuService.addPiatto(piattoInglSette);menuService.addPiatto(piattoInglOtto);
	menuService.addPiatto(piattoInglNove); menuService.addPiatto(piattoInglDieci);
	menuService.addPiatto(piattoInglUndici);menuService.addPiatto(piattoInglDodici);
	menuService.addPiatto(piattoInglTredici);menuService.addPiatto(piattoInglQuattordici);
	menuService.addPiatto(piattoInglQuindici);menuService.addPiatto(piattoInglSedici);
	menuService.addPiatto(piattoInglDiciasette);menuService.addPiatto(piattoInglDiciotto);
	menuService.addPiatto(piattoInglDicianove); menuService.addPiatto(piattoInglVenti);
	menuService.addPiatto(piattoInglVentUno); menuService.addPiatto(piattoInglVentiDue);
	menuService.addPiatto(piattoInglVentiTre); menuService.addPiatto(piattoInglQuattro);
	menuService.addPiatto(piattoInglVentiCinque); menuService.addPiatto(piattoInglVentiSei);
	menuService.addPiatto(piattoInglVentiSette); menuService.addPiatto(piattoInglVentOtto);
	menuService.addPiatto(piattoInglVentNove); menuService.addPiatto(piattoInglTrentDue);
	menuService.addPiatto(piattoInglTrentaTre); menuService.addPiatto(piattoInglTrentQuattro);
	menuService.addPiatto(piattoInglTrentCinque); menuService.addPiatto(piattoInglSei);
	menuService.addPiatto(piattoInglTrentSette); 
	}
	
	
	
}
