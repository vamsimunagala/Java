// Write a java program to establish connection with database and insert values into the table 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercise13b {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "";
        
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String insertQuery = "INSERT INTO students(RegNO, Name, branch, year) VALUES (?, ?, ?, ?)";
            
            try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
                statement.setString(1, "21B91A1292");
                statement.setString(2, "Sai Kumar ");
                statement.setString(3, "IT");
                statement.setInt(4, 2);
                statement.executeUpdate();
                System.out.println("Values inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
