package com.epicode.gestioneprenotazioni.utente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/utente")
public class UtenteController {

	@Autowired
	private UtenteService utenteService;
	
	@GetMapping
	public List<Utente> trovaTutti(){
		return utenteService.trovaTutti();
		
	}
	@GetMapping("/{id}")
	public Utente trovaSedePerId(@PathVariable Long id) {
		return utenteService.trovaPerId(id);
	}
	@DeleteMapping
	public void cancella(Long id) {
		utenteService.cancella(id);
	}
	@PostMapping
	public void crea(@RequestBody  Utente utente ) {
		utenteService.crea(utente);
	}
	@PutMapping
	public void modifica(Utente utente) {
		utenteService.modifica(utente);
	}


}
