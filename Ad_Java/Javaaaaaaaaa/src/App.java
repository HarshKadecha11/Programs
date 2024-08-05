import java.sql.*;

public class App {
      public static void main(String[] args)  {
      
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from harsh");
            
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t|" + rs.getString(2) + "\t|" + rs.getString(3));
            }
            con.close();
            }catch(Exception e){
                System.out.println(e);
            }
      

    }
}
