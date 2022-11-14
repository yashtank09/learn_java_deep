package ExceptionHandling;

/* 
 * Neasted Catch block
 *  - we can write multiple catch blocks to handle multiple exceptions
 */
public class NestedCatchBlocks {
    public static void main(String[] args) {
        int A[] = {10, 20, 30, 60, 50, 40};

        try {
            int c= A[0] / A[2];

            System.out.println("Division is: "+c);

            System.out.println(A[7]);
        } catch (ArithmeticException e) {
            System.out.println("Denominator shoud not be 0, try again!\n" + e);
        // Here we have write another catch block which will handle ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please check the size of the array and try again!\n" + e);
        }
    }
}
