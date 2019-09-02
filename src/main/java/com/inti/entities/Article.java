package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Article implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public long id_article;
	public String libelle;
	public int stock;
	public float prix;
	
	public Article() {
		super();
	}

	public Article(String libelle, int stock, int prix) {
		super();
		this.libelle = libelle;
		this.stock = stock;
		this.prix = prix;
	}
	@OneToMany(mappedBy="id_article",cascade=CascadeType.ALL)	
	private List<Achat> achat = new ArrayList<Achat>();

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId_article() {
		return id_article;
	}
	public void setId_article(long id_article) {
		this.id_article = id_article;
	}

	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}	

}

