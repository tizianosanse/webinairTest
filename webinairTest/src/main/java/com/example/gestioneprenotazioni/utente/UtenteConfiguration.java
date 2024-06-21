package com.epicode.gestioneprenotazioni.utente;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtenteConfiguration {

	
	
	
	@Bean("utente")
	public Utente creaUtente() {return new Utente("pippo", "forte", "pippo.forte@gmail.com");}
	@Bean("utente2")
	public Utente creaUtente1() {return new Utente("pippo", "piano", "pippo.piano@gmail.com");}
	@Bean("utente3")
	public Utente creaUtente2() {return new Utente("pippo", "duro", "pippo.duro@gmail.com");}

}
