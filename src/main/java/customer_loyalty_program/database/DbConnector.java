package customer_loyalty_program.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector extends DbCredentials {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
