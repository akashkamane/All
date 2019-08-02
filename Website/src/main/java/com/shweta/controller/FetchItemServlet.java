package com.shweta.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shweta.dao.ItemDAO;

@WebServlet("/FetchItemServlet")
public class FetchItemServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
		  
		response.setContentType("text/html");    
		PrintWriter pw = response.getWriter();
		try {			
			ItemDAO dao= new ItemDAO();
			Collection<?> items =(Collection<?>) dao.getAllItems();
			request.setAttribute("items", items);
			

			 request.getRequestDispatcher("Display.jsp").forward(request, response);
		} catch (Exception e) {
			
			pw.println(e);
		}
		
		
		/*
		 * RequestDispatcher rd = request.getRequestDispatcher("rq");
		 * rd.forward(request, response);
		 * 			
		 * HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
		 */
		
		  
		}}  