package com.epicode.gestioneprenotazioni.prenotazioni;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PrenotazioniRepository  extends CrudRepository<Prenotazioni, Long>{
	

@Query("SELECT count(*) FROM Prenotazioni pre WHERE pre.utente.id =:id AND pre.validita =:validita" )
int findByUserAndValidita(Long id, LocalDate validita);

@Query("SELECT count(*) FROM Prenotazioni ele WHERE ele.postazione.id =:id AND ele.validita =:validita" )
int findByPostazioneAndDate(Long id, LocalDate validita);

}
