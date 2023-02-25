package JDBC_SQLITE;
import java.sql.*;

/**
 * First JDBC(Java Database Connection) program.
 * Database Connection with SQLite using SQLite connection drivers
 * 
 * Ref: https://www.geeksforgeeks.org/introduction-to-jdbc/
 */
class database_con1 {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite\\univ.db");

        Statement stm = con.createStatement();
        
        ResultSet rs = stm.executeQuery("SELECT * FROM student");

        int dno;
        String dname;
        while (rs.next()) {
            dno = rs.getInt("deptno");
            dname = rs.getString("dname");
            System.out.println(dno+" "+dname);
        }
    }
}