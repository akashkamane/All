package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import model.Item;

public class DAO {
	
	Connection con;
	public DAO() {
		
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
	
public Vector getAllItems() throws ClassNotFoundException,SQLException
	{
	Vector items=new Vector();
	getConnection();	
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from ITEMS");
  
  while(rs.next()) 
  { 
  Item item=new Item(); 
  item.setId(rs.getInt(1));
  item.setName(rs.getString(2)); 

  items.addElement(item);
  }
  
    rs.close();	
	stmt.close();
	closeConnection();
	return items;
	

	}
}

	




	
	










	/*
	 * public static void main(String args[]) throws ClassNotFoundException,
	 * SQLException {
	 * 
	 * DAO dao= new DAO(); dao.getAllItems();
	 * 
	 * System.out.println(dao.getAllItems());
	 * 
	 * }
	 */



