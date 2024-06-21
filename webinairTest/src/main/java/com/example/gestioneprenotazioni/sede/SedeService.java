package com.epicode.gestioneprenotazioni.sede;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SedeService {

	@Autowired
	private SedeRepository repo;
		
	public List<Sede> trovaTutti(){
		return (List<Sede>) repo.findAll();
		
	}

	public Sede trovaPerId(Long id) {
		return repo.findById(id).get();
		
	}
	public void cancella(Long id) {
		repo.deleteById(id);
	}

	public void crea (Sede sede) {
		repo.save(sede);
		
	}
	public void modifica(Sede sede) {
		repo.save(sede);
		
	}

}
