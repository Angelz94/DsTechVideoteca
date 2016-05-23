package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Film;
import org.dstech.videoteca.model.Persona;
import org.dstech.videoteca.model.ProdottoCinematografico;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("ProdottoCinematograficoDao")
public class ProdottoCinematograficoDaoImpl extends ProdottoCinematograficoAbstract<Integer, ProdottoCinematografico> implements ProdottoCinematograficoDao{

	public List<Film> trovaTuttiFilm() {
		Criteria criteria = createEntityCriteria();
		return (List<Film>) criteria.list();
	}
	
}