package Emp;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
public static void main(String[] args) {
	try {
		//load driver
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5433/third";
		String username="postgres";
		String password="root";
		
		//connection
		Connection c =DriverManager.getConnection(url,username,password);
		
		//create statement
		Statement s =c.createStatement();
		//execute tatement
		s.execute("update emp set name='naresh' where id=101;");
		s.execute("update emp set name='raj' where id=102;");
		s.execute("update emp set name='samir' where id=103;");
		s.execute("update emp set name='garvit' where id=104;");
		s.execute("update emp set name='ganu' where id=105;");
		s.execute("update emp set name='nav' where id=106;");
		s.execute("update emp set name='nahid' where id=107;");
		s.execute("update emp set name='devi' where id=108;");
		s.execute("update emp set name='komolika' where id=109;");
		s.execute("update emp set name='nishu' where id=110;");
		s.execute("update emp set name='rani' where id=111;");
		s.execute("update emp set name='mohini' where id=112;");
		s.execute("update emp set name='manku' where id=113;");
		s.execute("update emp set name='raja' where id=114;");
		s.execute("update emp set name='nasib' where id=115;");
		
		//close connection
		c.close();
		
	}
	
	catch(SQLException e) {
	  e.printStackTrace();
	
} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
