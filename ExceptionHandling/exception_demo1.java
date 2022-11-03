package ExceptionHandling;

/**
 * exception_demo1
 */
public class exception_demo1 {

    public static void main(String[] args) {
        int a=10, b = 0, c;

        try{
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Denometer should not be 0, try again."+e);
        }
        System.out.println("Bye");
    }
}