package OOPS;
import java.lang.reflect.Method;

/**
 * classobj
 */
class demoobj{
    
    // Variables
    int id;     // = 111;
    String name;

    // set value to variable
    public void setValue(){
        id = 10;
        name = "Yash";
    }

    // get given value of variables
    public void getValue(){
        System.out.println("ID is: " +  id);
        System.out.println("Name is: " + name + "\n");
    }

    // Constructor
    public demoobj(){
        System.out.println("\nHello, I'm Constructor of class demoobj");
    }

    // Simple Method
    protected void demo(int id){
        // id = 80; if we declare the parameter default it always get default parameter at instance creation time
        // Here id has initial value but in the function it will overite the by parameter given
        System.out.println("This is parameter given to object is: " + id);
        System.out.println("Hii I'm Protected Method");
    }
}
public class classobj {

    public static void main(String[] args) {

        demoobj dob = new demoobj(); // we had created an object of our class and here constructor of that class is called automatically because we created instance of that class

        dob.id = 101;
        dob.name = "Hello, I'm String variable";       
        System.out.println("\n" + dob.id + "\n" + dob.name + "\n"); // here it will return [ 0 null ] because of there is no initialization of that objects
        
        dob.setValue();
        dob.getValue();

        // Parameter given by
        dob.demo(560);
        dob.demo(56);

        
    }
    
}