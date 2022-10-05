package Static_Final;

public class staticBlockExam2 {
    
    // static datamambers | Variables
    static int a = 10;
    static int b;

    // static block
    /* 
     * If you need to do the computation in order to initialize your static variables,
     * you can declare a static block that gets executed exactly once, when the class is first loaded.
     * Static blocks can use only static methods or static datamembers
     */
    static {
        System.out.println("First Static block initialized.");
        b = a * 4;
    }

    static {
        System.out.println("First Static block initialized.");
    }
    
    public static void main(String[] args) {
        
        System.out.println("from main.");
        
        // Calling static datamember of class
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
