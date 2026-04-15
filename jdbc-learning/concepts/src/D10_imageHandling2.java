import java.io.*;
import java.sql.*;

import static java.lang.Class.forName;

//how to put image in file explorer from java
public class D10_imageHandling2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String pass  = "MySql@2006";
        String folder_path = "C:\\Users\\Wallpaper\\";
        String query = "SELECT image_data from image_table where image_id = (?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

        try {
            Connection con = DriverManager.getConnection(url,username,pass);
            System.out.println("Connection Establish successfully");
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1,1);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){

                byte[] image_data = resultSet.getBytes("image_data");
                String image_path = folder_path + "extractedfromjava.jpg";
                OutputStream outputStream = new FileOutputStream(image_path);
                outputStream.write(image_data);

            }else{
                System.out.println("Image not found");
            }



            con.close();
            System.out.println();
            System.out.println("Connection close successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
