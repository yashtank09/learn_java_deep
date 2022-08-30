package ClassAndObjects;
/* 
    Java code for using 'this' keyword
    to return the current class instance
    Data hiding
 */
class Test2{
    int a;
    int b;
 
    //Default constructor
    Test2()
    {
        a = 10;
        b = 20;
    }
     
    //Method that returns current class instance
    Test2 get()
    {
        return this;
    }
     
    //Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }
}

public class thisReturnsCurrentClassInstance {
    public static void main(String[] args) {
        Test2 T = new Test2();
        System.out.println(T.get());
    }
}
