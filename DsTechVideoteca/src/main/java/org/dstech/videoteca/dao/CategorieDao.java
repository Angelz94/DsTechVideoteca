package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Categoria;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("CategorieDao")
public class CategorieDao extends AbstractDao<Integer, Categoria>{

	@SuppressWarnings("unchecked")
	public List<Categoria> trovaTuttiFilm() {
		Criteria criteria = createEntityCriteria();
		return (List<Categoria>) criteria.list();
	}
}
