package com.shweta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shweta.dao.ItemDAO;
import com.shweta.model.Cart;
import com.shweta.model.CartItem;

public class Order extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Itemname=null;
		int quantity=0;
		ItemDAO dao =new ItemDAO();
		
		HttpSession session = request.getSession();
		String User=(String) session.getAttribute("User");
		
		Cart cart=(Cart)session.getAttribute("cart");
		Collection cartItem=cart.getCartItems();
		Iterator it=cartItem.iterator();
		
		
				while(it.hasNext())
				{
					
					CartItem cartItm=(CartItem)it.next();
					Itemname=cartItm.getItem().getName();
					quantity=cartItm.getQuantity();
					
					try {
						dao.setOrder(User,Itemname,quantity);
											} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
								
				request.getRequestDispatcher("/FreezeCart.jsp").forward(request, response);


		 

		
	}

	

	
	

}
