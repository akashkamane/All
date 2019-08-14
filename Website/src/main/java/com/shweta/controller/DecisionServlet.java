package com.shweta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shweta.dao.ItemDAO;
import com.shweta.model.Cart;
import com.shweta.model.CartItem;
import com.shweta.model.User;
@WebServlet("/Decision")
public class DecisionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		String update = request.getParameter("update");
		if(update!=null) {
			HttpSession session=request.getSession();
			Cart cart=(Cart)session.getAttribute("cart");
			Collection cartItems=cart.getCartItems();
			session.setAttribute("cartitem",  cartItems);
			Iterator it=cartItems.iterator();
			Vector v=new Vector();
			while(it.hasNext()) {
				CartItem cartItem=(CartItem)it.next();
				cartItem.getItem();
				cartItem.setQuantity(Integer.parseInt(request.getParameter("T"+cartItem.getCartItemId())));
				if(request.getParameter(cartItem.getCartItemId())!=null)
						v.addElement(cartItem.getCartItemId());
			}
			Enumeration en=v.elements();
			while(en.hasMoreElements()) {
				String cartItemId=(String)en.nextElement();
				CartItem cartItem =new CartItem (cartItemId,null,0);
				cart.removeCartItem(cartItem);
			}
			request.getRequestDispatcher("/DisplayCart.jsp").forward(request, response);
		}
		String shop=request.getParameter("shop");
		if(shop!=null) {
			request.getRequestDispatcher("/Fetch").forward(request, response);
			}
		String logout=request.getParameter("Logout");
		if(logout!=null) {
			request.getRequestDispatcher("/Logout").forward(request, response);
			}
		String freeze=request.getParameter("freeze");
		if(freeze !=null) {
			
			request.getRequestDispatcher("/Order").forward(request, response);
			}
		String Registration=request.getParameter("Registration");
		if(Registration!=null) {
			HttpSession session=request.getSession();
			String name=(String) session.getAttribute("User");
			session.getAttribute("Sirname");
			ItemDAO dao=new ItemDAO();
			try {
				User usrinfo = dao.getUser(name);
				session.setAttribute("UserInfo", usrinfo);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("/UserInformation.jsp").forward(request, response);
			} 
		}
		
	}


