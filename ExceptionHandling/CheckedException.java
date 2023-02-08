package ExceptionHandling;
import java.io.*;
/* 
    Checked and Unchecked exception:
    https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/
 */
public class CheckedException {
    static void func1(){
        try (FileInputStream it = new FileInputStream("My.txt")) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void func2(){
        func1();
    }
    static void func3(){
        func2();
    }
    public static void main(String[] args) {
        func3();        
    }
}
