package Inheritance;
/* 
    Run time Polymorphism -:- Super class referance holding of object of sub class and calling overrided method, Method of object will be called.

    - Dynamic Method Dispatch | Runtime Polymorphism
    - Super class referance can have object of sub class, but sub class referance can not have object of super class.
    - If sub class is overriding method of super class then method of super class will be shadowed.
    - Using Super class referance and object of sub class we can only call overrided methods of sub class.
 */
class superClass{
    public void meth1(){
        System.out.println("Super Meth - 1");
    }
    public void meth2(){
        System.out.println("Super Meth - 2");
    }
}

class subClass extends superClass{
    public void meth2(){
        System.out.println("Sub Meth - 2");
    }
    public void meth3(){
        System.out.println("Sub Meth - 3");
    }
}

public class DynamicMethodDispatchExp2 {
    public static void main(String[] args) {
        superClass sc = new subClass(); // 'Super class' referance 'sc' assigne object of 'sub class'.
        sc.meth1();
        /* 
            Methods are called depending apon object.
            This will call Overrided method of sub class.
            We can not call other extra methods of sub class.
        */
        sc.meth2();
        // sc.meth3(); // It can call only those methods which are defined in super class.
    }
}
