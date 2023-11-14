package it.menuFretto.entity;

public class Lingue {
	
	String nome;
	String url;
	String sottotitolo;
	
	
	
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
	
	
	

}
