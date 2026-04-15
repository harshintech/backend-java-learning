import java.sql.*;

import static java.lang.Class.forName;


public class D7_PreInsertion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String pass  = "MySql@2006";
        String query = "INSERT INTO employees VALUES(?, ?, ?, ?)";

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
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,"4");
            preparedStatement.setString(2,"Prabhat");
            preparedStatement.setString(3,"Ai Engineer");
            preparedStatement.setString(4,"90000");

            int rowAfftected = preparedStatement.executeUpdate();
            if(rowAfftected > 0){
                System.out.println("Data Inserted Successfully!!");
            }else{
                System.out.println("Data Insertion Failed!!");
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
