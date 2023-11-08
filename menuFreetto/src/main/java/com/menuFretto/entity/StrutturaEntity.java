package com.menuFretto.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class StrutturaEntity {


	
	

	@Id
	String sottoSezione;
	@Column(nullable = true)
	String sezione;
	
	@OneToMany(mappedBy = "strutturaEntity") //fetch = FetchType.EAGER
	private List<MenuItaEntity> menu = new ArrayList<>();
	
	@OneToMany(mappedBy = "strutturaEntity") //fetch = FetchType.EAGER
	private List<MenuInglEntity> menuIngl = new ArrayList<>();

	
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
	
	public StrutturaEntity(String sottoSezione, String sezione, List<MenuItaEntity> menu,
			List<MenuInglEntity> menuIngl) {
		super();
		this.sottoSezione = sottoSezione;
		this.sezione = sezione;
		this.menu = menu;
		this.menuIngl = menuIngl;
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
	public List<MenuItaEntity> getMenu() {
		return menu;
	}
	
	public void setMenu(List<MenuItaEntity> menu) {
			this.menu = menu;
	}

	public List<MenuInglEntity> getMenuIngl() {
		return menuIngl;
	}

	public void setMenuIngl(List<MenuInglEntity> menuIngl) {
		this.menuIngl = menuIngl;
	}
	
}
