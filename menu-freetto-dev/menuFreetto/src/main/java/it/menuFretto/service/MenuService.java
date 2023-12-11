package it.menuFretto.service;

import java.util.List;

import it.menuFretto.entity.MenuEntity;
import it.menuFretto.entity.StrutturaEntity;


public interface MenuService {
	
	public void addPiatto (MenuEntity menu);
	
	public void addStruttura(StrutturaEntity struttura);
	
	public List<MenuEntity> tuttiPiatti();
	
	public List<MenuEntity> findByLingua(String lingua); 
	
	public List<StrutturaEntity> findStrutturaEntityByLingua(String lingua);
	
}