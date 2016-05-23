package org.dstech.videoteca.service;

import java.util.List;

import org.dstech.videoteca.model.Persona;
import org.dstech.videoteca.model.SerieTv;
import org.dstech.videoteca.model.Film;
import org.dstech.videoteca.model.User;

public interface IVideotecaService {
	
	Persona findById(int id);
	
	void salvaPersona(User persona);
	
	void modificaPersona(User persona);

	//trova user
	List<User> trovaPersone(); 
	
	List<Film> trovaTuttiFilm();
	
	List<SerieTv> trovaTutteSerieTv();
}
