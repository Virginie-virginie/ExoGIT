package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Fournisseur;
import com.inti.service.interfaces.IFournisseurService;

@RestController
@RequestMapping(value = "/")
public class FournisseurController {
	
	@Autowired
	IFournisseurService fournisseurService;
	
	@RequestMapping(value = "fournisseurs", method = RequestMethod.GET)
	public List<Fournisseur> findAll(){
		return fournisseurService.findAll();
	}
	
	@RequestMapping(value = "fournisseurs/{id_fournisseur}", method = RequestMethod.GET)
	public Fournisseur findOne(@PathVariable("id_fournisseur") Long id_fournisseur) {	
		return fournisseurService.FindOne(id_fournisseur);
	}
	
	@RequestMapping(value = "fournisseurs", method = RequestMethod.POST)
	public Fournisseur Save(@RequestBody Fournisseur fournisseur) {
		return fournisseurService.Save(fournisseur);
	}
	
	@RequestMapping(value = "fournisseurs/{id_fournisseur}", method = RequestMethod.DELETE)
	public void delete (@PathVariable ("id_fournisseur") Long id_fournisseur) {
		fournisseurService.delete(id_fournisseur);
	}
	
	@RequestMapping(value = "fournisseurs/{id_fournisseur}", method = RequestMethod.PUT)
	public Fournisseur update (@PathVariable ("id_fournisseur") Long id_fournisseur, @RequestBody Fournisseur fournisseur) {
		Fournisseur currentFournisseur = fournisseurService.FindOne(id_fournisseur);
		currentFournisseur.setNom_fournisseur(fournisseur.getNom_fournisseur());
		currentFournisseur.setAdresse(fournisseur.getAdresse());
		currentFournisseur.setVille(fournisseur.getVille());
		return fournisseurService.Save(currentFournisseur);
	}
	
	
}
	
