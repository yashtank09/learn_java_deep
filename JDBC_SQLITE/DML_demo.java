package JDBC_SQLITE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DML_demo {
    public static void main(String[] args) throws Exception {
            
        Class.forName("org.sqlite.JDBC");

        // Establish connections using connection string
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");

        // creating statement 
        Statement stm = con.createStatement();

        // DMLs

        // INSERT
        stm.executeQuery("INSERT OR IGNORE dept VALUES(60, 'CHEM');");
        
        // DELETE
        stm.executeQuery("DELETE FROM dept WHERE deptno >= 60;");

        // UPDATE
        stm.executeQuery("UPDATE dept SET dname='Chem' WHERE deptno=50;");

        
        // USING preparedStatement
        PreparedStatement ptm = con.prepareStatement("INSERT OR IGNORE students VALUES(?, ?, ?, ?);");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Student data: ");
            int r = sc.nextInt();
            String name = sc.next();
            String city = sc.next();
            int dept = sc.nextInt();

            ptm.setInt(1, r);
            ptm.setString(2, name);
            ptm.setString(3, city);
            ptm.setInt(4, dept);
        }

        ptm.close();

    }
}
