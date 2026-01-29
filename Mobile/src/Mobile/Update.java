package Mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Update {
	//load driver
	public static void main(String[] args) {
		
	try {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5433/third";
		String username="postgres";
		String password="root";
		
		Connection c=DriverManager.getConnection(url,username,password);
		
		Statement s=c.createStatement();
		
		s.execute("update Car set bname='nano';");
		
		c.close();
	}
	
    catch(ClassNotFoundException e) {
    	e.printStackTrace();
    }
	
	catch(SQLException e) {
		e.printStackTrace();
}
}
}
