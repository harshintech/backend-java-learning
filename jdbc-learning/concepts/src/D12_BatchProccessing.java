import java.sql.*;
import java.util.Scanner;

import static java.lang.Class.forName;


public class D12_BatchProccessing{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String pass  = "MySql@2006";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

        try {
            Connection con = DriverManager.getConnection(url,username,pass);
            System.out.println("Connection Establish successfully");
            con.setAutoCommit(false);
            /*
            Statement statement = con.createStatement();
            statement.addBatch("INSERT INTO employees(id,name,job_title,salary) VALUES(6,'vashu','HR Manager',65000.00)");
            statement.addBatch("INSERT INTO employees(id,name,job_title,salary) VALUES(7,'karan','Cyber Security Analyst',62000.00)");
            statement.addBatch("INSERT INTO employees(id,name,job_title,salary) VALUES(8,'vipul','DevOps Engineer',67000.00)");
            int[] batchResult = statement.executeBatch();
            con.commit();
            System.out.println("Batch Executed successfully!!");

             */

            String query = "INSERT INTO employees(id,name,job_title,salary) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("Id : ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Name : ");
                String name = scanner.nextLine();
                System.out.println("Job Title : ");
                String job_title = scanner.nextLine();
                System.out.println("Salary : ");
                double salary = scanner.nextDouble();
                preparedStatement.setInt(1,id);
                preparedStatement.setString(2,name);
                preparedStatement.setString(3,job_title);
                preparedStatement.setDouble(4,salary);
                preparedStatement.addBatch();
                System.out.println("Add more values Y/N: ");
                String decision = scanner.next();
                if(decision.toUpperCase().equals("N")){
                    break;
                }

            }
            int[] batchResult = preparedStatement.executeBatch();
            con.commit();
            System.out.println("Batch execute successfully");




            System.out.println();
            System.out.println("Connection close successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
