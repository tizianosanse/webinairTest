package com.epicode.gestioneprenotazioni.prenotazioni;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestioneprenotazioni.postazioni.Postazioni;
import com.epicode.gestioneprenotazioni.utente.Utente;



@Configuration
public class PrenotazioniConfiguration {
@Autowired
@Qualifier("utente")
 Utente utente;
@Autowired
@Qualifier("utente2")
Utente utente2;
@Autowired
@Qualifier("utente3")
Utente utente3;

@Autowired
@Qualifier("postazioni1")
 Postazioni postazioni1;
@Autowired
@Qualifier("postazioni2")
Postazioni postazioni2;
@Autowired
@Qualifier("postazioni3")
Postazioni postazioni3;






	@Bean("prenotazione")
	public Prenotazioni creaPrenotazioni() {return new Prenotazioni(LocalDate.now(),utente, postazioni1);}
	@Bean("prenotazione2")
	public Prenotazioni creaPrenotazioni1() {return new Prenotazioni(LocalDate.now(), utente2, postazioni2);}
	@Bean("prenotazione3")
	public Prenotazioni creaPrenotazioni2() {return new Prenotazioni(LocalDate.now(), utente3, postazioni3);}

}
