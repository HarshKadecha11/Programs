import java.sql.* ; 

class Mysql{
    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root"," ");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from stu");
            while(rs.next())
                System.out.println(rs.getInt("roll") + " " + rs.getString("name") + " " + rs.getString("city"));
        
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }


    }
}