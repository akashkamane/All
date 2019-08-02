package com.shweta.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import com.shweta.model.Item;

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
			public Connection getAllItems() throws ClassNotFoundException,SQLException
			{
			Vector<Item> items=new Vector<Item>();
			getConnection();	
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from IMAGE");  
			
			while(rs.next()) 
			{
				Item item=new Item();
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setImagepath(rs.getString(3));
				item.setDescription(rs.getString(4));
				item.setPrice(rs.getDouble(5));
				items.addElement(item);
				
			}				
			rs.close(); 
			stmt.close();
			closeConnection();
			return (Connection) items;
	
			}
			public Item getItem(final int itemId) throws ClassNotFoundException,SQLException
			{
			Item item=new Item();
			getConnection();	
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Items where itemID="+itemId);
			
			
			if(rs.next()) 
			{
				
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setImagepath(rs.getString(3));
				item.setDescription(rs.getString(4));
				item.setPrice(rs.getDouble(5));
				
				
			}				
			rs.close(); 
			stmt.close();
			closeConnection();
			return item;
	
			}
			
			public int getItemCount() throws ClassNotFoundException,SQLException
			{
			
			getConnection();	
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select count(*) from ITEM");  
			
			rs.next();
			int itemCount=rs.getInt(1);
			rs.close(); 
			stmt.close();
			closeConnection();
			return itemCount;
	
			}
	}  




