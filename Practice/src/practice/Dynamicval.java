package practice;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Dynamicval {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5433/third";
			String username="postgres";
			String password="root";
			
			Connection connection=DriverManager.getConnection(url,username,password);
			
			PreparedStatement preparestatement=connection.prepareStatement("insert into trainee values(?,?);");
	        
		
			int x=2;
			for(int i=0;i<5;i++) {
				preparestatement.setInt(1,x++);
				
				
				preparestatement.setString(2,"rose");
				preparestatement.executeUpdate();
				
			}
			connection.close();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
