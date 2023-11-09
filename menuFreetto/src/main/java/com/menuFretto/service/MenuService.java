package com.menuFretto.service;

import java.awt.Menu;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.menuFretto.entity.MenuEntity;
import com.menuFretto.entity.StrutturaEntity;


public interface MenuService {
	
	public void addPiatto (MenuEntity menu);
	
	public void addStruttura(StrutturaEntity struttura);
	
	public ResponseEntity<List<MenuEntity>> tuttiPiatti();
	
	public ResponseEntity<List<MenuEntity>> findByLingua(String lingua);

}