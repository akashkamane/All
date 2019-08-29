package com.Web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Add")
public class Add extends HttpServlet{  
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException {
		  
		int i=Integer.parseInt(req.getParameter("firstname"));
		int j=Integer.parseInt(req.getParameter("lastname"));

		int k=i+j;
		k=k*k;
		req.setAttribute("k", k);
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}

}
