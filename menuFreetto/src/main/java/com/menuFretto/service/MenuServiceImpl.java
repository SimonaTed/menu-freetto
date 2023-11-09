package com.menuFretto.service;

import java.awt.Menu;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.menuFretto.entity.MenuEntity;
import com.menuFretto.entity.StrutturaEntity;
import com.menuFretto.repository.MenuRepository;
import com.menuFretto.repository.StrutturaRepository;

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
	public ResponseEntity<List<MenuEntity>> tuttiPiatti() {
		List<MenuEntity> menu= menuRepository.findAll();
		return ResponseEntity.ok().body(menu);
	}

	@Override
	public ResponseEntity<List<MenuEntity>> findByLingua(String lingua) {
		List<MenuEntity> menu=menuRepository.findAllByLingua(lingua);
		return ResponseEntity.ok().body(menu);
	}


	
	
}
