package org.dstech.videoteca.service;

import java.util.List;

import org.dstech.videoteca.model.Attore;
import org.dstech.videoteca.model.Categoria;
import org.dstech.videoteca.model.Persona;
import org.dstech.videoteca.model.SerieTv;
import org.dstech.videoteca.model.Film;
import org.dstech.videoteca.model.Stagione;
import org.dstech.videoteca.model.User;

public interface IVideotecaService {
	
	Persona findById(int id);
	
	void salvaPersona(User persona);
	
	void modificaPersona(User persona);

	List<User> trovaPersone(); 
	
	List<Film> trovaTuttiFilm();
	
	List<SerieTv> trovaTutteSerieTv();
	
	void modificaFilm(Film film);
	
	void modificaCategoria(Categoria categoria);
	
	void modificaAttore(Attore attore);
	
	void modificaSerieTv(SerieTv serieTv);
	
	List<Categoria> trovaTutteCategorie();
	
	List<Attore> trovaTuttiAttori();
	
	Attore findAttoreById(int id);
	
	void salvaAttore(Attore employee);
	
	Categoria findCategoriaById(int id);
	
	void salvaCategoria(Categoria categoria);
	
	Film findFilmById(int id);
	
	void salvaFilm(Film film);
	
	SerieTv findSerieTvById(int id);
	
	void salvaSerieTv(SerieTv serieTv);

	void salvaStagione(Stagione stagione);
	
	Stagione findStagioneByID(int id);
	
	List<Stagione> trovaTutteStagioni();
}