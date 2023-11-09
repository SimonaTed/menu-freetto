package com.menuFretto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.menuFretto.entity.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity,String> {
	
	List<MenuEntity> findAllByLingua(String lingua); //MenuEntites

}
