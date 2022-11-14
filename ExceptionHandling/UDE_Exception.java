package ExceptionHandling;

// Creating our own exception
class LowBalanceException extends Exception{
    // overriding toString() method that will print the message when the exception will rais
    public String toString(){
        return "Balance should not be below 5000";
    }
}

public class UDE_Exception {
    static void func1(){
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            // e.printStackTrace();
            System.out.println(e); // call toString() method
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
