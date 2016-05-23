package org.dstech.videoteca.service;

import java.util.List;

import org.dstech.videoteca.dao.PersonaDao;
import org.dstech.videoteca.dao.ProdottoCinematograficoDao;
import org.dstech.videoteca.model.Film;
import org.dstech.videoteca.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("IVideotecaService")
@Transactional
public class VideotecaServiceImp {

	@Autowired
	private PersonaDao daoPersona;
	
	@Autowired
	private ProdottoCinematograficoDao daoCinematografico;
	
	public Persona findById(int id) {
		return daoPersona.findByID(id);
	}

	public void salvaPersona(Persona employee) {
		daoPersona.salvaPersona(employee);
	}

	public void modificaPersona(Persona employee) {
		Persona entity = daoPersona.findByID(employee.getId());
		if(entity!=null){
			//set nome persona
			entity.setNome(employee.getNome());
			//set data
			entity.setDataDiNascita(employee.getDataDiNascita());
		}
	}
	
	public List<Persona> trovaPersone() {
		return daoPersona.trovaAttori();
	}
	
	public List<Film> trovaTuttiFilm() {
		return daoCinematografico.trovaTuttiFilm();
	}
}
