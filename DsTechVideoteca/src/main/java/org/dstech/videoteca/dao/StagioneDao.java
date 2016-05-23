package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Stagione;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("StagioneDao")
public class StagioneDao extends AbstractDao<Integer, Stagione>{

	@SuppressWarnings("unchecked")
	public List<Stagione> trovaTutteStagioni() {
		Criteria criteria = createEntityCriteria();
		return (List<Stagione>) criteria.list();
	}
	
	public Stagione findStagioneByID(int id) {
		return getByKey(id);
	}

	public boolean salvaStagione(Stagione stagione) {
		persist(stagione);
		return true;
	}
}