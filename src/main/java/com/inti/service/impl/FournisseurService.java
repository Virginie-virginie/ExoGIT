package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Fournisseur;
import com.inti.repository.FournisseurRepository;
import com.inti.service.interfaces.IFournisseurService;
@Service
public class FournisseurService implements IFournisseurService {
	
	@Autowired
	FournisseurRepository fournisseurRepository;

	@Override
	public List<Fournisseur> findAll() {
		return fournisseurRepository.findAll();
	}

	@Override
	public Fournisseur FindOne(Long idFournisseur) {
		return fournisseurRepository.findById(idFournisseur).orElse(null);
	}

	@Override
	public Fournisseur Save(Fournisseur fournisseur) {
		return fournisseurRepository.save(fournisseur);
	}

	@Override
	public void delete(Long idFournisseur) {
		fournisseurRepository.deleteById(idFournisseur);
		
	}
	
	

}
