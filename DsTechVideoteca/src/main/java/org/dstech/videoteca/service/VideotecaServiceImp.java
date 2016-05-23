package org.dstech.videoteca.service;

import java.util.List;

import org.dstech.videoteca.dao.AttoriDao;
import org.dstech.videoteca.dao.CategorieDao;
import org.dstech.videoteca.dao.FilmDao;
import org.dstech.videoteca.dao.PersonaDao;
import org.dstech.videoteca.dao.SerieTvDao;
import org.dstech.videoteca.model.Film;
import org.dstech.videoteca.model.Persona;
import org.dstech.videoteca.model.SerieTv;
import org.dstech.videoteca.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("IVideotecaService")
@Transactional
public class VideotecaServiceImp implements IVideotecaService{

	@Autowired
	private PersonaDao daoPersona;
	
	@Autowired
	private FilmDao daoFilm;
	
	@Autowired
	private CategorieDao daoCategoria;
	
	@Autowired
	private AttoriDao daoAttore;
	
	@Autowired
	private SerieTvDao daoSerieTv;
	
	public Persona findById(int id) {
		return daoPersona.findByID(id);
	}

	public void salvaPersona(User employee) {
		daoPersona.salvaPersona(employee);
	}

	public void modificaPersona(User employee) {
		Persona entity = daoPersona.findByID(employee.getId());
		if(entity!=null){
			//set nome persona
			entity.setNome(employee.getNome());
			//set data
			entity.setDataDiNascita(employee.getDataDiNascita());
		}
	}
	
	public List<User> trovaPersone() {
		return daoPersona.trovaTuttiUser();
	}
	
	public List<Film> trovaTuttiFilm() {
		return daoFilm.trovaTuttiFilm();
	}
	
	public List<SerieTv> trovaTutteSerieTv(){
		return daoSerieTv.trovaTuttiSerieTv();
	}
}
