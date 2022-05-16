
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class database {
    public static void main(String... args) throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
        System.out.println("Connection established......");
        Statement stmt = con.createStatement();
        String query = "CREATE database MOVIES";
        stmt.execute(query);
        System.out.println("Database created");
    }
}