package customer_loyalty_program;

import customer_loyalty_program.database.DbConnector;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = DbConnector.getConnection()) {
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
