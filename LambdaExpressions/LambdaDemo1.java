/*
 * Lambda Expression 
 *  - Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface.
 *  - https://www.geeksforgeeks.org/lambda-expressions-java-8/ 
 */

package LambdaExpressions;
// This is a functional interface
@FunctionalInterface
interface MyLambda {
    void display();
}
/*
class My implements MyLambda{
    public void display(){
        System.out.println("This is a class implements an interface.");
    }
}
*/
public class LambdaDemo1 {
    public static void main(String[] args) {
        
        // My m = new My(); // Normal object

        // MyLambda ml = new My();
        
        /*MyLambda ml = new MyLambda() {
            public void display(){
                System.out.println("This is an annonumous object of MyLambda interface which overrides display() method.");
            }
        };*/

        // Lambda function
        MyLambda ml = ()->{System.out.println("This is lambda expression.");};

        ml.display();

    }
}
