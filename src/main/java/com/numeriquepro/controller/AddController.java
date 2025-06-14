package com.numeriquepro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("prenom") String prenom, @RequestParam("nom") String nom) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome"); // on indique ici seulemet le nom de la page
		mv.addObject("prenom", prenom);
		mv.addObject("nom", nom);
		return  mv;
		
	}

}
