package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Categoria;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("CategorieDao")
public class CategorieDao extends AbstractDao<Integer, Categoria>{
	
	public Categoria findByID(int id) {
		return getByKey(id);
	}

	public boolean salvaCategoria(Categoria categoria) {
		persist(categoria);
		return true;
	}
	@SuppressWarnings("unchecked")
	public List<Categoria> trovaTutteCategorie() {
		Criteria criteria = createEntityCriteria();
		return (List<Categoria>) criteria.list();
	}
}
