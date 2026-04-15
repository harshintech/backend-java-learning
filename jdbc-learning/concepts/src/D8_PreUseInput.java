import java.sql.*;
import java.util.Scanner;

import static java.lang.Class.forName;


public class D8_PreUseInput {
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
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            String job_title = scanner.nextLine();
            Double salary = scanner.nextDouble();

            //Statement stmt = con.createStatement();
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,job_title);
            preparedStatement.setDouble(4,salary);

            int rowAfftected = preparedStatement.executeUpdate();
            if(rowAfftected > 0){
                System.out.println("Data Inserted Successfully!!");
            }else{
                System.out.println("Data Insertion Failed!!");
            }



            con.close();
            System.out.println();
            System.out.println("Connection close successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
