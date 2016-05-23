package org.dstech.videoteca.service;

import java.util.List;

import org.dstech.videoteca.model.Persona;

public interface IVideotecaService {
	Persona findById(int id);
	
	void salvaPersona(Persona persona);
	
	void modificaPersona(Persona persona);

	List<Persona> trovaPersone(); 
}
