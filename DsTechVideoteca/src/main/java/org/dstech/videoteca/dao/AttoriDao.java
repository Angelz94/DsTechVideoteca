package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Attore;
import org.dstech.videoteca.model.Film;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

@Repository("AttoriDao")
public class AttoriDao extends AbstractDao<Integer, Attore>{
	
	public Attore findByID(int id) {
		return getByKey(id);
	}

	public boolean salvaAttore(Attore attore) {
		persist(attore);
		return true;
	}
	@SuppressWarnings("unchecked")
	public List<Attore> trovaTuttiAttori() {
		//Criteria criteria = createEntityCriteria();
		SQLQuery criteria = getSession().createSQLQuery("SELECT * FROM Attore ORDER BY COGNOME").addEntity(Attore.class);
		return (List<Attore>) criteria.list();
	}

}