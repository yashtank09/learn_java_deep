package Static_Final;

/* 
 * When a member is declared static,
 * it can be accessed before any objects of its class are created, and without reference to any object.
 */

 public class staticMethodExample {
    // static method block || static block
    static void m1(){
        System.out.println("Hello!, This is static block.");
    }
    public static void main(String[] args) {
        // calling m1 method without creating any object of class test.
        m1();
    }
}
