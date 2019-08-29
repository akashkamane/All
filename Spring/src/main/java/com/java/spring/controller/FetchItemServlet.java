package com.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.spring.Add;



@Controller
public class FetchItemServlet {
	
		
			/*
			 * ItemDAO dao= new ItemDAO(); Vector items = dao.getAllItems();
			 * request.setAttribute("items", items);
			 */
	@RequestMapping("/Fetch")
		public ModelAndView add(@RequestParam("t1") String i, @RequestParam("t2") String j) {
			Decision a=new Decision();
			String k=a.add(i,j);
			ModelAndView mv=new ModelAndView();
				mv.setViewName("DisplayCart.jsp");
				mv.addObject("result",k);
				
				return mv;
			 
			

			 
		}
		
		
		
		
	}  