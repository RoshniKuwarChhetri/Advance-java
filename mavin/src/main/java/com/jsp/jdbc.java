package com.jsp;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;



public class jdbc {
public static void main(String[] args) {
	
	
	try {
		Class.forName("org.postgresql.Driver");
	
	String url="jdbc:postgresql://localhost:5433/third";
	String username="postgres";
	String password="root";
	
	
		Connection connection=DriverManager.getConnection(url,username,password);
		
		Statement statement=connection.createStatement();
		
		statement.execute("create table Family(id numeric primary key,name varchar, gender varchar); ");
		connection.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
