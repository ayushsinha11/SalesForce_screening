import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class fetch {
    public static void main(String args[]) throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        String mysqlUrl = "jdbc:mysql://localhost/MOVIES";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
        System.out.println("Connection established......");
        Statement stmt = con.createStatement();
        String query = "Select * from Movies";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("MOVIE table:");
        while(rs.next()) {
            //Attributes
            System.out.print("ID: "+rs.getInt("ID")+", ");
            System.out.print("Movie Name: "+rs.getString("Movie_name")+", ");
            System.out.print("Actor Name: "+rs.getString("Actor_name")+", ");
            System.out.print("Actress Name: "+rs.getString("Actress_name")+", ");
            System.out.print("Director Name: "+rs.getString("Director_name")+", ");
            System.out.print("Year of release: "+rs.getDate("Year_of_release"));
            System.out.println();
        }
        System.out.println(" ");
        String sql = "Select * from Movies where MOVIENAME = 'Spiderman No Way Home' ";
        rs = stmt.executeQuery(sql);
        while(rs.next()) {
            System.out.print("ID: "+rs.getInt("ID")+", ");
            System.out.print("Movie Name: "+rs.getString("Movie_name")+", ");
            System.out.print("Actor Name: "+rs.getString("Actor_name")+", ");
            System.out.print("Actress Name: "+rs.getString("Actress_name")+", ");
            System.out.print("Director Name: "+rs.getString("Director_name")+", ");
            System.out.print("Year of Release: "+rs.getDate("Year_of_release"));
            System.out.println();
        }
    }
}
