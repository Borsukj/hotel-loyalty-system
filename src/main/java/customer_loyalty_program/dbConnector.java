package customer_loyalty_program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnector {
    static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connected to database successfully");
            connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
