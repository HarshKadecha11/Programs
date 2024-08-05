import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {
    public static void main(String[] args) throws Exception {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");

            // Create a statement
            Statement stmt = con.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Harsh");

            // Process the result set
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            // Close the connection
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}