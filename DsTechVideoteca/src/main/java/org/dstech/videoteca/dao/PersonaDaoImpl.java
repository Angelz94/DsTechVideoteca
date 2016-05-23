package org.dstech.videoteca.dao;


import java.util.List;

import org.dstech.videoteca.model.Persona;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("personaDao")
public class PersonaDaoImpl extends AbstractDao<Integer, Persona> implements PersonaDao{
	
	public Persona findByID(int id) {
		return getByKey(id);
	}

	public boolean salvaPersona(Persona employee) {
		// TODO Auto-generated method stub
		persist(employee);
		return true;
	}
	
	public boolean eliminaPersonaById(Persona employee) {
		// TODO Auto-generated method stub
		/*Query query = getSession().createSQLQuery("delete from employee where ssn = :ssn");
		query.setString("ssn", ssn);
		int executeUpdate = query.executeUpdate();
		return executeUpdate > 0 ? true : false;*/
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Persona> trovaAttori() {
		Criteria criteria = createEntityCriteria();
		// TODO Auto-generated method stub
		return (List<Persona>) criteria.list();
	}

}