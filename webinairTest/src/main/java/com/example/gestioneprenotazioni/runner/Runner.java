package com.epicode.gestioneprenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestioneprenotazioni.prenotazioni.PrenotazioniConfiguration;
import com.epicode.gestioneprenotazioni.prenotazioni.PrenotazioniService;
import com.epicode.gestioneprenotazioni.sede.SedeConfiguration;
import com.epicode.gestioneprenotazioni.sede.SedeService;
import com.epicode.gestioneprenotazioni.utente.UtenteConfiguration;
import com.epicode.gestioneprenotazioni.utente.UtenteService;
@Component
public class Runner implements ApplicationRunner {
@Autowired
SedeConfiguration sedeConfiguration;
@Autowired
SedeService sedeService;
@Autowired
PrenotazioniService prenotazioniService;
@Autowired
PrenotazioniConfiguration prenotazioniConfiguration;
@Autowired
UtenteConfiguration utenteConfiguration;
@Autowired
UtenteService utenteService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		sedeService.crea(sedeConfiguration.creaSede());
		utenteService.crea(utenteConfiguration.creaUtente());
		prenotazioniService.crea(prenotazioniConfiguration.creaPrenotazioni());


		
	}

	

}
