package Inheritance;
/* 
 * Inheritance
 */
// Perent class
class PerentClass{
    PerentClass(){
        System.out.println("Perent class called...");
    }
}

// Child class
class ChildClass extends PerentClass{
    ChildClass(){
        System.out.println("Child class called...");
    }
}

// Grand child class
class GrandChildClass extends ChildClass{
    GrandChildClass(){
        System.out.println("Grand child class called...");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        /*
         * When we create object of 'Child Class' constructor of perent class will always execute first and then child class constructor will execute.
         */
        new GrandChildClass();
    }
}
