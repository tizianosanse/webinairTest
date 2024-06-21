package com.epicode.gestioneprenotazioni.postazioni;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestioneprenotazioni.sede.Sede;



@Configuration
public class PostazioniConfiguration {

	@Bean("postazioni1")
	public Postazioni creaPostazioni() {return new Postazioni( "accogliente postazione antica", 15, Tipo.OPENSPACE);}
	@Bean("postazioni2")
	public Postazioni creaPostazioni1() {return new Postazioni( "rustico postazione moderna", 5, Tipo.PRIVATO);}
	@Bean("postazioni3")
	public Postazioni creaPostazioni2() {return new Postazioni("stanza  per riunioni", 31, Tipo.AREARIUNIONI);}

}
