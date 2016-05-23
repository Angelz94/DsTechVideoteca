package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Film;

public interface ProdottoCinematograficoDao {
	List<Film> trovaTuttiFilm();
}