package Car;

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
	    
	    s.addBatch("insert into car values(101,'BMW','Black','xxx','02-12-2025');");
	    s.addBatch("insert into car values(102,'namo','Blue','xyx','01-12-2025');");
	    s.addBatch("insert into car values(103,'MG','pink','xx','02-11-2025');");
	    
	    //execute statement
	    s.executeBatch();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}

