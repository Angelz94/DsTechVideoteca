package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Film;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
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
		//criteria.addOrder();
		return (List<Film>) criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Film> trovaTuttiFilmOrderTitle() {
		Criteria criteria = createEntityCriteria();	
		criteria.addOrder(Order.asc("TITOLO"));
		return (List<Film>) criteria.list();
	}
	
}