package customer_loyalty_program.database;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbCredentials {

    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;

    static {
        Properties properties = new Properties();

        try (InputStream input = DbCredentials.class
                .getClassLoader()
                .getResourceAsStream("db.properties")) {

            if (input == null) {
                throw new IllegalStateException(
                        "db.properties not found. Copy db.properties.example to db.properties."
                );
            }

            properties.load(input);

            URL = properties.getProperty("db.url");
            USER = properties.getProperty("db.user");
            PASSWORD = properties.getProperty("db.password");

        } catch (IOException e) {
            throw new IllegalStateException("Could not load db.properties", e);
        }
    }

    public static String getUrl() {
        return URL;
    }

    public static String getUser() {
        return USER;
    }

    public static String getPassword() {
        return PASSWORD;
    }
}
