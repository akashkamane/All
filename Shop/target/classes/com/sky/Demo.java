package com.sky;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet{  
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException {
			  
			int i=Intger.parseInt(req.getParameter("firstname"));
			int j=Intger.parseInt(req.getParameter("lastnameO"));

			int K=i+j;
			PrintWriter out=res.getWriter();  
			
			out.print("Result Is" + K)
	}

}
