package Java_Generics;
/* 
 * Understanding generalization and problem to use this generalization before generics came into java
 */

public class generalization_example {
    public static void main(String[] args) {
        
        Object obj = new String("Hello"); // reference of `Object class` can hold any object of it's child class

        // assigning Integer object to 'Object class reference obj'
        // obj = new Integer(100); // this will raise a runtime error, mens no type safety
        // java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
        
        // String str = obj; // for assign object to it's actual type we ''have to typecast'' it.
        String str = (String) obj;
        System.out.println(str);

        // ----------------------- Array of type Object
        Object obj2[] = new Object[3];

        obj2[0] = "Hello"; // String type
        obj2[1] = "Welcome!"; // String type
        obj2[2] = 10; // Integer

        // runtime type check error

        String str2;

        for(int i=0; i<obj2.length; i++){
            str2 = (String) obj2[i];
            System.out.println(str2);
        }
    }
}
