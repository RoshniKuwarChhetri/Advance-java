package Trainee;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Insert {
	public static void main(String[] args) {
		try {
		Class.forName("org.postgresql.Driver");
		
		String url="jdbc:postgresql://localhost:5433/third";
		String username="postgres";
		String password="root";
		
		//connection
		Connection c=DriverManager.getConnection(url,username,password);
		//create statement
		Statement s=c.createStatement();
		//execute statement
		s.execute("insert into trainee values(101,'raj') ,(102,'rani'),(103,'mohan'),(104,'mohini'),(105,'simran'),(106,'ram') ,(107,'mohit'),(108,'dolli'),(109,'raja'),(110,'rohit') ,(111,'rakesh'),(112,'manisha'),(113,'pooja'),(114,'paro'),(115,'basanti');");
		
		// close connection
		c.close();
		}
		
		
		
		
		
		catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
