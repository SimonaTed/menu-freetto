package it.menuFretto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import it.menuFretto.entity.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity,Integer> {
	
	List<MenuEntity> findAllByLingua(String lingua); //MenuEntites

}
