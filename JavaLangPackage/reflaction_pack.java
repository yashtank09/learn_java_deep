package JavaLangPackage;

import java.lang.reflect.*;

/**
 *  java.lang.reflect
 *      - Provides classes and interfaces for obtaining reflective information about classes and objects.
 *      - Package reflect: https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/package-summary.html
 */


// This is our target class to use reflect package
class My{

    private int a;
    public int b;
    protected int c;
    int d;

    public My() {
        // TO-DO
    }

    public My(int x, int y){
        // TO-DO
    }

    public void display(String s1, String s2){
        // TO-DO
    }

    public int show(int x, int y, int z){
        return 0;
    }

}

public class reflaction_pack {

    public static void main(String[] args) {
        // Every class have their encapsulated values, to find each encapsulated thing we can use reflact class
        
        Class c = My.class; // return description of class

        // My m = new My();
        // Class c1 = m.getClass(); // another method for get defination of class

        System.out.println(c.getName());
        
        System.out.println("\nDetails of Fields: ");
        // Get Array of fiealds
        Field field[] = c.getDeclaredFields();

        for (Field f : field) {
            System.out.println(f);
        }
        
        System.out.println("\nDetails of Constructor: ");
        // Get Array of Constructor
        Constructor con[] = c.getConstructors();

        for (Constructor constructors : con) {
            System.out.println(constructors);
        }

        System.out.println("\nDetails of Methods: ");
        // Get details array of Methods
        Method meth[] = c.getMethods();
        // Object class methods are also showned by 'Mehtod' class, because 'Object' is default extends with every class

        for (Method method : meth) {
            System.out.println(method);
        }

        System.out.println("\nSet of Parameter: ");
        // also we can get array of parameters
        Parameter param[] = meth[0].getParameters();

        for (Parameter parameter : param) {
            System.out.println(parameter);
        }

        
    }
}
