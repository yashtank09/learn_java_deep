package ClassAndObjects;
/* 
    Java code for using 'this'
    keyword as method parameter
    Data Hiding | Method Hiding
*/
class Test3{
    int a;
    int b;
     
    // Default constructor
    Test3()
    {
        a = 10;
        b = 20;
    }
     
    // Method that receives 'this' keyword as parameter
    void display(Test3 obj)
    {
        System.out.println("a = " +obj.a + "  b = " + obj.b);
    }
  
    // Method that returns current class instance
    void get()
    {
        display(this);
    }
}

public class thisMethodParameter {
    public static void main(String[] args) {
        
    }
}
