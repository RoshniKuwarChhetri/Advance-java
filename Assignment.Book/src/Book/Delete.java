package Book;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5433/third";
			String username="postgres";
			String password="root";
			
			Connection c=DriverManager.getConnection(url,username,password);
			
			Statement s=c.createStatement();
			s.execute(("delete from Book where id=11;"));
			
		} catch (ClassNotFoundException e) {
			
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
