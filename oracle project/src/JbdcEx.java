import java.sql.*;
 
public class JbdcEx {

    public static void main(String[] args) {
        Connection conn;
        try
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","virat","admin");
        System.out.println("connection established");
        }
        catch(SQLException | ClassNotFoundException ex)
        {
            System.out.println(ex);
        }


    }
 
}