package ExceptionHandling;

public class NeastedTryCatch {
    public static void main(String[] args) {
        int A[] = {10, 20, 30, 60, 50, 0};

        try {
            
            int c = A[4]/A[1];

            System.out.println("Division is: " + c);
            // Here we have write nested try catch block which will handle ArrayIndexOutOfBoundsException for the given array
            try {
                System.out.println(A[7]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Please check the size of the array and try again!\n" + e);  
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator shoud not be 0, try again!\n" + e);
        }
    }
}
