package com.epicode.gestioneprenotazioni.prenotazioni;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestioneprenotazioni.postazioni.Postazioni;
import com.epicode.gestioneprenotazioni.postazioni.PostazioniService;
@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioniController {

	@Autowired
	private PrenotazioniService prenotazioniService;
	
	@Autowired
	private PostazioniService servicepost;
	
	@GetMapping
	public List<Prenotazioni> trovaTutti(){
		return prenotazioniService.trovaTutti();
		
	}
	@GetMapping("/{id}")
	public Prenotazioni trovaPostazionePerId(@PathVariable Long id) {
		return prenotazioniService.trovaPerId(id);
	}
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		prenotazioniService.cancella(id);
	}
	@PostMapping
	public void crea(@RequestBody  Prenotazioni prenotazioni ) {
		Postazioni tavolo = servicepost.trovaPerId(prenotazioni.getPostazione().getId());
		prenotazioniService.crea(prenotazioni);
	}
	@PutMapping
	public void modifica(@RequestBody Prenotazioni prenotazioni) {
		prenotazioniService.modifica(prenotazioni);
	}
	@GetMapping("/findByUserAndValidita")
	public int findByUserAndValidita(@RequestParam Long id,@RequestParam LocalDate validita){
		return  prenotazioniService.findByUserAndValidita(id, validita);
		
		
	}
	@GetMapping("/findByPostazioneAndDate")
	public int  findByPostazioneAndDate(@RequestParam Long id,@RequestParam LocalDate validita){
		return  findByPostazioneAndDate( id,  validita);
	}
}
