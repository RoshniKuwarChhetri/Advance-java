package Teacher;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
public static void main(String[] args) {
	
	
		try {
			//load drive
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5433/third";
			String username ="postgres";
			String password ="root";
			
			//extablish connection
		Connection c=DriverManager.getConnection(url,username,password);
			
		//create statement
		Statement s=c.createStatement();
		//execute statemebnt
		s.execute("create table teacher(id numeric primary key,name varchar);");
		
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



