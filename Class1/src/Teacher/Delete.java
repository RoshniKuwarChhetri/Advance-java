package Teacher;



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
	
	//create statement
	
	//Statement s=createStatement();
	Statement s = c.createStatement();
	
	//execute statement
	s.execute("delete from teacher where id=101 ;");
	s.execute("delete from teacher where id=102 ;");
	s.execute("delete from teacher where id=103 ;");
	s.execute("delete from teacher where id=104 ;");
	s.execute("delete from teacher where id=105 ;");
	s.execute("delete from teacher where id=106 ;");
	s.execute("delete from teacher where id=107 ;");
	s.execute("delete from teacher where id=108 ;");
	s.execute("delete from teacher where id=109 ;");
	s.execute("delete from teacher where id=110 ;");
	s.execute("delete from teacher where id=111 ;");
	s.execute("delete from teacher where id=112 ;");
	s.execute("delete from teacher where id=113 ;");
	s.execute("delete from teacher where id=114 ;");
	s.execute("delete from teacher where id=115 ;");
	
	//close connection
	c.close();
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}

}

	private static Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}
}
