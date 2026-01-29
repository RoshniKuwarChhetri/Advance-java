package Trainee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First {
	public static void main(String[] args) {
		//jdbc 5 steps
		//1.load driver
		
		try {
			Class.forName("org.postgresql.Driver");
		//create connection server and java
			//location-url
			//username
			//password
			//protocol://server:port/endpoint
			//jdbc:database://localhost:5433/dbname
		
		String url="jdbc:postgresql://localhost:5433/first";
		String user="postgres";//root
	    String password="root";
	    
	    
	    //2.next step create connection
	   Connection connection= DriverManager.getConnection(url,user,password);
	   System.out.println(connection);
	   //3.creating statements
	   Statement statement=connection.createStatement();
	   
	   //4.execute statement and process result
	   
	   statement.execute("create table second(a numeric primary key, b varchar);");
	   
	   //5.close the  connection
	   connection.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
        
		catch(SQLException e) {
			e.printStackTrace();
		}
	}  

}
