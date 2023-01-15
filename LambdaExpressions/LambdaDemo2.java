package LambdaExpressions;

/**
 * Lambda Expression with functional parameters
 */

@FunctionalInterface
interface MyLambda2 {
    // public void display (String s);
    public int add(int x, int y);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        // MyLambda2 ml = (s)->{System.out.println();};
        // ml.display("Hello, This is lambda function's parameter.");

        // MyLambda2 ml = (a,b)->{return a+b;}; 
        MyLambda2 ml = (a,b)->a+b; // without/auto return keyword | using expression
        int result = ml.add(10, 30);

        System.out.println(ml.add(10,20));
        System.out.println(result);

    }
}
