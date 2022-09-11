package Inheritance;
/* 
 * Calling Parameterized Super Constructor
 */
class BaseClass{
    BaseClass(){
        System.out.println("Non-Param Base/Perent Constructor...");
    } // Called when ever child class object is created
    BaseClass(int x){
        System.out.println("Param Base/Perent Constructor...: "+x);
    } // Called when child class constructor have super(<parameters>)
}

class DerivedClass extends BaseClass{
    DerivedClass(){
        System.out.println("Non-Param Dervied/Child Constructor");
    }
    DerivedClass(int x){
        System.out.println("Param Dervied/Child Constructor");
    }
    DerivedClass(int x, int y){
        super(x); // Execute a perent class parameterised constructor.
        System.out.println("2 Param Dervied/Child Constructor value: " + y);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        new DerivedClass(12,21);
        /* 
         * Here we are creating an object of a child class which has a parameterised constructor.
         * The Super() keyword will execute a perent class parameterised constructor.
         */
    }
}
