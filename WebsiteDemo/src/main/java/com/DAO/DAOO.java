package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOO  {
	public DAOO() {
		
	}
	Connection con;
	
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
	
	
	
	public String getAllItems() throws ClassNotFoundException,SQLException
	{
		String str = null;
		getConnection();	
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from ITEM");
	  
		
		
		  while(rs.next()) { str = rs.getString(2); }
		 
		
		rs.close();
		stmt.close();
		closeConnection();
		return str;
		
	
		
	}
	
public boolean check(String uname,String pass) throws SQLException
{
		
	
try {
	

getConnection();	

PreparedStatement ps=con.prepareStatement("select * from LOGIN where USERNAME=? and PASSWORD=?");  

ps.setString(1, uname);
ps.setString(2, pass);
ResultSet rs=ps.executeQuery();

if(rs.next()) {
	return true;
	
}

}
catch(Exception e) {
	e.printStackTrace();
}
return false;

}

	
	
	/*
	 * public static void main(String[] args) throws
	 * ClassNotFoundException,SQLException{
	 * 
	 * 
	 * DAOO a=new DAOO();
	 * 
	 * String str = a.getAllItems(); System.out.println(str);
	 * 
	 * }
	 */
	 

}
