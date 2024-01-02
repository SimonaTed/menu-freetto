package it.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.menu.entity.DescrizioneEntity;
import it.menu.repository.DescrizioneRepository;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	DescrizioneRepository descrizioneRepository;
	
	@Override
	public List<DescrizioneEntity> findDescrizioneByLingua(String sigla){
		return descrizioneRepository.findDescrizioneEntitiesByLinguaEntity_Sigla(sigla);
	}

}
