package com.example;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo {
	public static void main(String[] args)
	{  
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  

			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","SYSTEM"); 

			PreparedStatement ps=con.prepareStatement("insert into IMAGE values(?,?)");  
			ps.setString(1,"RAAm");  
			  
			FileInputStream fin=new FileInputStream("C:\\Users\\AKASH\\Pictures\\Screenshots\\A.png");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");   

			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from AKASH");  
			
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  

			con.close();  
			}
			catch(Exception e)
			{
				System.out.println(e);
			}  
	}  

}
