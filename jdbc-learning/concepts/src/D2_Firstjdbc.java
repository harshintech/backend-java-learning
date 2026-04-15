import java.sql.*;

import static java.lang.Class.forName;


public class D2_Firstjdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String pass  = "Harsh@$@2006";
        String query = "Select * from employees;";

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
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");
                System.out.println("===============================");
                System.out.println("ID: " + id);
                System.out.println("NAME: " + name);
                System.out.println("JOB TITLE: " + job_title);
                System.out.println("SALARY :" + salary);
            }

            rs.close();
            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection close successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
