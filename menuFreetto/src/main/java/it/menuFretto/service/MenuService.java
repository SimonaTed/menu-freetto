package it.menuFretto.service;

import java.awt.Menu;
import java.util.List;

import org.springframework.http.ResponseEntity;

import it.menuFretto.entity.MenuEntity;
import it.menuFretto.entity.StrutturaEntity;


public interface MenuService {
	
	public void addPiatto (MenuEntity menu);
	
	public void addStruttura(StrutturaEntity struttura);
	
	public List<MenuEntity> tuttiPiatti();
	
	public List<MenuEntity> findByLingua(String lingua);

}