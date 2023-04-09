package Static_Final;

/* 
 *  Final:
 *      final keyword is used in different contexts. First of all, final is a non-access modifier applicable only to a variable, a method, or a class.
 *          
 *          Final Variable - To create constant variable
 *          Final Method - Prevent Method Overriding
 *          Final classes - Prevent Inheritance
 *      
 *      - Final varialbes are constant that meanse their value is fixed we can not modify their value.
 *      - You can not modify assigned value of final variable
 *      - You must follow final datamember naming convention or formality to write in capital letter
 *  - More about FINAL: https://www.geeksforgeeks.org/final-keyword-in-java/ 
 */

public class finalKeyword_first {
    
    // static final variable
    static final int PRICE = 100; // Make it static to use it inside main method

    // another static final variable
    static final int RANGE;

    // blank fina variable
    final int VALUE; // Not initialized

    // another blank final bariable
    final int VALUE1; // Not initialized

    // for initializing the VALUE we have to use ether constructor of class or an instance block

    // Can not directly initialize it
    // VALUE = 1000;

    // final variable initialization using Static block 
    static {
        RANGE = 199;
    }

    // This is an instance block | More about it: https://www.geeksforgeeks.org/instance-initialization-block-iib-java/
    {
        VALUE=10000;
    }

    // Also we can initialize final datamember inside constructor of a class
    finalKeyword_first(){
        VALUE1 = 10000;
    }


    public static void main(String[] args) {
        // Final variable or Datamember
        final float PI = 3.1425f;
        System.out.println(PI);

        // final variable without initialization
        final byte USNM;
        USNM = 10; // Can initialize it like this

        System.out.println(USNM);

        System.out.println(PRICE); // Cannot make a static reference to the non-static field PRICE
    }
}

/* 
    NOTE: The string is immutable means that we cannot change the object itself,
    but we can change the reference to the object.
    The string is made final to not allow others to extend it and destroy its immutability.
 */
