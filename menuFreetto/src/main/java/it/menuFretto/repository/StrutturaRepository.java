package it.menuFretto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.menuFretto.entity.StrutturaEntity;

public interface StrutturaRepository extends JpaRepository<StrutturaEntity, Integer> {

	List<StrutturaEntity> findStrutturaEntitiesByMenu_Lingua(String lingua);

}
