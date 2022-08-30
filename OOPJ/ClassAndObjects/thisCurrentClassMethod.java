package ClassAndObjects;

/* 
    Java code for using 'this' to invoke current
    class method
    Data hiding | Method Hiding
 */
class Test4{
    void display()
    {
        // calling function show() using 'this'
        this.show();
    
        System.out.println("Inside display function");
    }
     
    void show() {
        System.out.println("Inside show function");
    }
}

public class thisCurrentClassMethod {
    public static void main(String[] args) {
        Test4 T = new Test4();
        T.display();
        T.show();
    }
}
