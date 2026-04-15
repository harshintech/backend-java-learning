import java.sql.*;

import static java.lang.Class.forName;


public class D11_TransactionHandling{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String pass  = "MySql@2006";
        String withdrawQuery = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
        String depositQuery ="UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

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

            try {
                PreparedStatement withdrawStatement = con.prepareStatement(withdrawQuery);
                PreparedStatement depositStatement = con.prepareStatement(depositQuery);
                withdrawStatement.setDouble(1, 500.00);
                withdrawStatement.setString(2, "account456");
                depositStatement.setDouble(1, 500.00);
                depositStatement.setString(2, "account123");

                int rowAfftectedWithdraw = withdrawStatement.executeUpdate();
                int rowAfftectedDepoit = depositStatement.executeUpdate();

                if(rowAfftectedDepoit>0 && rowAfftectedDepoit>0){
                    con.commit();
                    System.out.println("Transaction successful!");
                }else{
                    con.rollback();
                    System.out.println("Transaction failed!");
                }

            }catch (SQLException e){
                System.out.println(e.getMessage());

            }
            System.out.println();
            System.out.println("Connection close successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
