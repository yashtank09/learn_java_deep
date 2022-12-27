package JavaLangPackage;

/* 
 *  Every class in java is directly or indirectly inheriting from 'Object' class.
 */

class MyObject {
    // MyObject class is automatically extending from 'Object' class
}

class MyObject2 extends MyObject {
    // MyObject2 is indirectly extending from 'Object' class.
}

// Overriding methods of 'Object' class
class ObjectOverride {
    
    // toString() commonly overrided method in javad
    public String toString(){
        return "This is overrided message for this object.";
    }

    // Overriding method hashcode() | java has strong algorithm for providing hashcode for an object
    public int hashcode(){
        return 1002;
    }

    // Overriding method equles()
    public boolean equles(Object o){
        return this.hashCode() == o.hashCode();
    }

    /* 
     * We can not override this methods because they are final methods.
     *  - wait()
     *  - notify()
     */
}

public class OverrideObjectMethods {
    public static void main(String[] args) {
        MyObject o1 = new MyObject();
        MyObject2 o2 = new MyObject2();

        System.out.println(o1);
        System.out.println(o1.equals(o2));

        // Object of ObjectOverride which have overrided method of an Object class
        ObjectOverride OO = new ObjectOverride();
        ObjectOverride OO2 = new ObjectOverride();

        System.out.println(OO); // this will return overrided toString method.
        System.out.println(OO2.equals(OO)); // this will return true because we have overrided hashcode() method

    }
}
