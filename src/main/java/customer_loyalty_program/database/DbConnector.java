package customer_loyalty_program.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Creates JDBC connections using the configured database credentials.
 */
public class DbConnector {

    /**
     * Opens a new database connection.
     *
     * The caller must close the returned connection, preferably
     * using a try-with-resources statement.
     *
     * @return a new database connection
     * @throws SQLException if the connection cannot be established
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DbCredentials.getUrl(),
                DbCredentials.getUser(),
                DbCredentials.getPassword()
        );
    }
}
