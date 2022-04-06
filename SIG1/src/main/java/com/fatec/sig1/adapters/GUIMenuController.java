package com.fatec.sig1.adapters;
<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class GUIMenuController {
 @GetMapping("/login")
 public ModelAndView autenticacao() {
 return new ModelAndView("paginaLogin");
 }
 @GetMapping("/")
 public ModelAndView home() {
 return new ModelAndView ("paginaMenu");
 }
}
=======

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GUIMenuController {
	@GetMapping("/login")
	public ModelAndView autenticacao() {
		return new ModelAndView("paginaLogin");
	}

	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("paginaMenu");
	}
}
>>>>>>> 43ee7a6acb3b9f8ee8148fea475d37d5ddf59115
