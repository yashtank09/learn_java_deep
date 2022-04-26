/**
 * FinalKeyword
 *  - The final keyword in java is used to restrict the user. The java final keyword can be used in many context.
 *      - class
 *      - method
 *      - variable
 * 
 */
public class FinalKeyword {
    // Final Variables
    final int MIN; // Final keyword is given to variable we have to initialize them
    final int MAX = 10;

    static final double PI = 3.14159;
    FinalKeyword(){
        MIN = 0;
    }

    // Thi is final method
    final public void hello(){
        System.out.println("Hii This is Final method");
    }

    /*
    void newMAX(int newMAX){
        MAX = newMAX;   // -  MAX is final variable so we can not assignit
    }
    */

    public static void main(String[] args) {
        FinalKeyword f = new FinalKeyword();

        System.out.println(f.MIN);
        System.out.println(f.MAX);

        System.out.println(PI);
    }
}

/* - Cannot override the final method from FinalKeyword
class MethodFinal extends FinalKeyword{
   public void hello(){
       System.out.println("Hello, There!");
   }
}
*/