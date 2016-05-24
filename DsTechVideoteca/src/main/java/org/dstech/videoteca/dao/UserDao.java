package org.dstech.videoteca.dao;

import java.util.List;

import org.dstech.videoteca.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDao extends AbstractDao<Integer, User>{
	
	public User findBySso(String id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("USER", id));
		return (User) criteria.list();
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
