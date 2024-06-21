package com.epicode.gestioneprenotazioni.sede;

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

import com.epicode.gestioneprenotazioni.postazioni.Postazioni;
import com.epicode.gestioneprenotazioni.postazioni.PostazioniService;
@RestController
@RequestMapping("/sede")
public class SedeController {

	@Autowired
	private SedeService sedeService;
	
	@GetMapping
	public List<Sede> trovaTutti(){
		return sedeService.trovaTutti();
		
	}
	@GetMapping("/{id}")
	public Sede trovaSedePerId(@PathVariable Long id) {
		return sedeService.trovaPerId(id);
	}
	@DeleteMapping
	public void cancella(Long id) {
		sedeService.cancella(id);
	}
	@PostMapping
	public void crea(@RequestBody  Sede sede ) {
		sedeService.crea(sede);
	}
	@PutMapping
	public void modifica(Sede sede) {
		sedeService.modifica(sede);
	}

}
