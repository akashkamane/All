 package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class AddController {
	
	
	@RequestMapping("/Index")
	public String Demo() {
		return "Display.jsp";
	}
	}
	
	
	/*
	 * public class MyController {
	 * 
	 * public ModelAndView User(String Name,String pass) {
	 * 
	 * ModelAndView mv=new ModelAndView();
	 * 
	 * Second s=new Second();
	 * 
	 * s.printName();
	 * 
	 * 
	 * return mv;
	 * 
	 * }
	 * 
	 * }
	 */
