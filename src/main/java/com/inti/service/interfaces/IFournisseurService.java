package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Fournisseur;

public interface IFournisseurService {
	
	public List <Fournisseur> findAll();
	
	public Fournisseur FindOne(Long idFournisseur);
	
	public Fournisseur Save(Fournisseur fournisseur);
	
	public void delete (Long idFournisseur);

}
