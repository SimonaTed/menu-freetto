package com.menuFretto.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class StrutturaEntity {

	@Id
	String sottoSezione;
	@Column(nullable = true)
	String sezione;
	

	
	@OneToMany(mappedBy = "strutturaEntity") //fetch = FetchType.EAGER o lazy ma sempre in loop
	@JsonBackReference
	private List<MenuEntity> menu = new ArrayList<>();


	public StrutturaEntity() {
		
	}
	
	public StrutturaEntity(String sottoSezione) {
		this.sottoSezione=sottoSezione;
	}
	
	public StrutturaEntity(String sottoSezione, String sezione) {
		super();
		this.sottoSezione = sottoSezione;
		this.sezione = sezione;
	}
	
	public String getSottoSezione() {
		return sottoSezione;
	}
	public void setSottoSezione(String sottoSezione) {
		this.sottoSezione = sottoSezione;
	}
	public String getSezione() {
		return sezione;
	}
	public void setSezione(String sezione) {
		this.sezione = sezione;
	}
	public List<MenuEntity> getMenu() {
		return menu;
	}
	
	public void setMenu(List<MenuEntity> menu) {
			this.menu = menu;
	}

	
}
