import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class D1_Main {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "Harsh@$@2006";

        try(Connection connection = DriverManager.getConnection(url,username,password)){
            System.out.println("Connected to the database");
            System.out.println(connection);
        }
        catch (SQLException e){
            System.err.println("Connection failde" + e.getMessage());
        }
    }
}