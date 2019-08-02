package com.shweta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shweta.dao.ItemDAO;
import com.shweta.model.Cart;
import com.shweta.model.CartItem;
import com.shweta.model.Item;

@WebServlet("/rq")
public class AddItemServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		
		ItemDAO dao=new ItemDAO();
		HttpSession session=request.getSession();
		Cart cart=(Cart)session.getAttribute("cart");
		if(cart==null) {
			cart=new Cart();
			session.setAttribute("cart", cart);
		}
		try {
			int itemCount = dao.getItemCount();
			for(int i=1;i<=itemCount;i++)
			{
				String s=request.getParameter("item"+i);
				if(s != null)
				{
					Item item = dao.getItem(i);
					CartItem cartItem=new CartItem("cartItem"+item.getId(),item,1);
					cart.addCartItem(cartItem);
				}
			}
			response.sendRedirect("Display.jsp");
		}
			catch(Exception e) {
				pw.println(e);
			}
				
			}
		}
		
		
		
		
		/*
		 * HttpSession session=request.getSession(); String
		 * str=(String)session.getAttribute("id"); PrintWriter out =
		 * response.getWriter(); out.print("Time is "+str);
		 * 
		 * response.sendRedirect("Display.jsp");
		 */
		
		
		 
		/*
		 * HttpSession session=request.getSession(); session.getCreationTime();
		 * 
		 * PrintWriter out = response.getWriter(); out.print("Time is "+session);
		 */
		

