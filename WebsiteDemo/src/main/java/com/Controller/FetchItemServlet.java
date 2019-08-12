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

import com.DAO.DAOO;

@WebServlet("/Fetch")
public class FetchItemServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
		  
		response.setContentType("text/html");    
		PrintWriter pw = response.getWriter();
		
		
		try {			
		
			
			  DAOO dao= new DAOO(); 
			  String s = dao.getAllItems();
			  HttpSession sessionDAO= request.getSession();
				sessionDAO.setAttribute("S2", s);
				
			   //String s=rs.substring(2); 
			  
			   
			   
			 
			 int k=(Integer) request.getAttribute("items");
			 
			 // request.setAttribute("items", items);
			  
			  HttpSession session=request.getSession();
			  int a=(Integer) session.getAttribute("S1");
			  pw.println("welcome Session  =" + a+" <br> "+"welcome Cookie =" + k+" <br> "+"Hello  Dear" +s);
			  
			  Cookie c[]=request.getCookies();
			   
			  for(Cookie cok:c) {
				  if(cok.getName().equals("c"))
					  k=Integer.parseInt(cok.getValue());
			  }
			  
			  String name ="Akash";
			  request.setAttribute("sky",name);
			 request.getRequestDispatcher("/catlog.jsp").forward(request, response);
		}
		catch (Exception e) {
			
			pw.println(e);
		}
		  
		}

	
	}  