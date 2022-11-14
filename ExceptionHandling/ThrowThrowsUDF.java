package ExceptionHandling;

/* 
    Throw and Throws with Userdefine Exception
 */

// User define Exception
class NegativeDimentionException extends Exception{
    public String toString(){
        return "Dimention of a Rectangle cannot be Negative";
    }
}

public class ThrowThrowsUDF {
    
    static int area(int x, int y) throws NegativeDimentionException{
        if(x < 0 || y < 0)
            throw new NegativeDimentionException(); // throwing object of userdefine exception 
        return x*y;
    }

    static void meth2() throws NegativeDimentionException{
        System.out.println("Area is "+ area(-10, 5));
    }

    public static void main(String[] args) {
        // Handling exception ouccurance
        try {
            meth2();
        } catch (NegativeDimentionException e) {
            System.out.println(e);
        }
    }
}
