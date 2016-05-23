package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.SerieTv;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("SerieTvDao")
public class SerieTvDao extends AbstractDao<Integer, SerieTv>{

	@SuppressWarnings("unchecked")
	public List<SerieTv> trovaTuttiFilm() {
		Criteria criteria = createEntityCriteria();
		return (List<SerieTv>) criteria.list();
	}
	
}