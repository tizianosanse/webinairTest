package com.epicode.gestioneprenotazioni.postazioni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class PostazioniService {
	@Autowired
private PostazioniRepository repo;
	
	public List<Postazioni>findByCittaAndTipo(String citta, Tipo tipo){
		return repo.findByCittaAndTipo(citta, tipo);
	}
	
public List<Postazioni> trovaTutti(){
	return (List<Postazioni>) repo.findAll();
	
}

public Postazioni trovaPerId(Long id) {
	return repo.findById(id).get();
	
}
public void cancella(Long id) {
	repo.deleteById(id);
}

public void crea (Postazioni postazioni) {
	repo.save(postazioni);
	
}
public void modifica(Postazioni postazioni) {
	repo.save(postazioni);
	
}



}
