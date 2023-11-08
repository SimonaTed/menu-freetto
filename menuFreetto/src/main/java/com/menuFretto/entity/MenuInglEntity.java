package com.menuFretto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MenuInglEntity {
	
	
	

	@Id
	private String nome;
	@Column(nullable = true)
	private String ingrediente;
	private String prezzo;
	@Column(nullable = true)
	private String quantita;
	
	@ManyToOne
	private StrutturaEntity strutturaEntity;
	
	
	public MenuInglEntity() {
		
	}
	
	public MenuInglEntity(String nome, String ingrediente, String prezzo, String quantita,
			StrutturaEntity strutturaEntity) {
		super();
		this.nome = nome;
		this.ingrediente = ingrediente;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.strutturaEntity = strutturaEntity;
	}
	public MenuInglEntity(String nome,String ingrediente, String prezzo,String quantita) {
		super();
		this.nome = nome;
		this.ingrediente = ingrediente;
		this.prezzo = prezzo;
		this.quantita=quantita;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	public String getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	public String getQuantita() {
		return quantita;
	}

	public void setQuantita(String quantita) {
		this.quantita = quantita;
	}

	public StrutturaEntity getStrutturaEntity() {
		return strutturaEntity;
	}

	public void setStrutturaEntity(StrutturaEntity strutturaEntity) {
		this.strutturaEntity = strutturaEntity;
	}

}
