package com.epicode.gestioneprenotazioni.prenotazioni;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.epicode.gestioneprenotazioni.postazioni.Postazioni;
import com.epicode.gestioneprenotazioni.utente.Utente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

@NoArgsConstructor
@Entity
public class Prenotazioni {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate validita;
	@ManyToOne
	private Utente utente;
	@ManyToOne
	private Postazioni postazione;
	
	public Prenotazioni(LocalDate validita, Utente utente, Postazioni postazione) {
		super();
		this.validita = validita;
		this.utente = utente;
		this.postazione = postazione;
	}
	
	
	

}
