package Program;


	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
	import java.sql.Statement;

	public class DynamicValue {
		
	public static void main(String[] args) {		
		
			try {
				//load drive
				Class.forName("org.postgresql.Driver");
				
				String url="jdbc:postgresql://localhost:5433/third";
				String username ="postgres";
				String password ="root";
				
				//extablish connection
			Connection c=DriverManager.getConnection(url,username,password);
				
			//change in third step
			PreparedStatement statement=c.prepareStatement("insert into Student values(?,?);");
			int x=15;
			for(int i=0;i<5;i++) {
				statement.setInt(1, x++);
				statement.setString(1, "d");
				statement.executeUpdate();
			}	
			
			
			//change in 4th step
			
			//close
			c.close();
				
			} catch (ClassNotFoundException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}


	}
	}






}
