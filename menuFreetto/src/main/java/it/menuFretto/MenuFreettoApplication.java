package it.menuFretto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import it.menuFretto.entity.MenuEntity;
import it.menuFretto.entity.StrutturaEntity;
import it.menuFretto.service.MenuService;
import it.menuFretto.service.MenuServiceImpl;
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
	
	
	
	MenuEntity piattoIta=new MenuEntity("spaghetti al sugo","(pasta di grano 0)","5 €","","ita",sezioneUno);
	//MenuEntity piattoItaDue=new MenuEntity("maltagliati","(pasta fatta a mano)","6,5 €","12,8 €","ita");
	//MenuEntity piattoItaTre=new MenuEntity("bistecca","(cinta senese frollata 18 mesi)","18 €","","ita");
	menuService.addStruttura(sezioneUno);
	menuService.addPiatto(piattoIta);
	/*menuService.addPiatto(piattoItaDue);
	menuService.addPiatto(piattoItaTre);*/
	/*
	StrutturaEntity strutturaCineseProva=new StrutturaEntity("经典小吃");
	MenuEntity piattoProvaCinese=new MenuEntity("自制炸米团","","2,80 €","","cin",strutturaCineseProva);
	MenuEntity piattoProvaCineseDue=new MenuEntity("伴以番茄肉醬的米饭团","饭团内有拉丝莫札瑞拉奶酪","2,80 €","","cin");
	menuService.addStruttura(strutturaCineseProva);
	menuService.addPiatto(piattoProvaCinese);
	menuService.addPiatto(piattoProvaCineseDue);
	*/
	
	// sezione inglese	
	StrutturaEntity sezioneUnoIngl=new StrutturaEntity("Our Classies");
	StrutturaEntity sezioneDueIngl=new StrutturaEntity("Our Paper Cones");
	StrutturaEntity sezioneTreIngl=new StrutturaEntity("Fish paper cones");
	StrutturaEntity sezioneQuattroIngl=new StrutturaEntity("Roman dishes");
	StrutturaEntity sezioneCinqueIngl=new StrutturaEntity("Soup of the Day");
	StrutturaEntity sezioneSeiIngl=new StrutturaEntity("grandma's goodies");
	StrutturaEntity sezioneSetteIngl=new StrutturaEntity("Fretto's Menù");
	StrutturaEntity sezioneOttoIngl=new StrutturaEntity("Salads 100% Vegan","From the farmer ...fresh and genuine");
	StrutturaEntity sezioneNoveIngl=new StrutturaEntity("The Chef's Salads","From the farmer ...fresh and genuine");
	StrutturaEntity sezioneDieciIngl=new StrutturaEntity("The Ciabatta Romana","The tips of the gourmet grocer");
	StrutturaEntity sezioneUndiciIngl=new StrutturaEntity("Sandwich Light","The tips of the gourmet grocer");
	StrutturaEntity sezioneDodiciIngl=new StrutturaEntity("Sandiwich gourmet(10min)","The tips of the gourmet grocer");
	StrutturaEntity sezioneTrediciIngl=new StrutturaEntity("Simple... but of gret value","The tips of the gourmet grocer");
	StrutturaEntity sezioneQuatordiciIngl=new StrutturaEntity("Selection of cold cuts and cheese");
	StrutturaEntity sezioneQuindiciIngl=new StrutturaEntity("Dessert");
	StrutturaEntity sezioneSediciIngl=new StrutturaEntity("Fresh fruit juice");
	StrutturaEntity sezioneDiciasetteIngl=new StrutturaEntity("Yogurt Parfait with fruits and granola");
	StrutturaEntity sezioneDiciottoIngl=new StrutturaEntity("Seasonal fruit salad");
	StrutturaEntity sezioneDiciaNoveIngl=new StrutturaEntity("Juice Extracts","Completely NATURAL... only fruit and fresh vegetables with no added sugar and ice ");
	StrutturaEntity sezioneVentiIngl=new StrutturaEntity("Our Winery");
	StrutturaEntity sezioneVentUnoIngl=new StrutturaEntity("Beer");
	StrutturaEntity sezioneVentDueIngl=new StrutturaEntity("Drinks");
	StrutturaEntity sezioneVentTreIngl=new StrutturaEntity("Spirits");
	StrutturaEntity sezioneVentQuattroIngl=new StrutturaEntity("Cocktail");
	StrutturaEntity sezioneVentCinqueIngl=new StrutturaEntity("Cafè Hot Drinks");
	StrutturaEntity sezioneVentSeiIngl=new StrutturaEntity("Sweets");
	
	
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
	MenuEntity piattoInglTrentOtto=new MenuEntity("Classica","(Ham with Mozzarella and dried tomatoes)","€ 7,00","","ingl",sezioneDieciIngl);
	MenuEntity piattoInglTrentNove=new MenuEntity("Rustica","(Raw ham with Mozzarella cheese dressed with black olives cream)","€ 7,00","","ingl",sezioneDieciIngl);
	MenuEntity piattoInglQuaranta=new MenuEntity("Caprese","(Tomato and Mozzarella cheese on lettuce bed,dressed with 'Pesto' sauce)","€ 7,00","","ingl",sezioneDieciIngl);
	MenuEntity piattoInglQuarantUno=new MenuEntity("Cotoletta","(Tender chicken cutlet with mayo on tomato and lettuce bed)","€ 7,00","","ingl",sezioneDieciIngl);
	MenuEntity piattoInglQuarantDue=new MenuEntity("Bresaola","(Whaole grain bread with 'Bresaola',rocket and Parmigiano cheese)","€ 7,50","","ingl",sezioneUndiciIngl);
	MenuEntity piattoInglQuarantTre=new MenuEntity("Tacchino","(Flat bread with roasted turkey,fresh cream tomato)","€ 7,50","","ingl",sezioneUndiciIngl);
	MenuEntity piattoInglQuarantQuattro=new MenuEntity("'Farmer's sandwich'","(Whaole grain bread with grilled seasonal vegetables and 'Pecorino' cheese)","€ 7,50","","ingl",sezioneUndiciIngl);
	MenuEntity piattoInglQuarantCinque=new MenuEntity("Norvegese","(Bagel with smoked norwegian salmon,cheese cream,lime,pink pepper)","€ 8,00","","ingl",sezioneDodiciIngl);
	MenuEntity piattoInglQuarantSei=new MenuEntity("American Style sandwich","(Meatballs on a lettuce and tomato bed dressed with 'Green Sauce')","€ 8,00","","ingl",sezioneDodiciIngl);
	MenuEntity piattoInglQuarantSette=new MenuEntity("Americano Veg","(Eggplant and smocked Mozzarella balls on a lattuce and tomato bed with mayo)","€ 8,00","","ingl",sezioneDodiciIngl);
	MenuEntity piattoInglQuarantOtto=new MenuEntity("Pizza & 'Mortazza'","(the oven focaccia with 'Mortadella' dressed with pistacchio cream)","€ 6,50","","ingl",sezioneTrediciIngl);
	MenuEntity piattoInglQuarantNove=new MenuEntity("Toast","(Classic light toast with coocked ham and Mozzarella cheese)","€ 5,00","","ingl",sezioneTrediciIngl);
	MenuEntity piattoInglCinquanta=new MenuEntity("Selection of cold cuts and cheese","","Medium € 11,00 ","Large € 18,50","ingl",sezioneQuatordiciIngl);
	MenuEntity piattoInglCinquantaUno=new MenuEntity("Semifreddo Tiramisù","(Sweet Tiramisù cream with sponge cake soaked in Italian coffee)","€ 6,00 ","","ingl",sezioneQuindiciIngl);
	MenuEntity piattoInglCinquantaDue=new MenuEntity("Chocolate Sufflè","(Dark chocolate sufflè with soft heat chocolate cream)","€ 6,00 ","","ingl",sezioneQuindiciIngl);
	MenuEntity piattoInglCinquantaTre=new MenuEntity("Millefrolle Chocolate & Orange","(Crispy biscuits with hazeinuts between two soft mousse chocolate and orange)","€ 6,00 ","","ingl",sezioneQuindiciIngl);
	MenuEntity piattoInglCinquantaQuattro=new MenuEntity("Cheesecake","(A crusty crushed cookies bottom layer with fresh cream cheese and a red fruit topping)","€ 6,00 ","","ingl",sezioneQuindiciIngl);
	MenuEntity piattoInglCinquantaCinque=new MenuEntity("Semifreddo with Pistachio","(Pistacchio mousse decorated with pistachio grain)","€ 6,00 ","","ingl",sezioneQuindiciIngl);
	MenuEntity piattoInglCinquantaSei=new MenuEntity("Fresh fruit juice","","Medium € 4,00 ","Large € 6,00","ingl",sezioneSediciIngl);
	MenuEntity piattoInglCinquantaSette=new MenuEntity("Yogurt Parfait with fruits and granola","Tasting traditional recipes menu with Beer","Medium € 5,00 ","Large € 7,00","ingl",sezioneDiciasetteIngl);
	MenuEntity piattoInglCinquantaOtto=new MenuEntity("Seasonal fruit salad","","Medium € 5,00 ","Large € 7,00","ingl",sezioneDiciottoIngl);
	MenuEntity piattoInglCinquantaNove=new MenuEntity("Classic","(Carrot,apple and ginger)","Medium € 5,50 ","Large € 8,00","ingl",sezioneDiciaNoveIngl);
	MenuEntity piattoInglSessanta=new MenuEntity("Ace","(Orange,carrot,lemon[ginger])","Medium € 5,50 ","Large € 8,00","ingl",sezioneDiciaNoveIngl);
	MenuEntity piattoInglSessantaUno=new MenuEntity("Anti Water retention","(Pineapple,fennel and apple)","Medium € 5,50 ","Large € 8,00","ingl",sezioneDiciaNoveIngl);
	MenuEntity piattoInglSessantaDue=new MenuEntity("Depurative","(Pineapple,fennel,lemon[ginger])","Medium € 5,50 ","Large € 8,00","ingl",sezioneDiciaNoveIngl);
	MenuEntity piattoInglSessantaTre=new MenuEntity("Vitamic","(Kiwi,apple,ginger)","Medium € 5,50 ","Large € 8,00","ingl",sezioneDiciaNoveIngl);
	MenuEntity piattoInglSessantaQuattro=new MenuEntity("Fat burning","(Grapefruit,lemon,lime,pinapple and ginger)","Medium € 5,50 ","Large € 8,00","ingl",sezioneDiciaNoveIngl);
	MenuEntity piattoInglSessantaCinque=new MenuEntity("Pinzimonio","(Clery,carrot,tennel seasoned with oil,salt and pepper)","Medium € 5,50 ","Large € 8,00","ingl",sezioneDiciaNoveIngl);
	MenuEntity piattoInglSessantaSei=new MenuEntity("Falanghina dei campi flegrei D.O.P","","Glass €6,00","Bottle €24,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSessantaSette=new MenuEntity("Falanghina dei campi flegrei D.O.P(375ml)","","","Bottle €13,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSessantaOtto=new MenuEntity("VermentinoDi Sardegna D.O.C","","Glass €6,00","Bottle €24,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSessantaNove=new MenuEntity("Pecorino I.G.T","","Glass €6,00","Bottle €24,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettanta=new MenuEntity("Riflessi 'Circeo' D.O.C","","Glass €6,50","Bottle €26,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettantUno=new MenuEntity("Chardonnay(375ml)","","Glass €6,00","Bottle €13,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettantaDue=new MenuEntity("Sauvignon Blanc 'Fumaio' Castello Banfi","","Glass €6,50","Bottle €26,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettantaTre=new MenuEntity("Gewurtraminer","","Glass €7,00","Bottle €29,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettantaQuattro=new MenuEntity("Prosecco","","Glass €5,00","Bottle €21,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettantaCinque=new MenuEntity("Merlot in purezza D.O.C","","Glass €7,00","Bottle €28,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettantaSei=new MenuEntity("Merlot in purezza D.O.C(375ml)","","","Bottle €13,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettantaSette=new MenuEntity("Cabernet Sauvignon 'Col di Sasso' Castello Banfi","","Glass €7,00","Bottle €28,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettantaOtto=new MenuEntity("Chianti Classico D.O.C","","Glass €7,00","Bottle €28,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglSettantaNove=new MenuEntity("Chianti Riserva D.O.C","","Glass €8,00","Bottle €38,00","ingl",sezioneVentiIngl);
	MenuEntity piattoInglOttanta=new MenuEntity("Nastro Azzurro(330ml)",""," €4,50","","ingl",sezioneVentUnoIngl);
	MenuEntity piattoInglOttantaUno=new MenuEntity("Ichnusa(330ml)",""," €4,50","","ingl",sezioneVentUnoIngl);
	MenuEntity piattoInglOttantaDue=new MenuEntity("Menebrea(330ml)",""," €4,50","","ingl",sezioneVentUnoIngl);
	MenuEntity piattoInglOttantaTre=new MenuEntity("IPA(330ml)",""," €5,50","","ingl",sezioneVentUnoIngl);
	MenuEntity piattoInglOttantaQuattro=new MenuEntity("Heineken(330ml)",""," €4,50","","ingl",sezioneVentUnoIngl);
	MenuEntity piattoInglOttantaCinque=new MenuEntity("Unfiltered Ichnusa(500ml)",""," €5,50","","ingl",sezioneVentUnoIngl);
	MenuEntity piattoInglOttantaSei=new MenuEntity("Peroni Riserva 'Red'(500ml)",""," €5,90","","ingl",sezioneVentUnoIngl);
	MenuEntity piattoInglOttantaSette=new MenuEntity("Messina with marine salt(500ml)",""," €5,50","","ingl",sezioneVentUnoIngl);
	MenuEntity piattoInglOttantaOtto=new MenuEntity("Weiss clear",""," €5,50","","ingl",sezioneVentUnoIngl);
	MenuEntity piattoInglOttantaNove=new MenuEntity("Water(500ml)",""," €2,00","","ingl",sezioneVentDueIngl);
	MenuEntity piattoInglNovanta=new MenuEntity("Evian(1lt)",""," €4,50","","ingl",sezioneVentDueIngl);
	MenuEntity piattoInglNovantaUno=new MenuEntity("Fanta Coca-Cola Sprite",""," €3,50","","ingl",sezioneVentDueIngl);
	MenuEntity piattoInglNovantaDue=new MenuEntity("Natural fruit juices","(Peach,pineaaple,bluberry,ACE,pear)"," €3,00","","ingl",sezioneVentDueIngl);
	MenuEntity piattoInglNovantaTre=new MenuEntity("Ice Tea","(Lemon,peach)"," €3,50","","ingl",sezioneVentDueIngl);
	MenuEntity piattoInglNovantaQuattro=new MenuEntity("Chinotto",""," €3,50","","ingl",sezioneVentDueIngl);
	MenuEntity piattoInglNovantaCinque=new MenuEntity("Tonica","(Classic and Lemon)"," €3,50","","ingl",sezioneVentDueIngl);
	MenuEntity piattoInglNovantaSei=new MenuEntity("Oransoda/Lemonsoda",""," €3,50","","ingl",sezioneVentDueIngl);
	MenuEntity piattoInglNovantaSette=new MenuEntity("Crodino/Campari Bitter",""," €3,50","","ingl",sezioneVentDueIngl);
	MenuEntity piattoInglNovantaOtto=new MenuEntity("Amaro",""," €5,00","","ingl",sezioneVentTreIngl);
	MenuEntity piattoInglNovantaNove=new MenuEntity("Grappa",""," €5,00","","ingl",sezioneVentTreIngl);
	MenuEntity piattoInglCento=new MenuEntity("Rum/Whisky",""," €6,00","","ingl",sezioneVentTreIngl);
	MenuEntity piattoInglCentoUno=new MenuEntity("Limoncello",""," €5,00","","ingl",sezioneVentTreIngl);
	MenuEntity piattoInglCentoDue=new MenuEntity("Sambuca",""," €5,00","","ingl",sezioneVentTreIngl);
	MenuEntity piattoInglCentoTre=new MenuEntity("Aperol/Campari Spritz",""," €5,50","","ingl",sezioneVentQuattroIngl);
	MenuEntity piattoInglCentoQuattro=new MenuEntity("Alcoholic drink",""," €7,00","","ingl",sezioneVentQuattroIngl);
	MenuEntity piattoInglCentoCinque=new MenuEntity("Alcohol free drink",""," €5,00","","ingl",sezioneVentQuattroIngl);
	MenuEntity piattoInglCentoSei=new MenuEntity("Espresso","","Classico € 1,50","Large €2,50","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoSette=new MenuEntity("Deka Coffee","","Classico € 1,70","","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoOtto=new MenuEntity("American Coffee","","Classico € 2,50","Large €3,50","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoNove=new MenuEntity("Ice Coffee","","Classico € 2,20","Large €3,50","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoDieci=new MenuEntity("Tea","","Classico € 2,50","","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoUndici=new MenuEntity("Herbal tea","","Classico € 3,00","","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoDodici=new MenuEntity("Cappuccino","","Classico € 2,00","Large €3,00","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoTredici=new MenuEntity("Caffelatte","","Classico € 2,20","Large €3,50","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoQuattordici=new MenuEntity("'Marocchino'","","Classico € 2,20","","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoQuindici=new MenuEntity("Barley","","Classico € 2,00","Large €2,60","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoSedici=new MenuEntity("Ginseng","","Classico € 2,50","Large €3,10","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoDiciaSette=new MenuEntity("Hot Chocolate","(with cream + 0,50€)","Classico € 3,50","","ingl",sezioneVentCinqueIngl);
	MenuEntity piattoInglCentoDiciOtto=new MenuEntity("Homemade croissant","","€ 1,50","","ingl",sezioneVentSeiIngl);
	MenuEntity piattoInglCentoDiciNove=new MenuEntity("Granny's donut","","€ 2,90","","ingl",sezioneVentSeiIngl);
	MenuEntity piattoInglCentoVenti=new MenuEntity("Tart with jam","","€ 3,00","","ingl",sezioneVentSeiIngl);
	MenuEntity piattoInglCentoVentUno=new MenuEntity("Muffin","","€ 3,00","","ingl",sezioneVentSeiIngl);
	MenuEntity piattoInglCentoVentDue=new MenuEntity("Cake of the day","","€ 3,50","","ingl",sezioneVentSeiIngl);
	
	menuService.addStruttura(sezioneUnoIngl); menuService.addStruttura(sezioneDueIngl);
	menuService.addStruttura(sezioneTreIngl); menuService.addStruttura(sezioneQuattroIngl);
	menuService.addStruttura(sezioneCinqueIngl); menuService.addStruttura(sezioneSeiIngl);
	menuService.addStruttura(sezioneSetteIngl);	menuService.addStruttura(sezioneOttoIngl);
	menuService.addStruttura(sezioneNoveIngl); menuService.addStruttura(sezioneDieciIngl);
	menuService.addStruttura(sezioneUndiciIngl);menuService.addStruttura(sezioneDodiciIngl);
	menuService.addStruttura(sezioneTrediciIngl);menuService.addStruttura(sezioneQuatordiciIngl); 
	menuService.addStruttura(sezioneQuindiciIngl); menuService.addStruttura(sezioneSediciIngl);
	menuService.addStruttura(sezioneDiciasetteIngl); menuService.addStruttura(sezioneDiciottoIngl);
	menuService.addStruttura(sezioneDiciaNoveIngl);	menuService.addStruttura(sezioneVentiIngl);
	menuService.addStruttura(sezioneVentUnoIngl); menuService.addStruttura(sezioneVentDueIngl);
	menuService.addStruttura(sezioneVentTreIngl);menuService.addStruttura(sezioneVentQuattroIngl);
	menuService.addStruttura(sezioneVentCinqueIngl);menuService.addStruttura(sezioneVentSeiIngl);
	
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
	menuService.addPiatto(piattoInglVentiTre); menuService.addPiatto(piattoInglVentiQuattro);
	menuService.addPiatto(piattoInglVentiCinque); menuService.addPiatto(piattoInglVentiSei);
	menuService.addPiatto(piattoInglVentiSette); menuService.addPiatto(piattoInglVentOtto);
	menuService.addPiatto(piattoInglVentNove); 	menuService.addPiatto(piattoInglTrenta);
	menuService.addPiatto(piattoInglTrentuno);menuService.addPiatto(piattoInglTrentDue);
	menuService.addPiatto(piattoInglTrentaTre); menuService.addPiatto(piattoInglTrentQuattro);
	menuService.addPiatto(piattoInglTrentCinque); menuService.addPiatto(piattoInglTrentSei);
	menuService.addPiatto(piattoInglTrentSette); menuService.addPiatto(piattoInglTrentOtto); 
	menuService.addPiatto(piattoInglTrentNove); menuService.addPiatto(piattoInglQuaranta);
	menuService.addPiatto(piattoInglQuarantUno); menuService.addPiatto(piattoInglQuarantDue);
	menuService.addPiatto(piattoInglQuarantTre);menuService.addPiatto(piattoInglQuarantQuattro);
	menuService.addPiatto(piattoInglQuarantCinque); menuService.addPiatto(piattoInglQuarantSei);
	menuService.addPiatto(piattoInglQuarantSette);menuService.addPiatto(piattoInglQuarantOtto);
	menuService.addPiatto(piattoInglQuarantNove);menuService.addPiatto(piattoInglCinquanta);
	menuService.addPiatto(piattoInglCinquantaUno);menuService.addPiatto(piattoInglCinquantaDue);
	menuService.addPiatto(piattoInglCinquantaTre);menuService.addPiatto(piattoInglCinquantaQuattro);
	menuService.addPiatto(piattoInglCinquantaCinque); menuService.addPiatto(piattoInglCinquantaSei);
	menuService.addPiatto(piattoInglCinquantaSette); menuService.addPiatto(piattoInglCinquantaOtto);
	menuService.addPiatto(piattoInglCinquantaNove); menuService.addPiatto(piattoInglSessanta);
	menuService.addPiatto(piattoInglSessantaUno); menuService.addPiatto(piattoInglSessantaDue);
	menuService.addPiatto(piattoInglSessantaTre); menuService.addPiatto(piattoInglSessantaQuattro);
	menuService.addPiatto(piattoInglSessantaCinque); menuService.addPiatto(piattoInglSessantaSei);
	menuService.addPiatto(piattoInglSessantaSette); menuService.addPiatto(piattoInglSessantaOtto);
	menuService.addPiatto(piattoInglSessantaNove); menuService.addPiatto(piattoInglSettanta); 
	menuService.addPiatto(piattoInglSettantUno); menuService.addPiatto(piattoInglSettantaDue); 
	menuService.addPiatto(piattoInglSettantaTre); menuService.addPiatto(piattoInglSettantaQuattro); menuService.addPiatto(piattoInglSettantaCinque);
	menuService.addPiatto(piattoInglSettantaSei); menuService.addPiatto(piattoInglSettantaSette);
	menuService.addPiatto(piattoInglSettantaOtto); menuService.addPiatto(piattoInglSettantaNove);
	menuService.addPiatto(piattoInglOttanta); menuService.addPiatto(piattoInglOttantaUno);
	menuService.addPiatto(piattoInglOttantaDue);menuService.addPiatto(piattoInglOttantaTre);
	menuService.addPiatto(piattoInglOttantaQuattro); menuService.addPiatto(piattoInglOttantaCinque);
	menuService.addPiatto(piattoInglOttantaSei);menuService.addPiatto(piattoInglOttantaSette);
	menuService.addPiatto(piattoInglOttantaOtto);menuService.addPiatto(piattoInglOttantaNove);
	menuService.addPiatto(piattoInglNovanta);menuService.addPiatto(piattoInglNovantaUno);
	menuService.addPiatto(piattoInglNovantaDue);menuService.addPiatto(piattoInglNovantaTre);
	menuService.addPiatto(piattoInglNovantaQuattro); menuService.addPiatto(piattoInglNovantaCinque);
	menuService.addPiatto(piattoInglNovantaSei); menuService.addPiatto(piattoInglNovantaSette);
	menuService.addPiatto(piattoInglNovantaOtto); menuService.addPiatto(piattoInglNovantaNove);
	menuService.addPiatto(piattoInglCento); menuService.addPiatto(piattoInglCentoUno);
	menuService.addPiatto(piattoInglCentoDue); menuService.addPiatto(piattoInglCentoTre);
	menuService.addPiatto(piattoInglCentoQuattro); 	menuService.addPiatto(piattoInglCentoCinque);
	menuService.addPiatto(piattoInglCentoSei);menuService.addPiatto(piattoInglCentoSette);
	menuService.addPiatto(piattoInglCentoOtto); menuService.addPiatto(piattoInglCentoNove);
	menuService.addPiatto(piattoInglCentoDieci); menuService.addPiatto(piattoInglCentoUndici);
	menuService.addPiatto(piattoInglCentoDodici); menuService.addPiatto(piattoInglCentoTredici); 
	menuService.addPiatto(piattoInglCentoQuattordici); menuService.addPiatto(piattoInglCentoQuindici);
	menuService.addPiatto(piattoInglCentoSedici); menuService.addPiatto(piattoInglCentoDiciaSette);
	menuService.addPiatto(piattoInglCentoDiciOtto);menuService.addPiatto(piattoInglCentoDiciNove);
	menuService.addPiatto(piattoInglCentoVenti); menuService.addPiatto(piattoInglCentoVentUno);
	menuService.addPiatto(piattoInglCentoVentDue);

	
	
	}
	
	
	
}
