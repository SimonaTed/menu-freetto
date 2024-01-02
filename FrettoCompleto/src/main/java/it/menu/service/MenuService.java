package it.menu.service;

import java.util.List;

import it.menu.entity.DescrizioneEntity;

public interface MenuService {

	List<DescrizioneEntity> findDescrizioneByLingua(String lingua);

}
