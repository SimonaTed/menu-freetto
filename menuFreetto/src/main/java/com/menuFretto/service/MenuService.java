package com.menuFretto.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.menuFretto.entity.MenuInglEntity;
import com.menuFretto.entity.MenuItaEntity;
import com.menuFretto.entity.StrutturaEntity;


public interface MenuService {
	
	public void addPiattoIta (MenuItaEntity menuIta);
	
	public void addPiattoIngl(MenuInglEntity menuIngl);
	
	public void addStruttura(StrutturaEntity struttura);
	
	public ResponseEntity<List<MenuItaEntity>> tuttiPiatti();
	
	public ResponseEntity<List<MenuInglEntity>> tuttiPiattiInglese(); 

}
