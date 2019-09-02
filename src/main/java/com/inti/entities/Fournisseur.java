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
public class Fournisseur implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public long id_fournisseur;
	public String nom_fournisseur;
	public String adresse;
	public String ville;
	
	public Fournisseur() {
		super();
	}

	public Fournisseur(String nom_fournisseur, String adresse, String ville) {
		super();
		this.nom_fournisseur = nom_fournisseur;
		this.adresse = adresse;
		this.ville = ville;
	}

	@OneToMany(mappedBy="id_fournisseur",cascade=CascadeType.ALL)
	public List <Achat> achat = new ArrayList<Achat>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId_fournisseur() {
		return id_fournisseur;
	}

	public void setId_fournisseur(long id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}

	
	public String getNom_fournisseur() {
		return nom_fournisseur;
	}

	public void setNom_fournisseur(String nom_fournisseur) {
		this.nom_fournisseur = nom_fournisseur;
	}

	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	

}
