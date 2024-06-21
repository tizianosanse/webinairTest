package com.epicode.gestioneprenotazioni.sede;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestioneprenotazioni.postazioni.Postazioni;


@Repository
public interface SedeRepository  extends CrudRepository<Sede, Long>{

}
