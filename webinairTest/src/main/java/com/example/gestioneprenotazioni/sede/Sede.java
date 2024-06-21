package com.epicode.gestioneprenotazioni.sede;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.epicode.gestioneprenotazioni.postazioni.Postazioni;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
@Table(name="Sede")
public class Sede {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String indirizzo;
	private String citta;
	@OneToMany(cascade = CascadeType.PERSIST)@JoinColumn(name = "sede_id")
	private List<Postazioni> postazioni = new ArrayList<>();
	
	public Sede(String nome, String indirizzo, String citta) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
		
	}
	
	public void addPostazioni(Postazioni p) {
		postazioni.add(p);
	}
	
	

}
