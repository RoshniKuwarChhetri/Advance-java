package Mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Create {
    public static void main(String[] args) {

        // whats the error

        try {
            // load driver
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5433/third";
            String username = "postgres";
            String password = "root";

            // establish connection
            Connection c = DriverManager.getConnection(url, username, password);

            // create statement
            Statement s = c.createStatement();

            // execute statement
            s.execute("CREATE TABLE Mobile(id NUMERIC PRIMARY KEY, bname VARCHAR, colour VARCHAR, model VARCHAR, manufac_date DATE)");

            // close connection
            c.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
