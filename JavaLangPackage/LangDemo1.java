package JavaLangPackage;

// import java.lang.*;

/**
 * java.lang package:
 *      - Provides classes that are fundamental to the design of the Java programming language.
 *      - On the top of the hierarchy or we can say it is mother of call classes. 
 */
public class LangDemo1 {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;
        // -- .toString() method
        System.out.println(o1); // this will call toString method and prints package+@+unsinged hashcode representation of the object.
        System.out.println(o1.toString()); // Returns a string representation of the object.

        // -- .equals() method
        System.out.println(o1.equals(o2)); // Indicates whether some other object is "equal to" this one.
        System.out.println(o2.equals(o3)); // this will return true, because object 'o3' having the referance of object o2.

        // -- .hashcode() method
        System.out.println(o1.hashCode()); // Returns a hash code value for the object.

    }
}