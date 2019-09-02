package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Achat implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public long id_achat;
	public Date date_achat;
	public Fournisseur id_fournisseur;
	public Article id_article;
	public float prix_achat;
	public int delais;
	
	public Achat() {
		super();
	}
	
	


	public Achat(Date date_achat, float prix_achat, int delais) {
		super();
		this.date_achat = date_achat;
		this.prix_achat = prix_achat;
		this.delais = delais;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId_achat() {
		return id_achat;
	}
	public void setId_achat(long id_achat) {
		this.id_achat = id_achat;
	}


	
	@ManyToOne
	public Fournisseur getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(Fournisseur id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}


	
	@ManyToOne
	public Article getId_article() {
		return id_article;
	}
	public void setId_article(Article id_article) {
		this.id_article = id_article;
	}



	public float getPrix_achat() {
		return prix_achat;
	}
	public void setPrix_achat(float prix_achat) {
		this.prix_achat = prix_achat;
	}


	public int getDelais() {
		return delais;
	}
	public void setDelais(int delais) {
		this.delais = delais;
	}

	@Temporal(TemporalType.DATE)
	public Date getDate_achat() {
		return date_achat;
	}

	public void setDate_achat(Date date_achat) {
		this.date_achat = date_achat;
	}
	
	
	
	
	
}
