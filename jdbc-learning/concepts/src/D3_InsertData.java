import java.sql.*;

import static java.lang.Class.forName;


public class D3_InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String pass  = "Harsh@$@2006";
        String query = "insert into employees values(103,'Harshit','Full stack Devloper',85000)";

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
                System.out.println("Insertion succefull" + rowafftected + "row(s) afftected");
            }else{
                System.out.println("Insertion Failed!");
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
