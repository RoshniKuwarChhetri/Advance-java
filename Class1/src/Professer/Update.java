package Professer;


import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
public static void main(String[] args) {
	try {
		//load driver
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5433/third";
		String username="postgres";
		String password="root";
		
		//connection
		Connection c =DriverManager.getConnection(url,username,password);
		
		//create statement
		Statement s =c.createStatement();
		//execute tatement
		s.execute("update professer set name='roshni' where id=101;");
		s.execute("update professer set name='karan' where id=102;");
		s.execute("update professer set name='gaurav' where id=103;");
		s.execute("update professer set name='garima' where id=104;");
		s.execute("update professer set name='gauri' where id=105;");
		s.execute("update professer set name='navina' where id=106;");
		s.execute("update professer set name='nisha' where id=107;");
		s.execute("update professer set name='harshit' where id=108;");
		s.execute("update professer set name='komal' where id=109;");
		s.execute("update professer set name='nishu' where id=110;");
		s.execute("update professer set name='neelam' where id=111;");
		s.execute("update professer set name='rohit' where id=112;");
		s.execute("update professer set name='samir' where id=113;");
		s.execute("update professer set name='raj' where id=114;");
		s.execute("update professer set name='naresh' where id=115;");
		
		//close connection
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

