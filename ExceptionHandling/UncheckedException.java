package ExceptionHandling;
/* 
    Checked and Unchecked exception:
    https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/
 */
public class UncheckedException {
    static void func1(){
        // System.out.println(10/0); // Compiler not forced you to handle that exception that is UNCHECKED exception
        // Let's try to handle that exception
        try {
            System.out.println(10/0);
        } catch (Exception e) { // Exception is mother of all exception
            e.printStackTrace(); // shows the method stack where an exception occures
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
    static void func2(){
        func1();
    }
    static void func3(){
        func2();
    }
    public static void main(String[] args) {
        func3();        
    }
}
