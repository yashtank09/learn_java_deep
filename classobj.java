/**
 * classobj
 */
class demoobj{
    
    // Variables
    int id;
    String name;

    // Constructor
    public demoobj(){
        System.out.println("Hello, I'm Constructor of class demoobj");
    }

    // Simple Method
    private void demo(){
        System.out.println("hii");
    }
}
public class classobj {

    public static void main(String[] args) {
        
        demoobj dob = new demoobj(); // we had created an object of our class and here constructor of that class is called automatically because we created instance of that class

        System.out.println(dob.id + " " + dob.name); // here it will return [ 0 null ] because of there is no initialization of that objects
    }
    
}