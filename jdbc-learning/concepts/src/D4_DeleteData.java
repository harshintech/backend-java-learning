import java.sql.*;

import static java.lang.Class.forName;


public class D4_DeleteData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String pass  = "Harsh@$@2006";
        String query = "DELETE FROM employees where id = 103";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

        try {
            Connection con = DriverManager.getConnection(url,username,pass);
            System.out.println("Connection Establish successfully");
            Statement stmt = con.createStatement();
            int rowafftected = stmt.executeUpdate(query);

            if(rowafftected > 0){
                System.out.println("Deletion succefull ! " + rowafftected + "...row(s) afftected");
            }else{
                System.out.println("Deletion Failed!");
            }

            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection close successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
