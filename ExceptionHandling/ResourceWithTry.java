package ExceptionHandling;
import java.io.*;
import java.util.Scanner;

/* 
    In this program we are using resources with try block
    try block resources are terminated automatically
 */

public class ResourceWithTry {

    static void meth1() throws Exception{

        // giving resources as parameter to try which will close/terminate automatically
        // creating object of FileInputStream and Scanner as try block parameter. The usage of resources is limited to the try block it self.
        try(FileInputStream fi = new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/ExceptionHandling/my.txt");Scanner sc = new Scanner(fi)){
            // reading file content by giving a object referance to the Scanner object
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a/c); // if error occurs then closing statements which are given below will not execute so we need to handle with using try/finally
        }
        
    }
    
    public static void main(String[] args) throws Exception {
        try {
            meth1();    
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        // if in meth1 error will handdled by try/finally block then below code will raise an error
        // int c = sc.nextInt(); 
        // System.out.println(c); // if error occurs object of scanner will execute
    }
}
