package org.dstech.videoteca.controller;

import java.util.List;
import java.util.Set;

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
	
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String index(ModelMap model) {
		System.out.println("siamo passati dalla index");
		return "index3";
	}
	
//	@RequestMapping(value = { "/Access_Denied" }, method = RequestMethod.POST)
//	public String accessDenied(ModelMap model) {
//		System.out.println("siamo passati dal accesso negato");
//		return "errorePage";
//	}
	
	@RequestMapping(value = { "/guest/welcome_page" }, method = RequestMethod.POST)
	public String welcomePage(ModelMap model) {
		System.out.println("siamo passati dalla welcome_page");
		return "welcome_page";
	}
	
	@RequestMapping(value = { "/guest/welcome_page" }, method = RequestMethod.GET)
	public String welcomePageGet(ModelMap model) {
		System.out.println("siamo passati dalla welcome_page");
		return "welcome_page";
	}
	
	@RequestMapping(value = { "/trovaPersone" }, method = RequestMethod.GET)
	public String trovaPersone(ModelMap model) {
		List<User> persona = service.trovaPersone();
		model.addAttribute("persona", persona);
		return "all_user";
	}
	
	@RequestMapping(value = { "/guest/listSerieTv" }, method = RequestMethod.GET)
	public String listSerieTv(ModelMap model) {
		List<SerieTv> serieTv = service.trovaTutteSerieTv();
		model.addAttribute("serieTv", serieTv); 
		return "all_serieTv";
	}
	
	@RequestMapping(value = { "/guest/listFilm" }, method = RequestMethod.GET)
	public String listFilm(ModelMap model) {
		List<Film> films = service.trovaTuttiFilm();
		model.addAttribute("films", films); 
		return "all_film";
	}
	
	@RequestMapping(value = { "/guest/listCategorie" }, method = RequestMethod.GET)
	public String listCategorie(ModelMap model) {
		List<Categoria> categorie = service.trovaTutteCategorie();
		model.addAttribute("categories", categorie); 
		return "all_categorie";
	}

	@RequestMapping(value = { "/listStagioni" }, method = RequestMethod.GET)
	public String listStagioni(ModelMap model) {
		List<Stagione> stagioni = service.trovaTutteStagioni();
		model.addAttribute("stagioni", stagioni); 
		return "all_stagioni";
	}
	
	@RequestMapping(value = { "/guest/listAttori" }, method = RequestMethod.GET)
	public String listAttori(ModelMap model) {
		List<Attore> attori = service.trovaTuttiAttori();
		model.addAttribute("attori", attori); 
		return "all_attori";
	}
}	