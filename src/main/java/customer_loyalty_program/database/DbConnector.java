package customer_loyalty_program.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DbCredentials.URL,
                DbCredentials.USER,
                DbCredentials.PASSWORD
        );
    }
}
