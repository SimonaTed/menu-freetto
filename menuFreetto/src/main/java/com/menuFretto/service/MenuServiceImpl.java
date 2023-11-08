package com.menuFretto.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.menuFretto.entity.MenuInglEntity;
import com.menuFretto.entity.MenuItaEntity;
import com.menuFretto.entity.StrutturaEntity;
import com.menuFretto.repository.MenuInglRepository;
import com.menuFretto.repository.MenuItaRepository;
import com.menuFretto.repository.StrutturaRepository;

@Service
public class MenuServiceImpl implements MenuService {


	@Autowired
	MenuItaRepository menuItaRepository;
	
	@Autowired
	MenuInglRepository menuInglRepository;
	
	@Autowired
	StrutturaRepository strutturaRepository;

	@Override
	public void addPiattoIta(MenuItaEntity menuIta) {
		menuItaRepository.save(menuIta);	
	}
	
	@Override
	public void addPiattoIngl(MenuInglEntity menuIngl) {
		menuInglRepository.save(menuIngl);
	}
	
	@Override
	public void addStruttura(StrutturaEntity struttura) {
		strutturaRepository.save(struttura);
		
	}

	@Override
	public ResponseEntity<List<MenuItaEntity>> tuttiPiatti() {
		List<MenuItaEntity> menu= menuItaRepository.findAll();
		return ResponseEntity.ok().body(menu);
	}

	@Override
	public ResponseEntity<List<MenuInglEntity>> tuttiPiattiInglese() {
		List<MenuInglEntity> menu= menuInglRepository.findAll();
		return ResponseEntity.ok().body(menu);
	}
	
	
}
