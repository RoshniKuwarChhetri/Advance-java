package Mobile;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Insert {
	public static void main(String[] args) {
		//load driver
		try {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5433/third";
	    String username="postgres";
	    String password="root";
	    
	    //create connection
	    Connection c=DriverManager.getConnection(url,username,password);
	    
	    //create statement
	    Statement s=c.createStatement();
	    
	    //execute statement
	    s.execute("insert into Mobile values(111,'BMW','blue','xxx','2025-09-24')");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}


