package Interface;

/* 
 * static method defined in an interface
 * Defining a method in the interface, but it must be static
 */

interface MyInterface {
    public void demo();

    // defined method of an interface must be static
    public static void display() {
        System.out.println("This is a static method");
    }
}

interface StaticMembers{
    public static int number = 0;

    static void display(int number){
        System.out.println();
    }
}

class OthersClass {
    public void demo() {
        System.out.println("This is the implementation of the demo method");
    }
}

public class InterfaceStatic {
    public static void main(String[] args) {

        // created an object of class OtherClass
        OthersClass o = new OthersClass();
        o.demo();

        // calling defined method of an Interface using it's name
        MyInterface.display();
    }
}
