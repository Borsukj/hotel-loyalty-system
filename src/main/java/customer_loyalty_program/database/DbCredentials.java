package customer_loyalty_program.database;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Loads database connection settings from the local db.properties file.
 *
 * Credentials are read from configuration rather than hard-coded
 * into the Java source files.
 */
public class DbCredentials {

    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;

    static {
        Properties properties = new Properties();

        // Load the configuration once, when this class is first used.
        try (InputStream input = DbCredentials.class
                .getClassLoader()
                .getResourceAsStream("db.properties")) {

            // Stop with a clear message if the local configuration is missing.
            if (input == null) {
                throw new IllegalStateException(
                        "db.properties not found. Create it in src/main/resources "
                                + "using db.properties.example as a template."
                );
            }

            properties.load(input);

            URL = properties.getProperty("db.url");
            USER = properties.getProperty("db.user");
            PASSWORD = properties.getProperty("db.password");

        } catch (IOException e) {
            throw new IllegalStateException(
                    "Could not load database configuration.", e
            );
        }
    }

    /**
     * Returns the configured JDBC database URL.
     *
     * @return the database connection URL
     */
    public static String getUrl() {
        return URL;
    }

    /**
     * Returns the configured database username.
     *
     * @return the database username
     */
    public static String getUser() {
        return USER;
    }

    /**
     * Returns the configured database password.
     *
     * @return the database password, which may be empty for local development
     */
    public static String getPassword() {
        return PASSWORD;
    }
}
