package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.Attore;
import org.dstech.videoteca.model.Categoria;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
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
		//Criteria criteria = createEntityCriteria();
		SQLQuery criteria = getSession().createSQLQuery("SELECT * FROM categoria ORDER BY NOME").addEntity(Categoria.class);
		return (List<Categoria>) criteria.list();
	}
}
