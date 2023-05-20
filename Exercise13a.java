// Write a Java program to establish connection with database and Retrieve values form a table  

import java.sql.*;


public class Exercise13a {
    public static void main(String [] args){
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from students");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getInt(4));
            }

            connection.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}

