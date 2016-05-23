package org.dstech.videoteca.service;

import java.util.List;

import org.dstech.videoteca.dao.PersonaDao;
import org.dstech.videoteca.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("IVideotecaService")
@Transactional
public class VideotecaServiceImp {

	@Autowired
	private PersonaDao dao;
	
	public Persona findById(int id) {
		return dao.findByID(id);
	}

	public void salvaPersona(Persona employee) {
		dao.salvaPersona(employee);
	}

	public void modificaPersona(Persona employee) {
		Persona entity = dao.findByID(employee.getId());
		if(entity!=null){
			//set nome persona
			entity.setName(employee.getName());
			//set data
			entity.setJoiningDate(employee.getJoiningDate());
		}
	}
	
	public List<Persona> trovaPersone() {
		return dao.trovaPersone();
	}
}
