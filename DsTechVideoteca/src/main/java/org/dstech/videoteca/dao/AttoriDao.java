package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Attore;
import org.hibernate.Criteria;
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
		Criteria criteria = createEntityCriteria();
		return (List<Attore>) criteria.list();
	}

}