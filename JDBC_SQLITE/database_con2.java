package JDBC_SQLITE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 
 * Database connection objects explaination
 */
public class database_con2 {
    public static void main(String[] args) {
        try {
            // Loading/Invoking sqlite JDBC drivers
            Class.forName("org.sqlite.JDBC");

            // Establish connections using connection string
            Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ"); // SQLite Connection String with database path
            // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "toor"); // MySQL connection String

            // Interface creating statement
            Statement stm = con.createStatement();

            // ResultSet for store data
            ResultSet rs = stm.executeQuery("SELECT * FROM students");

            while(rs.next()){
                System.out.print(rs.getInt(0)+ " ");
                System.out.print(rs.getString(1)+ " ");
                System.out.print(rs.getString(2)+ " ");
                System.out.println(rs.getInt("deptno")+ " ");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            System.out.println(e);
        }

    }
}
