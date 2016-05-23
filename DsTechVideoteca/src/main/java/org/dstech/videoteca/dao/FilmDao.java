package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Film;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("FilmDao")
public class FilmDao extends AbstractDao<Integer, Film>{
	
	public Film findByID(int id) {
		return getByKey(id);
	}

	public boolean salvaFilm(Film film) {
		persist(film);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public List<Film> trovaTuttiFilm() {
		Criteria criteria = createEntityCriteria();	
		return (List<Film>) criteria.list();
	}
	
}