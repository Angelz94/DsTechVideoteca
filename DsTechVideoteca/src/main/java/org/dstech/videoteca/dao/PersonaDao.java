package org.dstech.videoteca.dao;


import java.util.List;

import org.dstech.videoteca.model.User;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("personaDao")
public class PersonaDao extends AbstractDao<Integer, User>{
	
	public User findByID(int id) {
		return getByKey(id);
	}

	public boolean salvaPersona(User employee) {
		persist(employee);
		return true;
	}
	
	public boolean eliminaPersonaById(User employee) {
		// TODO Auto-generated method stub
		/*Query query = getSession().createSQLQuery("delete from employee where ssn = :ssn");
		query.setString("ssn", ssn);
		int executeUpdate = query.executeUpdate();
		return executeUpdate > 0 ? true : false;*/
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<User> trovaTuttiUser() {
		Criteria criteria = createEntityCriteria();
		// TODO Auto-generated method stub
		return (List<User>) criteria.list();
	}

}