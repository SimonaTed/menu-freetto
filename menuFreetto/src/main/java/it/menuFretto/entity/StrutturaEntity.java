package it.menuFretto.entity;

import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity
public class StrutturaEntity {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStrutturaEntity;
	private String sottoSezione;
	@Column(nullable = true)
	private String sezione;

	// per il numero si pùò provare @PrePersist con un metodo per preInserirlo oppure una relazione bisgna vedere se messo id un auto incrementale come si comporta

	
	@OneToMany(mappedBy = "strutturaEntity") //fetch = FetchType.EAGER o lazy ma va sempre in loop serve @JsonBackReference
	@JsonBackReference
	private List<MenuEntity> menu = new ArrayList<>();
	
	public StrutturaEntity(int idStrutturaEntity, String sottoSezione, String sezione, List<MenuEntity> menu) {
		super();
		this.idStrutturaEntity = idStrutturaEntity;
		this.sottoSezione = sottoSezione;
		this.sezione = sezione;
		this.menu = menu;
	}

	public StrutturaEntity() {
		
	}
	
	public StrutturaEntity(String sottoSezione) {
		this.sottoSezione=sottoSezione;
	}
	
	public StrutturaEntity(String sottoSezione, String sezione) {
		this.sottoSezione = sottoSezione;
		this.sezione = sezione;
	}
	
	public StrutturaEntity(String sottoSezione, String sezione, List<MenuEntity> menu) {
		super();
		this.sottoSezione = sottoSezione;
		this.sezione = sezione;
		this.menu = menu;
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

	public int getIdStrutturaEntity() {
		return idStrutturaEntity;
	}

	public void setIdStrutturaEntity(int idStrutturaEntity) {
		this.idStrutturaEntity = idStrutturaEntity;
	}



	
}
