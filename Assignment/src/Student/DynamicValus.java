package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.SQLException;

public class DynamicValus {
	//load driver
	public static void main(String[] args) {
		
	try {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5433/third";
		String username="postgres";
		String password="root";
		
		Connection c=DriverManager.getConnection(url,username,password);
		
		//changee in third step
		PreparedStatement statement=c.prepareStatement("insert into Student values(?,?);");
		int x=12;
		for(int i=0;i<5;i++) {
			
			
			statement.setInt(1, x++);
			statement.setString(2, "d");
			statement.executeUpdate();
		}	
		
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