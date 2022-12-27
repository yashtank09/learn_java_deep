package JavaLangPackage;

/* 
 * Wrapper classes: https://docs.oracle.com/javase/7/docs/api/java/lang/package-summary.html
 * 
 *      - The wrapper classes Boolean, Character, Integer, Long, Float, and Double serve this purpose. 
 *      - An object of type Double, for example, contains a field whose type is double, representing that value in such a way that a reference to it can be stored in a variable of reference type.
 *      - These classes also provide a number of methods for converting among primitive values, as well as supporting such standard methods as equals and hashCode. The Void class is a non-instantiable class that holds a reference to a Class object representing the type void.
 *  
 * Wrapper Classes:
 *      - Charachter
 *      - Byte
 *      - Short
 *      - Integer
 *      - Long
 *      - Float
 *      - Double
 *      - Boolean
 */

 public class WrapperClass {
    public static void main(String[] args) {
        
        int a = 10; // This is primitive datatype, a is not an object that is built in datatype or inhebitants of compiler.

        // For premitives also we want classes so we can 'treat java as a pure OBJECT ORIENTED DATATYPE'.
        
        Integer i = new Integer(10); // Created object of Integer type which has value '10'
        Integer j = Integer.valueOf(100); // Integer constructor is Depricated so here's another method to create an object and assign Integer value
        Integer k = 10; // This is thierd and propper method, where internally it will assign as Integer.valueOf('<value>');

        // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

        Byte b = 15; // directly assigned value to byte object
        Byte c = Byte.valueOf("10"); // also take a string as a parameters
        
        // Byte c = Byte.valueOf(15); // 15 is an Integer literal

        byte d = 12;
        Byte e = Byte.valueOf(d); // we shoud have to give variable of byte type

        Short f = Short.valueOf("123"); // same methods as 'Byte'

        // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

        // Float p = 3.14; // Error: value is Double constant not a Float.
        Float p = 3.14f; // Treating as float constant using suffix 'f' | Directly assigning a value means use the .valueOf() method
        Float h = Float.valueOf("3.14");

        Double t = Double.valueOf(123.555);

        // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

        Character y = Character.valueOf('A');  // We shoud use single quot ''

        Boolean o = Boolean.valueOf("True");

        // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 

            float f1 = 3.14f;
            Float a1 = Float.valueOf(f); // This is BOXING primite to non-primiitve
            float f2 = a1.floatValue(); // This is UNBOXING non-primitive to primitive

            // AUTO BOXING and AUTO UNBOXING

            int i1 = 100;
            Integer j1 = i1; // This is AUTO BOXING
            int k1 = j1; // This is AUTO UNBOXING 

    }   
}
