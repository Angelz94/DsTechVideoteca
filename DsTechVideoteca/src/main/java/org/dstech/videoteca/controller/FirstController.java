package org.dstech.videoteca.controller;

import java.util.List;

import org.dstech.videoteca.model.Stagione;
import org.dstech.videoteca.model.User;
import org.dstech.videoteca.model.SerieTv;
import org.dstech.videoteca.model.Attore;
import org.dstech.videoteca.model.Categoria;
import org.dstech.videoteca.model.Film;
import org.dstech.videoteca.service.IVideotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class FirstController {
	
	@Autowired
	IVideotecaService service;
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String Index(ModelMap model) {
		return "index";
	}
	
	@RequestMapping(value = { "/trovaPersone" }, method = RequestMethod.GET)
	public String trovaPersone(ModelMap model) {
		List<User> persona = service.trovaPersone();
		model.addAttribute("persona", persona);
		return "all_user";
	}
	
	@RequestMapping(value = { "/listSerieTv" }, method = RequestMethod.GET)
	public String listSerieTv(ModelMap model) {
		List<SerieTv> serieTv = service.trovaTutteSerieTv();
		model.addAttribute("serieTv", serieTv); 
		return "all_serieTv";
	}
	
	@RequestMapping(value = { "/listFilm" }, method = RequestMethod.GET)
	public String listFilm(ModelMap model) {
		List<Film> film = service.trovaTuttiFilm();
		model.addAttribute("film", film); 
		return "all_film";
	}
	
	@RequestMapping(value = { "/listCategorie" }, method = RequestMethod.GET)
	public String listCategorie(ModelMap model) {
		List<Categoria> categorie = service.trovaTutteCategorie();
		model.addAttribute("categorie", categorie); 
		return "all_categorie";
	}

	@RequestMapping(value = { "/listStagioni" }, method = RequestMethod.GET)
	public String listStagioni(ModelMap model) {
		List<Stagione> stagioni = service.trovaTutteStagioni();
		model.addAttribute("stagioni", stagioni); 
		return "all_stagioni";
	}
	
	@RequestMapping(value = { "/listAttori" }, method = RequestMethod.GET)
	public String listAttori(ModelMap model) {
		List<Attore> attori = service.trovaTuttiAttori();
		model.addAttribute("attori", attori); 
		return "all_attori";
	}
}	