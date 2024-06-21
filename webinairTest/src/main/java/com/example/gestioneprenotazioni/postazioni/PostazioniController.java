package com.epicode.gestioneprenotazioni.postazioni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/postazioni")
public class PostazioniController {

	@Autowired
	private PostazioniService postazioniService;
	
	@GetMapping
	public List<Postazioni>findByCittaAndTipo(@RequestParam String citta,@RequestParam Tipo tipo){
		return postazioniService.findByCittaAndTipo(citta, tipo);
	}
	

	@GetMapping("/{id}")
	public Postazioni trovaPostazionePerId(@PathVariable Long id) {
		return postazioniService.trovaPerId(id);
	}
	@DeleteMapping
	public void cancella(Long id) {
		postazioniService.cancella(id);
	}
	@PostMapping
	public void crea(@RequestBody  Postazioni libro ) {
		postazioniService.crea(libro);
	}
	@PutMapping
	public void modifica(Postazioni libro) {
		postazioniService.modifica(libro);
	}

}
