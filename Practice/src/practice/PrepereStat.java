package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepereStat {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5433/third";
			String username="postgres";
			String password="root";
			
		
		
		Connection connection=DriverManager.getConnection(url,username,password);
		 
		PreparedStatement preparestatement = connection.prepareStatement("insert into Student values(?,?);");
		preparestatement.setInt(1, 101);
		preparestatement.setString(2,"roshni");
		
		preparestatement.executeUpdate();
		
		
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
