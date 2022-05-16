import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class insert {
    public static void main(String args[]) throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/MOVIES";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
        System.out.println("Connection established");
        Statement stmt = con.createStatement();
        String query = "INSERT INTO MOVIES(" + "ID, Movie_name, Actor_name, Actress_name, Director_name,Year_of_release) VALUES "
                + "(4000, 'Avataar',' Manley','Scarlette Johnson','Christopher Nolan','2009/09/21  '), "
                + "(5000, ' Batman','Ash Pheonix', 'April Juile', 'Jesus Son','2018/01/10'), "
                + "(6000, 'Spiderman Home Coming'  ,'Tom Holland', 'Zendaya', 'John Watts','2021/12/14'), "
                + "(7000, 'Joker','Joaquin', 'Zazie ', 'Todd Phillips','2019/08/02') ";

        int i = stmt.executeUpdate(query);
        System.out.println("Data Inserted: "+i);
    }
}