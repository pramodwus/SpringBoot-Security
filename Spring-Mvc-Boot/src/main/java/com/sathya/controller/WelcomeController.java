package com.sathya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller

public class WelcomeController {
	
	@GetMapping("/show")
	public ModelAndView showWelcome()
	{
		return new ModelAndView("welcome"); 
		
		
	}
	

}
