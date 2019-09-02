package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Achat;
import com.inti.repository.AchatRepository;
import com.inti.service.interfaces.IAchatService;

@Service
public class AchatService implements IAchatService{
	
	@Autowired
	AchatRepository achatRepository;

	@Override
	public List<Achat> findAll() {
		return achatRepository.findAll();
	}

	@Override
	public Achat FindOne(Long idAchat) {
		return achatRepository.findById(idAchat).orElse(null);
	}

	@Override
	public Achat Save(Achat achat) {
		return achatRepository.save(achat);
	}

	@Override
	public void delete(Long idAchat) {
		achatRepository.deleteById(idAchat);
		
	}
	
	

}
