package LambdaExpressions;
/* 
 *  - Lambda expression can have their own variables, we can use them many times
 *  - Lambda expression can access or captures local variables only if they are final or they could never modified inside the methods
 */
interface MyLambdaInter {
    public void display();
}

class MyLambDemo {
    
    int ClassGlobal = 10; // Instance variable
    
    public void meth1() {

        int countGlob = 0; // Local Method member
        
        // Lambda experssions are similar to Inner class, so inner class can access the members of outer class 
        MyLambdaInter ml = ()->{ // Annonumous inner class could not access local variables
            int count = 0; // Local variable to use in the method as maytime as we want
            System.out.println("Hii");
            System.out.println("Bye"+(count++)); // can modifty local method variable
            System.out.println("Bye"+(++ClassGlobal)); // can access instance variable, also can modify because they need not to be final   
        };

        System.out.println(countGlob++); // is a not a final
    
        // count++; // This is local to the method/ lambda expression
    
        ml.display();
    }
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        
    }
}
