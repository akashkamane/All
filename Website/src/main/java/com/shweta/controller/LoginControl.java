package com.shweta.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shweta.dao.ItemDAO;
import com.shweta.model.User;


@WebServlet("/WebLogin")
public class LoginControl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		 
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		ItemDAO dao=new ItemDAO();
		  String name=request.getParameter("Name");
		  String password=request.getParameter("Pass");
	  
		
		String Login = request.getParameter("Login");
		if(Login!=null) {
			
			 
				try {
					if(dao.check(name, password))
					{
					  HttpSession session=request.getSession();
					  session.setAttribute("User",name);
					  //response.sendRedirect("/Fetch"); 
					  request.getRequestDispatcher("/Fetch").forward(request, response);
					}
					else
					{
						request.getRequestDispatcher("/Index.jsp").forward(request, response);
					}								
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
				
				String Registration=request.getParameter("Reg");
				if(Registration!=null) {
					
				request.getRequestDispatcher("/UserInfo.html").forward(request, response);
						
					}  
				String Registr=request.getParameter("Registerd");
				if(Registr!=null) {
					String sirname=request.getParameter("Sirname");
					String username=request.getParameter("UserName");
					String address=request.getParameter("Add");
					try {
						dao.setUser(name,sirname,username,address);
						dao.setPassword(username,password);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				request.getRequestDispatcher("/Index.jsp").forward(request, response);
						
					} 
	}

}
