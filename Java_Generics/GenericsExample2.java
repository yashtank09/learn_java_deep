package Java_Generics;

/**
 * GenericsExample2
 */

 // Generic class
class Data<T> {
    private T obj; // reference of type 'T' 'obj'

    // getter to return reference of object
    public T getObj() {
        return obj;
    }

    // setter for storing value into our generics
    public void setObj(T obj) {
        this.obj = obj;
    }
}
public class GenericsExample2 {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        Data<String> d2 = new Data<>();
        
        d.setObj(10); // Autoboxing is done here otherwise we have to specify object liek (new Integer(10))
        d2.setObj("Hi!");

        System.out.println(d.getObj());
        System.out.println(d2.getObj());
    }
}