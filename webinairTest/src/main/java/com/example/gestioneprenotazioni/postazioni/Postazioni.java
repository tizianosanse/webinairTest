package com.epicode.gestioneprenotazioni.postazioni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.epicode.gestioneprenotazioni.prenotazioni.Prenotazioni;
import com.epicode.gestioneprenotazioni.sede.Sede;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

@Entity
public class Postazioni {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descrizione;
	private int numOccupanti;
	
	private Tipo tipo;
	@ManyToOne
	private Sede sede;
	@OneToMany
	private List<Prenotazioni> prenotazione = new ArrayList<>();
	
	
	public Postazioni( String descrizione, int numOccupanti, Tipo tipo 
			) {
		super();
		
		this.descrizione = descrizione;
		this.numOccupanti = numOccupanti;
		this.tipo = tipo;
		
	}
	
	

}
