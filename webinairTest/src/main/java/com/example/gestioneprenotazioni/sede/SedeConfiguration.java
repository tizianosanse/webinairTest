package com.epicode.gestioneprenotazioni.sede;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.epicode.gestioneprenotazioni.postazioni.Postazioni;

@Configuration
public class SedeConfiguration {
	@Autowired
	@Qualifier("postazioni1")
	 Postazioni postazioni1;
	@Autowired
	@Qualifier("postazioni2")
	Postazioni postazioni2;
	@Autowired
	@Qualifier("postazioni3")
	Postazioni postazioni3;
	
	
	@Bean("sede")
	public Sede creaSede() {Sede sede = new Sede("Google","Via Del Pianto", "Roma");
	sede.addPostazioni(postazioni1);
	return sede;}
	@Bean("sede2")
	public Sede creaSede1() {Sede sede = new Sede("Google","Via Del Pianto", "Roma");
	sede.addPostazioni(postazioni2);
	return sede;}
	@Bean("sede3")
	public Sede creaSede2() {Sede sede = new Sede("Google","Via Del Pianto", "Roma");
	sede.addPostazioni(postazioni3);
	return sede;}

}
