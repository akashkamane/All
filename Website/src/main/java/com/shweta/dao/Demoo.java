package com.shweta.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import com.shweta.model.Item;

public class Demoo {

	public static void main(String[] args) {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:orcl","system","SYSTEM"); 
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from ITEM");  
			Vector items=new Vector();
			while(rs.next()) { 
				
				Item item=new Item(); 
			 
				item.setName(rs.getString(2)); 
			 
			  items.addElement(item);
			  	
			  System.out.println("items");
			}
			
		}
			  catch(Exception e)
			{
				System.out.println(e);
			}  
	

	
	}
}
