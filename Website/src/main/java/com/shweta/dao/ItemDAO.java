package com.shweta.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import com.shweta.model.CartItem;
import com.shweta.model.Item;
import com.shweta.model.User;



public class ItemDAO {
	Connection con;
	public ItemDAO() {
		
	}

	
	public Connection getConnection() throws ClassNotFoundException,SQLException
	{  
		
			Class.forName("oracle.jdbc.driver.OracleDriver");  

			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","SYSTEM"); 
			return con;
			}
	public void closeConnection() throws SQLException
	{
		con.close();
	}

	
	  public Vector getAllItems() throws ClassNotFoundException,SQLException {
	  Vector items=new Vector();
	  getConnection();
	  Statement stmt=con.createStatement();
	  
	  
	  ResultSet rs=stmt.executeQuery("select * from ITEM");
	  
	  
	  while(rs.next()) { Item item=new Item();
	  
	  
	  item.setId(rs.getInt(1)); 
	  item.setName(rs.getString(2));
	  item.setImagepath(rs.getString(3)); 
	  item.setDescription(rs.getString(4));
	  item.setPrice(rs.getDouble(5)); 
	  items.addElement(item); 
	  } rs.close();
	  stmt.close(); closeConnection(); return items;
	  
	  }
	  
	  public Item getItem(final int itemId) throws
	  ClassNotFoundException,SQLException 
	  { 
		  Item item=new Item();
		  getConnection();
	  Statement stmt=con.createStatement(); 
	  ResultSet rs=stmt.executeQuery("select * from ITEM where ITEMID="+itemId);
	  
	  
	  if(rs.next()) {
	  
	  item.setId(rs.getInt(1)); 
	  item.setName(rs.getString(2));
	  item.setImagepath(rs.getString(3));
	  item.setDescription(rs.getString(4));
	  item.setPrice(rs.getDouble(5));
	  
	  
	  } rs.close(); stmt.close(); closeConnection(); return item;
	  
	  }
	  
	  public int getItemCount() throws ClassNotFoundException,SQLException {
	  
	  getConnection(); Statement stmt=con.createStatement(); ResultSet
	  rs=stmt.executeQuery("select count(*) from ITEM");
	  
	  rs.next(); int itemCount=rs.getInt(1); rs.close(); stmt.close();
	  closeConnection(); return itemCount;
	  
	  }
	  
	  public boolean check(String uname,String pass) throws SQLException {
	  
	  
	  try {
	  
	  
	  getConnection();
	  
	  PreparedStatement
	  ps=con.prepareStatement("select * from LOGIN where USERNAME=? and PASSWORD=?"
	  );
	  
	  ps.setString(1, uname); ps.setString(2, pass); ResultSet
	  rs=ps.executeQuery();
	  
	  if(rs.next()) { return true;
	  
	  }
	  
	  } catch(Exception e) { e.printStackTrace(); } return false;
	  
	  }
	 	  public User getUser(final String name) throws
	  ClassNotFoundException,SQLException { 
		  User user=new User();
		  getConnection();
		  
		  PreparedStatement ps=con.prepareStatement("select * from AKASH where NAME=?");  

		  ps.setString(1, name);
		  
		  ResultSet rs=ps.executeQuery();
		  
		
		  while(rs.next()) {
		  
		   
		  user.setName(rs.getString(1));
		  user.setSirname(rs.getString(2)); 
		  user.setUserName(rs.getString(3));
		  user.setAddress(rs.getString(4));
		  
		  
		  }
		 rs.close(); ps.close(); closeConnection(); return user;
	  
	 }
	  public static void main(String args[]) throws ClassNotFoundException, SQLException {
		  
		  ItemDAO dao=new ItemDAO();
		  
		  
		  
		  User user1=dao.getUser("AKASH");
		  System.out.println(user1);
		 
		}


	public void setUser(String name,String sirname,String username,String address) throws ClassNotFoundException, SQLException {
		getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into AKASH values(?,?,?,?)");  
		ps.setString(1,name);
		ps.setString(2,sirname);
		ps.setString(3,username);
		ps.setString(4,address);
		ps.executeUpdate();
		ps.close();
		closeConnection();
	}
	public void setPassword(String username,String password) throws ClassNotFoundException, SQLException {
		getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into LOGIN values(?,?)");  
		ps.setString(1,username);
		ps.setString(2,password);
		ps.executeUpdate();
		ps.close();
		closeConnection();
	}


	public void setOrder(String name,String ItemName,int quantity) throws ClassNotFoundException, SQLException {
		
		getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into ITEMORDER values(?,?,?)");  
		ps.setString(1,name);
		ps.setString(2,ItemName);
		ps.setInt(3,quantity);
		ps.executeUpdate();
		ps.close();
		closeConnection();
		
	}
	
	public Vector getOrder() {
		Vector vector =new Vector();
		
		CartItem cartitem=new CartItem(null, null, 0);
		
		
		return vector;
		
	}
	
	 
	}  
	




