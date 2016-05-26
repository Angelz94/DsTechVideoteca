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
		return "login";
	}
	
	@RequestMapping(value = { "/Access_Denied" }, method = RequestMethod.GET)
	public String accessDeniedGet(ModelMap model) {
		System.out.println("siamo passati dal accesso negato");
		return "errorePage";
	}
	
	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String login(ModelMap model) {
		System.out.println("siamo passati login GET");
		return "login";
	}
	
}	