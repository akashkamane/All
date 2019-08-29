package com.java.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
	public class Demo {
	
	
		@RequestMapping("/Demo")
		public ModelAndView add(@RequestParam("t1") String i, @RequestParam("t2") String j) {
			Add a=new Add();
			String k=a.add(i,j);
			ModelAndView mv=new ModelAndView();
				mv.setViewName("DisplayCart.jsp");
				mv.addObject("result",k);
				
				return mv;
			
		}
		
	/*
	 * @RequestMapping("/fetch") public ModelAndView Fetch(@RequestParam("t1")
	 * String i, @RequestParam("t2") String j) { Fetch f=new Fetch(); String
	 * k=f.login(); ModelAndView mv=new ModelAndView();
	 * mv.setViewName("Display.jsp"); mv.addObject("result",k);
	 * 
	 * return mv;
	 * 
	 * }
	 */
	}

