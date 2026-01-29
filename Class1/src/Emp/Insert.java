package Emp;

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
		s.execute("insert into emp values(101,'raj') ,(102,'rohit'),(103,'momu'),(104,'monu'),(105,'simmi'),(106,'jain') ,(107,'jon'),(108,'dolli'),(109,'joni'),(110,'rohit') ,(111,'janardan'),(112,'manisha'),(113,'neha'),(114,'nil'),(115,'geet');");
		
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


