package com.epicode.gestioneprenotazioni.utente;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.epicode.gestioneprenotazioni.prenotazioni.Prenotazioni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String nomecompleto;
	private String email;
	@OneToMany
	private List<Prenotazioni> prenotazioni;
	
	
	public Utente(String username, String nomecompleto, String email) {
		super();
		this.username = username;
		this.nomecompleto = nomecompleto;
		this.email = email;
		
	}
	

}
