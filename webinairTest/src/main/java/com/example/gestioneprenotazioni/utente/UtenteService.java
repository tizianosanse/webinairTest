package com.epicode.gestioneprenotazioni.utente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UtenteService {

	@Autowired
	private UtenteRepository repo;
		
	public List<Utente> trovaTutti(){
		return (List<Utente>) repo.findAll();
		
	}

	public Utente trovaPerId(Long id) {
		return repo.findById(id).get();
		
	}
	public void cancella(Long id) {
		repo.deleteById(id);
	}

	public void crea (Utente utente) {
		repo.save(utente);
		
	}
	public void modifica(Utente utente) {
		repo.save(utente);
		
	}

}
