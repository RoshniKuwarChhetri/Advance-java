package Teacher;



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
		s.execute("insert into teacher values(101,'ram') ,(102,'raj'),(103,'momu'),(104,'minku'),(105,'simmi'),(106,'ram') ,(107,'shalu'),(108,'dolli'),(109,'rani'),(110,'rohit') ,(111,'rohan'),(112,'manisha'),(113,'neha'),(114,'nandani'),(115,'geet');");
		
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

