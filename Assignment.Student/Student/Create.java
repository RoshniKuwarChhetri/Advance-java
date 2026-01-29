package Student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Create {
public static void main(String[] args) {
	
	
		try {
			//load drive
//			Class.forName("org.postgresql.Driver");
//			
//			String url="jdbc:postgresql://localhost:5433/third";
//			String username ="postgres";
//			String password ="root";
			FileInputStream f= new FileInputStream("app.properties");
			Properties p=new Properties();
			p.load(f);
			Class.forName(p.getProperty("Driver"));
			String url=(p.getProperty("url"));
			String password=(p.getProperty("password"));
			String username=(p.getProperty("username"));
			
			//extablish connection
		Connection c=DriverManager.getConnection(url,username,password);
			
		//create statement
		Statement s=c.createStatement();
		//execute statemebnt
		s.execute("Create table Student(id numeric primary key,name varchar, gender varchar, blood_group varchar,reg_date date);");
		
		//close
		c.close();
			
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}
}




