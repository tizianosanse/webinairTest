package com.epicode.gestioneprenotazioni.postazioni;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneprenotazioni.sede.Sede;




@Repository
public interface PostazioniRepository extends CrudRepository<Postazioni, Long>{

	//public List<Postazioni> findByTipo(Tipo tipo);
	
	@Query("SELECT p FROM Postazioni p WHERE p.sede.citta =:citta AND p.tipo =:tipo" )
	public List<Postazioni>findByCittaAndTipo(String citta, Tipo tipo);
}
