package OOPS;
/* 
 * This is a class and object example with different parameter
 * 
 * Here are two types of constructors are there
 * 
 *      1st - Default Constructor
 *      2nd - Parameterized Constructor
 * 
 */

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

class A{
    int roll;
    String Name;
    long mobileNo;
    
    // This will invoke when no parameter were given on object creation
    A(){
        System.out.println("This is non-parameterized(Default) Constructor");
    }
    
    A(long m){
        mobileNo = m;
        System.out.println("This is parameterized Constructor");
    }

    // This will invoke when two parameter were given on object creation
    A(int i, String n){
        roll = i;
        Name = n; 
        System.out.println("This is parameterized Constructor with two arguments");
    }

    // // This will invoke when three parameter were given on object creation
    A(int i, String n, long m){
        roll = i;
        Name = n; 
        mobileNo = m;
        System.out.println("This is parameterized Constructor with three arguments");
    }
    
    // This will display our parameters
    void disp(){
        System.out.println(roll + " " + Name + " " + mobileNo);
    }
}
public class classobj2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        A stud = new A(scn.nextInt(), scn.next(), scn.nextLong());
        stud.disp();
    }
}