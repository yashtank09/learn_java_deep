package ExceptionHandling;
import java.io.*;
import java.util.Scanner;

/* 
    In this program we are reading some value from file called "my.txt" in this directory, and learn how to terminate resourses if error will occurs
 */

public class ResourceWithFinally {
    static FileInputStream fi;
    static Scanner sc;

    static void meth1() throws Exception{
        // opening file using FileInputStream class's object and give a path referance of it
        fi = new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/ExceptionHandling/my.txt");
        try{
            // reading file content by giving a object referance to the Scanner object
            sc = new Scanner(fi);
            int a = sc.nextInt();
            // int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a/c); // if error occurs then closing statements which are given below will not execute so we need to handle with using try/finally
        } finally{ 
            fi.close();
            sc.close();
            // This finally block will execute definetly
            // So, we terminate the resources we are using
        }
        
    }
    
    public static void main(String[] args) throws Exception {
        try {
            meth1();    
        } catch (Exception e) {
            System.out.println(e);
        }
        // if in meth1 error will handdled by try/finally block then below code will raise an error
        int c = sc.nextInt(); 
        System.out.println(c); // if error occurs object of scanner will execute
    }
}
 