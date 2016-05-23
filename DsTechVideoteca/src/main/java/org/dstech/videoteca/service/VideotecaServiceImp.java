package org.dstech.videoteca.service;

import java.util.List;

import org.dstech.videoteca.dao.AttoriDao;
import org.dstech.videoteca.dao.CategorieDao;
import org.dstech.videoteca.dao.FilmDao;
import org.dstech.videoteca.dao.PersonaDao;
import org.dstech.videoteca.dao.SerieTvDao;
import org.dstech.videoteca.dao.StagioneDao;
import org.dstech.videoteca.model.Attore;
import org.dstech.videoteca.model.Categoria;
import org.dstech.videoteca.model.Film;
import org.dstech.videoteca.model.Persona;
import org.dstech.videoteca.model.SerieTv;
import org.dstech.videoteca.model.Stagione;
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
	
	@Autowired
	private StagioneDao daoStagione;
	
	public void modificaFilm(Film film) {
		Film entity = daoFilm.findByID(film.getId());
		if(entity!=null){
			entity.setTitolo(film.getTitolo());
			entity.setDurata(film.getDurata());
		}
	}
	
	public void modificaCategoria(Categoria categoria) {
		Categoria entity = daoCategoria.findByID(categoria.getId());
		if(entity!=null){
			entity.setNome(categoria.getNome());
			entity.setDescrizione(categoria.getDescrizione());
		}
	}
	
	public void modificaAttore(Attore attore) {
		Attore entity = daoAttore.findByID(attore.getId());
		if(entity!=null){
			entity.setNome(attore.getNome());
			entity.setCognome(attore.getCognome());
		}
	}
	
	public void modificaSerieTv(SerieTv serieTv) {
		SerieTv entity = daoSerieTv.findByID(serieTv.getId());
		if(entity!=null){
			entity.setTitolo(serieTv.getTitolo());
		}
	}
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
	
	public List<Categoria> trovaTutteCategorie(){
		return daoCategoria.trovaTutteCategorie();
	}
	
	public List<Attore> trovaTuttiAttori(){
		return daoAttore.trovaTuttiAttori();
	}
	
	public Attore findAttoreById(int id) {
		return daoAttore.findByID(id);
	}

	public void salvaAttore(Attore employee) {
		daoAttore.salvaAttore(employee);
	}
	
	public Categoria findCategoriaById(int id) {
		return daoCategoria.findByID(id);
	}

	public void salvaCategoria(Categoria categoria) {
		daoCategoria.salvaCategoria(categoria);
	}
	
	public Film findFilmById(int id) {
		return daoFilm.findByID(id);
	}

	public void salvaFilm(Film film) {
		daoFilm.salvaFilm(film);
	}
	
	public SerieTv findSerieTvById(int id) {
		return daoSerieTv.findByID(id);
	}

	public void salvaSerieTv(SerieTv serieTv) {
		daoSerieTv.salvaSerieTv(serieTv);
	}
	
	public void salvaStagione(Stagione stagione) {
		daoStagione.salvaStagione(stagione);
	}
	
	public Stagione findStagioneByID(int id) {
		return daoStagione.findStagioneByID(id);
	}
	
	public List<Stagione> trovaTutteStagioni(){
		return daoStagione.trovaTutteStagioni();
	}
}