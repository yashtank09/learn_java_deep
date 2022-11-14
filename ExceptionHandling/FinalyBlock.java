package ExceptionHandling;

/* 
    Finaly block.
    - https://www.geeksforgeeks.org/java-program-to-use-finally-block-for-catching-exceptions/#:~:text=The%20finally%20block%20in%20java,the%20exception%20occurs%20or%20not.
 */

public class FinalyBlock {
    public static void main(String[] args) {
        try {
            System.out.println(10/5);    
        } /* catch (ArithmeticException e) {
            System.out.println(e);
        } */
        // try with finally block | no need to add catch block
        // This is finally block that will execute  even the exception occures or not.
        finally{ 
            System.out.println("This is finally block, that will execute even the exception occurs or not.");
        }
    }
}
