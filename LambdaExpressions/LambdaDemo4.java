package LambdaExpressions;

/* 
 * Lambda Expression as a parameters
 */

@FunctionalInterface
interface LambdaUse {
    public void display();
}

class UserLambda {
    public void callLambda(LambdaUse lu){ // this 'lu' is refering to the given parameter, here which is lambda expression it self
        lu.display();
    }
}

class LambD {
    public void methods(){
        UserLambda ul = new UserLambda();
        ul.callLambda(()->{System.out.println("Yash hello ");}); // Here we are pasisng lambda expression as a parameter
    }
}

public class LambdaDemo4 {
    public static void main(String[] args) {
        LambD ld = new LambD();
        ld.methods();
    }
}
