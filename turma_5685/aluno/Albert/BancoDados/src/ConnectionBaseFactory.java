import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionBaseFactory {

	public Connection getConnection() {
        try {
            return DriverManager.getConnection(
          "jdbc:mysql://localhost/alunotreinar", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
