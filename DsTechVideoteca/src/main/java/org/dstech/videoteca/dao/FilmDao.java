package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Film;
import org.dstech.videoteca.model.SerieTv;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
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
		//Criteria criteria = createEntityCriteria();	
		//criteria.addOrder();
		SQLQuery criteria = getSession().createSQLQuery("SELECT * FROM Film ORDER BY titolo").addEntity(Film.class);
		return (List<Film>) criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Film> trovaTuttiFilmOrderTitle() {
		Criteria criteria = createEntityCriteria();	
		criteria.addOrder(Order.asc("TITOLO"));
		return (List<Film>) criteria.list();
	}
	
}