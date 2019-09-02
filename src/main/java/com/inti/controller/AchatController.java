package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Achat;
import com.inti.service.interfaces.IAchatService;

@RestController
@RequestMapping(value = "/")
public class AchatController {
	
	@Autowired
	IAchatService achatServ;
	
	@RequestMapping(value = "achats", method = RequestMethod.GET)
	public List<Achat> findAll(){
		return achatServ.findAll();
	}
	
	@RequestMapping(value = "achats/{id_achat}", method = RequestMethod.GET)
	public Achat findOne(@PathVariable ("id_achat") Long id_achat) {
		return achatServ.FindOne(id_achat);
	}
	
	@RequestMapping(value = "achats", method = RequestMethod.POST)
	public Achat Save(@RequestBody Achat achat) {
		return achatServ.Save(achat);
	}
	
	@RequestMapping(value = "achats/{id_achat}", method = RequestMethod.DELETE)
	public void delete(@PathVariable ("id_achat") Long id_achat) {
		achatServ.delete(id_achat);
}
	
	@RequestMapping(value = "achats/{id_achat}", method = RequestMethod.PUT)
	public Achat update (@PathVariable ("id_achat") Long id_achat, @RequestBody Achat achat) {
		Achat currentAchat = achatServ.FindOne(id_achat);
		currentAchat.setPrix_achat(achat.getPrix_achat());
		currentAchat.setDate_achat(achat.getDate_achat());
		currentAchat.setDelais(achat.getDelais());		
		return achatServ.Save(currentAchat);
	}

}
