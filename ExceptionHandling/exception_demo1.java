package ExceptionHandling;

import java.util.Scanner;

/*
    Java try block is used to enclose the code that might throw an exception. It must be used within the method.
    If an exception occurs at the particular statement in the try block, the rest of the block code will not execute.
    So, it is recommended not to keep the code in try block that will not throw an exception.
 */
public class exception_demo1 {

    public static void main(String[] args) {
        int a, b, c;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        // try and catch blocks are like conditional statemetns that handle the exception
        try{
            c = a/b;
            System.out.println(c);
        }
        // catch block will handle the exception by it's type.
        catch(ArithmeticException e){
            
            // we can share the output message for the exception which is raised by the program
            System.out.println("Denometer should not be 0, try again."+e);
        }
        // the expected statements will be printed by the java interpreter
        System.out.println("Bye");
    }
}