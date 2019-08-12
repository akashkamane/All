package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class Demo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
		{
		int i = Integer.parseInt(request.getParameter("NUM1"));
		int j= Integer.parseInt(request.getParameter("NUM2"));
		
		int k=i+j;
		
		HttpSession session= request.getSession();
		session.setAttribute("S1", k);
		
		Cookie c=new Cookie("c",k+"");
		response.addCookie(c);
	
		
		pw.println("Addition is =  "+ k);
		request.setAttribute("items", k);
		}
		//RequestDispatcher rd=request.getRequestDispatcher("Fetch");
		//rd.forward(request, response);
		
	
				
		request.getRequestDispatcher("Fetch").forward(request, response);
		
		
		
		
		
	}

}
