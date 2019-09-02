package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Achat;

public interface IAchatService {
	
	public List <Achat> findAll();
	
	public Achat FindOne(Long idAchat);
	
	public Achat Save(Achat achat);
	
	public void delete (Long idAchat);

}
