import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;

import static java.lang.Class.forName;

//how to transfer image from fileExplore to java and insert in database table
public class D9_ImageHandling {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String pass  = "MySql@2006";
        String image_path = "C:\\Users\\Wallpaper\\clay-banks-u27Rrbs9Dwc-unsplash.jpg";
        String query = "INSERT INTO image_table(image_data) VALUES(?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

        try {
            Connection con = DriverManager.getConnection(url,username,pass);
            System.out.println("Connection Establish successfully");
            FileInputStream fileInputStream = new FileInputStream(image_path);
            byte[] imageData = new byte[fileInputStream.available()]; //fileInputStream.available() is size;
            fileInputStream.read(imageData);
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setBytes(1,imageData);
            int rowaffected = preparedStatement.executeUpdate();

            if(rowaffected > 0){
                System.out.println("Image Inserted Successfully!!");
            }
            else{
                System.out.println("Image Not Inserted!!");
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
