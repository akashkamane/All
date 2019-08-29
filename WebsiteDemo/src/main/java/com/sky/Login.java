package com.sky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
//@WebFilter("/Login")
public class Login implements Filter {

  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/*
		 * PrintWriter pw = response.getWriter(); HttpServletRequest
		 * req=(HttpServletRequest)request;
		 * 
		 * 
		 * String name=request.getParameter("Name"); String
		 * password=request.getParameter("Pass");
		 * 
		 * if(name!=null) {
		 * 
		 * chain.doFilter(request, response); } else { pw.println("Enter User Name"); }
		 * 
		 * if(password!=null) { chain.doFilter(request, response); } else {
		 * pw.println("Enter Your Password"); }
		 */
				
			
		 
		 
	}

	
	

}
