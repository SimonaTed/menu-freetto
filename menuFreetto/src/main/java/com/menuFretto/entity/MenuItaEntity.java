package com.menuFretto.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MenuItaEntity {

	

	
	@Id
	private String nomePiatto;
	@Column(nullable = true)
	private String ingredienti;
	private String prezzo;
	@Column(nullable = true)
	private String quantita;
	
	@ManyToOne
	private StrutturaEntity strutturaEntity;

	public MenuItaEntity(String nomePiatto, String ingredienti, String prezzo, String quantita,
			StrutturaEntity strutturaEntity) {
		super();
		this.nomePiatto = nomePiatto;
		this.ingredienti = ingredienti;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.strutturaEntity = strutturaEntity;
	}


	public MenuItaEntity() {
		
	}
	
	
	public MenuItaEntity(String nomePiatto, String ingredienti, String prezzo) {
		super();
		this.nomePiatto = nomePiatto;
		this.ingredienti = ingredienti;
		this.prezzo = prezzo;
	}
	
	public MenuItaEntity(String nomePiatto,String ingredienti, String prezzo,String quantita) {
		super();
		this.nomePiatto = nomePiatto;
		this.ingredienti = ingredienti;
		this.prezzo = prezzo;
		this.quantita=quantita;
	}
	
	public String getNomePiatto() {
		return nomePiatto;
	}
	public void setNomePiatto(String nomePiatto) {
		this.nomePiatto = nomePiatto;
	}

	public String getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	public String getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
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
