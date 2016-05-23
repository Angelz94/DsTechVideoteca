package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Persona;

public interface PersonaDao {
	Persona findByID(int id);
	
	boolean salvaPersona(Persona persona);
	
	boolean eliminaPersonaById(Persona persona);
	
	List<Persona> trovaAttori();
	
}
