package com.shweta.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shweta.dao.ItemDAO;

@WebServlet("/Fetch")
public class FetchItemServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
		  
		response.setContentType("text/html");    
		PrintWriter pw = response.getWriter();
		
		
		
		try {			
			
			  ItemDAO dao= new ItemDAO(); 
			  Vector items = dao.getAllItems();
			  request.setAttribute("items", items);
			 
			//response.sendRedirect("Display.jsp");

			 request.getRequestDispatcher("/Catlog.jsp").forward(request, response);
		
		
		} catch (Exception e) {
			
			pw.println(e);
		}
		
		String Logout = request.getParameter("Logout");
		if(Logout!=null) {
			request.getRequestDispatcher("/Logout").forward(request, response);

		}
		
		
		}
	}  