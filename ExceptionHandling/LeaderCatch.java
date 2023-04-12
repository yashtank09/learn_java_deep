package ExceptionHandling;

public class LeaderCatch {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }
        catch(Exception e){
            System.out.println(e);
        } 
        catch(ArithmeticException e){
            System.out.println(e);
        }// compile time error: exception ArithmeticException has already
    }
}
