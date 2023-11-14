package it.menuFretto.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MenuEntity {


	@Id
	private String nomePiatto;
	@Column(nullable = true)
	private String ingredienti;
	private String prezzo;
	@Column(nullable = true)
	private String prezzoDue;
	private String lingua;
	
	
	@ManyToOne
	private StrutturaEntity strutturaEntity;
	
	public MenuEntity() {
		
	}
	
	public MenuEntity(String nomePiatto, String ingredienti, String prezzo, String prezzoDue, String lingua) {
		this.nomePiatto = nomePiatto;
		this.ingredienti = ingredienti;
		this.prezzo = prezzo;
		this.prezzoDue = prezzoDue;
		this.lingua = lingua;
	}	
	
	public MenuEntity(String nomePiatto, String ingredienti, String prezzo, String prezzoDue, String lingua,
			StrutturaEntity strutturaEntity) {
		this.nomePiatto = nomePiatto;
		this.ingredienti = ingredienti;
		this.prezzo = prezzo;
		this.prezzoDue = prezzoDue;
		this.lingua = lingua;
		this.strutturaEntity = strutturaEntity;
	}
	
	public String getNomePiatto() {
		return nomePiatto;
	}

	public void setNomePiatto(String nomePiatto) {
		this.nomePiatto = nomePiatto;
	}

	public String getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}

	public String getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	public String getPrezzoDue() {
		return prezzoDue;
	}

	public void setPrezzoDue(String prezzoDue) {
		this.prezzoDue = prezzoDue;
	}

	public String getLingua() {
		return lingua;
	}

	public void setLingua(String lingua) {
		this.lingua = lingua;
	}

	public StrutturaEntity getStrutturaEntity() {
		return strutturaEntity;
	}

	public void setStrutturaEntity(StrutturaEntity strutturaEntity) {
		this.strutturaEntity = strutturaEntity;
	}

}
