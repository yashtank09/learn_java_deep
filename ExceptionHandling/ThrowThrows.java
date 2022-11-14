package ExceptionHandling;

/* 
    Throw and Throws:
    https://www.javatpoint.com/difference-between-throw-and-throws-in-java
 */

public class ThrowThrows {
    static int area(int x, int y) throws Exception{ // declare an exception which might be thrown by the function
        if(x < 0 || y < 0)
            throw new Exception(); // it will throw object of Exception
        return x*y;
        // When ever the method is called it should be surrouded with try/catch block
    }
    static void meth2() throws Exception{
        System.out.println("Area is "+ area(-10, 5));
    }
    public static void main(String[] args) throws Exception {
        meth2(); // here we can also use try/catch blocks to handle exception
        
    }
}
