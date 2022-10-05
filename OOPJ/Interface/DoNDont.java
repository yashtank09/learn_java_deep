package Interface;

interface tEsT{
    // we can access it using interface name in other methods
    final static int x = 10; // this data member of interface by default static

    // we can not use 'private' and 'protected' access modifier
    // private void meth1();
    // protected void meth1();
    public void meth1();
    public void meth2();
    
    /* 
    // Method must not have body, if it has we have to make it 'static'
    public void meth3(){
        System.out.println("Meth 3 of tEsT interface.");
    } 
    */
    
    public static void meth3(){
        System.out.println("Meth3 of tEsT interface.");
    }

    default void meth4(){
        System.out.println("Meth3 of tEsT interface.");
    }

    // after java9 you can create private method in interface, private methods are useful in default methoda their scope is only in defined interface.
    private void meth0(){
        System.out.println("Private method of an interface call.");
    }// We can not call private methods of an interfaces

    // Using private method inside default methods
    default void meth00(){
        System.out.println("Default method \'calling private\' method.");
        meth0();
    }
}

// Interface can extends another Interface in it.
interface Test2 extends tEsT{
    void meth5();
}

class MyClassDemo implements Test2{
    // Must have to write method 'public'
    public void meth1(){}
    public void meth2(){}
    public void meth3(){}
    public void meth5(){
        System.out.println(Test2.x);
    }
}

public class DoNDont {
    public static void main(String[] args) {
        System.out.println(tEsT.x); // Accesing datamember using interface name
        MyClassDemo m = new MyClassDemo();
        m.meth00(); // Calling default method of an interface.
    }
}
