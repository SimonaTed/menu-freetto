package com.menuFretto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.menuFretto.entity.MenuInglEntity;
import com.menuFretto.entity.MenuItaEntity;
import com.menuFretto.entity.StrutturaEntity;
import com.menuFretto.service.MenuService;
import com.menuFretto.service.MenuServiceImpl;

@SpringBootApplication
public class MenuFreettoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MenuFreettoApplication.class, args);
	}
	
	@Autowired
	MenuService menuService;

	
	
	@Override
	public void run(String... args) throws Exception {
		
		/*this.nomePiatto = nomePiatto;
		this.ingredienti = ingredienti;
		this.prezzo = prezzo;
		this.quantita=quantita;
		
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
	
	StrutturaEntity sezioneUnoIngl=new StrutturaEntity("Our Classies","- COFFEE BAR-SALAD - SANDWICH - FRUIT EXTRACTS - FINE FRIED FOOD -");
	StrutturaEntity sezioneDueIngl=new StrutturaEntity("Our Paper Cones");
	
	/*MenuItaEntity piattoIta=new MenuItaEntity("spaghetti al sugo","(pasta di grano 0)","5 €");
	MenuItaEntity piattoItaDue=new MenuItaEntity("maltagliati","(pasta fatta a mano)","6.5 €");
	MenuItaEntity piattoItaTre=new MenuItaEntity("bistecca","(cinta senese frollata 18 mesi)","18 €");
		menuService.addPiattoIta(piattoIta);
	menuService.addPiattoIta(piattoItaDue);
	menuService.addPiattoIta(piattoItaTre);
	
	*/
	MenuInglEntity piattoIngl=new MenuInglEntity("Homemade Supplì","","€2,80","",sezioneUnoIngl);
	MenuInglEntity piattoInglDue=new MenuInglEntity("Codfish buttered fillet","","€4,00","",sezioneUnoIngl);
	MenuInglEntity piattoInglTre=new MenuInglEntity("Mozzarella in Carrozza","(with anchovies or speck)","€3,80","",sezioneUnoIngl);
	MenuInglEntity piattoInglQuattro=new MenuInglEntity("Arancini from Sicily","","€3,80","",sezioneUnoIngl);
	MenuInglEntity piattoInglCinque=new MenuInglEntity("Potato croquettes","","€2,80","",sezioneUnoIngl);
	MenuInglEntity piattoInglSei=new MenuInglEntity("Deep fried battered vegetables","","€10,50","",sezioneDueIngl);
	
	
	
	menuService.addStruttura(sezioneUnoIngl);
	menuService.addStruttura(sezioneDueIngl);
	menuService.addPiattoIngl(piattoIngl);
	menuService.addPiattoIngl(piattoInglDue);
	menuService.addPiattoIngl(piattoInglTre);
	menuService.addPiattoIngl(piattoInglQuattro);
	menuService.addPiattoIngl(piattoInglCinque);
	menuService.addPiattoIngl(piattoInglSei);
	
	
			
	}
	
	
	
}
