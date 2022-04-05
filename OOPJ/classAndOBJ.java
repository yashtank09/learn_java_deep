package OOPJ;
/*
 *  ```This is Basic class and object example 
 */

//  Initialized a class using class keyword
class A{
    // Creating Vars by using default access modifier
    int age;
    String name;
}
public class classAndOBJ {
    public static void main(String[] args) {
        // Creating Instance/Object of class A
        A a = new A();

        // Initialise Valure to that object variable
        a.age = 22;
        a.name = "Yash";

        // Print variables insied the class
        System.out.print("Your Name is : "+a.name);
        System.out.println("\tand your age is: "+a.age);
    }    
}
