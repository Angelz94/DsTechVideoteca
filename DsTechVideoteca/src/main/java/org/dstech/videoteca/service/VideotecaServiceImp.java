package org.dstech.videoteca.service;

import java.util.List;

import org.dstech.videoteca.dao.PersonaDao;
import org.dstech.videoteca.dao.FilmDao;
import org.dstech.videoteca.model.Film;
import org.dstech.videoteca.model.Persona;
import org.dstech.videoteca.model.SerieTv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("IVideotecaService")
@Transactional
public class VideotecaServiceImp implements IVideotecaService{

	@Autowired
	private PersonaDao daoPersona;
	
	/*@Autowired
	private ProdottoCinematograficoDao daoCinematografico;*/
	
	@Autowired
	private FilmDao daoFilm;
	
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
		//return daoPersona.trovaAttori();
		return null;
	}
	
	public List<Film> trovaTuttiFilm() {
		return daoFilm.trovaTuttiFilm();
	}
	
	public List<SerieTv> trovaTutteSerieTv(){
		
		return null;
	}
}
