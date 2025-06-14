package com.numeriquepro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/welcome.jsp");
		mv.addObject("prenom", "Mohamadou");
		mv.addObject("nom", "Boly");
		return  mv;
		
	}

}
