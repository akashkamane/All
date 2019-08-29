package com.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DAOO;

@WebServlet("/Log")
public class Log extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("Name"); 
		  String password=request.getParameter("Pass");
		  DAOO dao=new DAOO();
		  //if(name.equals("Akash")&&password.equals("sky"))
		    try {
				if(dao.check(name, password))
				  
  { 
				  HttpSession sessionLog=request.getSession();
				  sessionLog.setAttribute("L1",name);
				  response.sendRedirect("jst.jsp"); 
  } 
  else
  { 
				  
				 response.sendRedirect("jstl.jsp");
  }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
