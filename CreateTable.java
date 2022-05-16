import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class table {
    public static void main(String args[]) throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/MOVIES";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
        System.out.println("Connection established......");
        Statement stmt = con.createStatement();
        String query = "CREATE TABLE Movies("
                + "ID INT NOT NULL, "
                + "Movie_name VARCHAR (40) NOT NULL, "
                + "Actor_name VARCHAR(80) NOT NULL, "
                + "Actress_naem VARCHAR(70) NOT NULL, "
                + "Director_name VARCHAR(20) NOT NULL, "
                + "Year_of_release NOT NULL, "
                + "PRIMARY KEY (ID))";
        stmt.execute(query);
        System.out.println("Table Created");
    }
}
