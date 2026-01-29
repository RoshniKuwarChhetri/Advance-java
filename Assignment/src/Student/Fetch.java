package Student;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
public class Fetch {
	
	
	public class Featch1 {
	    public static void main(String[] args) {
			try {
				Class.forName("org.postgresql.Driver");
				
				String url="jdbc:postgresql://localhost:5433/third";
				String username="postgres";
				String password="root";
				Connection c=DriverManager.getConnection(url,username,password);
				
				Statement s=c.createStatement();
				
				ResultSet resuttSet=s.executeQuery("select * from student");
				while(resuttSet.next()) {
					System.out.println(resuttSet.getInt(1));
					System.out.println(resuttSet.getString("name"));
					
				}
				
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
