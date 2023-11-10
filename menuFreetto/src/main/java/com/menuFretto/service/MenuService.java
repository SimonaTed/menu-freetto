package com.menuFretto.service;

import java.awt.Menu;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.menuFretto.entity.MenuEntity;
import com.menuFretto.entity.StrutturaEntity;


public interface MenuService {
	
	public void addPiatto (MenuEntity menu);
	
	public void addStruttura(StrutturaEntity struttura);
	
	public List<MenuEntity> tuttiPiatti();
	
	public List<MenuEntity> findByLingua(String lingua);

}