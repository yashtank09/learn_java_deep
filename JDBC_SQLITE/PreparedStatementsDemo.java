package JDBC_SQLITE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/* 
 * preparedStatement example
 * 
 * DOC: https://docs.oracle.com/javase/7/docs/api/java/sql/PreparedStatement.html
 * Ref: https://www.javatpoint.com/PreparedStatement-interface
 */

public class PreparedStatementsDemo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            // Loading sqlite JDBC drivers
            Class.forName("org.sqlite.JDBC");

            // Establish connections using connection string
            Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");

            // creating prepared statement 
            PreparedStatement stm = con.prepareStatement("SELECT * FROM students WHERE deptno=?");

            
            System.out.print("Enter Department Number: ");
            
            int depno = sc.nextInt();
            // assiging user input to the placeholder in prepareStatement
            stm.setInt(1, depno);

            ResultSet rs = stm.executeQuery();

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
