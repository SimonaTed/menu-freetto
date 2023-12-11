package it.menuFretto.service;

import java.awt.Menu;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.menuFretto.entity.MenuEntity;
import it.menuFretto.entity.StrutturaEntity;
import it.menuFretto.repository.MenuRepository;
import it.menuFretto.repository.StrutturaRepository;

@Service
public class MenuServiceImpl implements MenuService {


	@Autowired
	MenuRepository menuRepository;
	
	
	@Autowired
	StrutturaRepository strutturaRepository;

	@Override
	public void addPiatto(MenuEntity menu) {
		menuRepository.save(menu);	
	}
	
	@Override
	public void addStruttura(StrutturaEntity struttura) {
		strutturaRepository.save(struttura);
		
	}

	@Override
	public List<MenuEntity> tuttiPiatti() {
		return (List<MenuEntity>) menuRepository.findAll();
	}

	@Override
	public List<MenuEntity> findByLingua(String lingua) {
		return (List<MenuEntity>) menuRepository.findAllByLingua(lingua);
	}

	@Override
	public List<StrutturaEntity> findStrutturaEntityByLingua(String lingua) {
		return (List<StrutturaEntity>) strutturaRepository.findStrutturaEntitiesByMenu_Lingua(lingua);
	}
	
}
