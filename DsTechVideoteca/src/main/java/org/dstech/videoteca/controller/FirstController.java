package org.dstech.videoteca.controller;

import java.util.List;

import org.dstech.videoteca.model.Persona;
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

	@RequestMapping(value = { "/", "/trovaPersone" }, method = RequestMethod.GET)
	public String trovaPersone(ModelMap model) {
		List<Persona> persona = service.trovaPersone();
		model.addAttribute("persona", persona); // la setto come attributo
		return "index"; // ritorno nella pagina
	}
	
//	@RequestMapping(value = { "/", "/listSerieTv" }, method = RequestMethod.GET)
//	public String listSerieTv(ModelMap model) {
//
//		List<SerieTv> serieTv = service.findAllSerieTv();
//		model.addAttribute("serieTv", serieTv); 
//		return "allserieTv";
//   }
//	@RequestMapping(value = { "/", "/listFilm" }, method = RequestMethod.GET)
//	public String listFilm(ModelMap model) {
//
//		List<Film> film = service.findAllFilm();
//		model.addAttribute("film", film); 
//		return "allfilm";
//}
//	@RequestMapping(value = { "/", "/listCategorie" }, method = RequestMethod.GET)
//	public String listFilm(ModelMap model) {
//
//		List<Categorie> categorie = service.findAllCategorie();
//		model.addAttribute("categorie", categorie); 
//		return "allcategorie";
//}
//	
}	
	
	
	
	
	