package Interface;

/* 
 * 'interface' keyword used for creating an interface.
 * 'interfaces' are by default abstract we can not create their objects.
 */
interface Test{
    // every method must be abstract in interface.
    void meth1();
    void meth2();
}

/*
    We can not extends interfaces
    class MyTest extends Test{

    }

    We have to implements interfaces
*/

class MyTest implements Test{
    // As 'interfaces' are same as abstract class we have to override every method of an interface
    public void meth1(){
        System.out.println("This is overrided method 1.");
    }
    public void meth2(){
        System.out.println("This is overrided method 2.");
    }
    public void meth3(){
        System.out.println("This is simple method 3.");
    }
}
public class interfaceExam1 {
    public static void main(String[] args) {
        /* 
            We can not creat an object of an Interface because it is abstract and their methdos are also be abstract.

            Test t = new Test(); XX It's wrong.
        */
        
        // Now we creating an object of MyTest class and calling it's methods.
        MyTest T1 = new MyTest();
        T1.meth1();
        T1.meth2();
        T1.meth3();

        // Here, we creating a referance of Test interface and assigning object of an MyTest class
        Test T2;
        T2 = new MyTest(); // Using this object we can only call the methods of 'Test' interface
        T2.meth1();
        T2.meth2();
        // T2.meth3(); is not callable using referance of interface 'Test'.
    }
}
