package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  
		  String name=request.getParameter("Name"); 
		  String password=request.getParameter("Pass");
		  
		  if(name.equals("Akash")&&password.equals("sky")) 
		  { 
			  HttpSession sessionLog=request.getSession();
			  sessionLog.setAttribute("L1",name);
			  response.sendRedirect("jst.jsp"); 
		  } 
		  else
		  { 
			  
			 response.sendRedirect("jstl.jsp");
		  }
		 
		
	}

}
