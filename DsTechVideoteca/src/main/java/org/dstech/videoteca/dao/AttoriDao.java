package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Attore;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("AttoriDao")
public class AttoriDao extends AbstractDao<Integer, Attore>{

	@SuppressWarnings("unchecked")
	public List<Attore> trovaTuttiFilm() {
		Criteria criteria = createEntityCriteria();
		return (List<Attore>) criteria.list();
	}

}