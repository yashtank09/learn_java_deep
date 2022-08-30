package ClassAndObjects;
/*
    Java code for using this() to
    invoke current class constructor
    Data Hiding
*/

class test1{
    int a, b;
    // Default Constructor
    test1(){
        this(10,20);
        System.out.println("Inside default constructor");
    }

    // Parameterized Constructor
    test1(int a, int b){
        this.a = a; // Assiged value from default constructor using 'this'
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
}

public class thisReturnsCurrentConstructor {
    public static void main(String[] args) {
        test1 t1 = new test1(); // calling both Constructor
        test1 t2 = new test1(11,12); // calling only parameterized constructor
    }
}
