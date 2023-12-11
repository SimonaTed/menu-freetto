package it.menuFretto.entity;

public class Lingue {
	
	String nome;
	String url;
	String sottotitolo;
	String benvenuto;
	String avvertenze;
	String allergeni;
	
	
	
	public Lingue() {
		super();
	}

	public Lingue(String nome, String url) {
		super();
		this.nome = nome;
		this.url = url;
	}
	
	public Lingue(String nome, String url, String sottotitolo) {
		super();
		this.nome = nome;
		this.url = url;
		this.sottotitolo = sottotitolo;
	}

	public Lingue(String nome, String url, String sottotitolo, String benvenuto) {
		super();
		this.nome = nome;
		this.url = url;
		this.sottotitolo = sottotitolo;
		this.benvenuto = benvenuto;
	}

	public Lingue(String nome, String url, String sottotitolo, String benvenuto, String avvertenze, String allergeni) {
		super();
		this.nome = nome;
		this.url = url;
		this.sottotitolo = sottotitolo;
		this.benvenuto = benvenuto;
		this.avvertenze = avvertenze;
		this.allergeni = allergeni;
	}

	public String getNome() {
		return nome;
	}
	public String getUrl() {
		return url;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getSottotitolo() {
		return sottotitolo;
	}

	public void setSottotitolo(String sottotitolo) {
		this.sottotitolo = sottotitolo;
	}

	public String getBenvenuto() {
		return benvenuto;
	}

	public void setBenvenuto(String benvenuto) {
		this.benvenuto = benvenuto;
	}

	public String getAvvertenze() {
		return avvertenze;
	}

	public String getAllergeni() {
		return allergeni;
	}

	public void setAvvertenze(String avvertenze) {
		this.avvertenze = avvertenze;
	}

	public void setAllergeni(String allergeni) {
		this.allergeni = allergeni;
	}
	
	
	
}
