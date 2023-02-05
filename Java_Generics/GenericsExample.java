package Java_Generics;

/* 
 * Generics: https://www.geeksforgeeks.org/generics-in-java/
 * Oracle DOCS: https://docs.oracle.com/javase/tutorial/java/generics/index.html
 * 
 *  - Assume you want an array to store any type of object in it.
 *  - for that we can use 'Generics' that can capable of storing any type of specified object
 *  - We have to specifiy the type of object
 */

@SuppressWarnings("unchecked")
// we should make a class as a generic like below
public class GenericsExample<T> {
    
    // T data[]; // Error if class is not specified with generic type | T cannot be resolved to a type
    // T data[]= new T[3]; This is not a way to crate generics
    T data[] = (T[]) new Object[3]; // we create array of Object and typecast it with generic

    public static void main(String[] args) {
        
        GenericsExample<String> gso = new GenericsExample<>();

        gso.data[0] = "hello";
        gso.data[1] = "bye!";
        // gso.data[2] = 120; // Raise error: Type mismatch: cannot convert from int to String
        gso.data[2] = "Welcome!";
       
        // we can also assign it to String reference
        String str = gso.data[0];
        System.out.println(str);


        // we can create object of any type by specifing type
        GenericsExample<Integer> gio = new GenericsExample<>();
        gio.data[0] = 10;
        gio.data[1] = 20;
        gio.data[2] = 30;
    }
}
