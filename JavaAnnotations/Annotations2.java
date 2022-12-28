package JavaAnnotations;

import java.util.*;

/**
 * @Deprecated to indicate the method is deperecated or not to use in this version
 *  - It will Strike out the method where this annotation is noted
 * 
 * @Suppresswarningss("deprication") - This will pretend deprecation warnings.
 * @Suppresswarningss("unchecked") - This will from unchecked warnings.
 */

class OldClass {

    public void dispay(){
        System.out.println("Hello");
    }

    // This is depricated method which will indicate as striked and will raise runtime warning
    @Deprecated
    public void show(){
        System.out.println("Hi");
    }

}

/*
 * @SafeVarargs - is used to suppress the unsafe operation warnings at the compile time.
 */

class MyT<T>{

    @SafeVarargs 
    private void show(T...arg){ // generic variable argument
        for(T x: arg){
            System.out.println(x);
        }
    }
}

/*
 * @FunctionalInterface - A functional interface is an interface that contains only one abstract method.
 */
@FunctionalInterface
interface funcA{
    public void show();
    // public void s();
}

public class Annotations2 {
    static List l;

    // @SuppressWarnings("deprication") // ignore Deprecation warningss
    @SuppressWarnings("unchecked") // ignore Deprecation warningss
    public static void main(String[] args) {
        OldClass o = new OldClass();
        o.show(); // this method is deprecated and will give warning
        
        l.add(10); // adding value to the list without creating it's object
    }
}
