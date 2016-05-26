package org.dstech.videoteca.dao;

import java.util.List;
import org.dstech.videoteca.model.User;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDao extends AbstractDao<Integer, User>{
	
	public User findBySso(String user) {
		System.out.println("nome passato alla query findBySso: " + user);
		//Criteria criteria = createEntityCriteria();
		//criteria.add(Restrictions.eq("USER", user));
		SQLQuery criteria = getSession().createSQLQuery("SELECT * FROM user WHERE USER = \"" + user + "\";").addEntity(User.class);
		System.out.println("fine criteria findbySso");
		return (User) criteria.uniqueResult();
	}
	
	public boolean salvaUser(User user) {
		persist(user);
		return true;
	}
	@SuppressWarnings("unchecked")
	public List<User> trovaTuttiUser() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

}
