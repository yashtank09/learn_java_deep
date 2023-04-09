package Abstraction;

/*
    Abstraction: https://www.javatpoint.com/abstract-class-in-java

    - 'abstract' keyword for creating class/methodd.
    - If concreet class have abstract method, class must be abstract.
    - If abstract class don't have abstrac method is allowed.

    Rules for Java Abstract class:
        - An abstract class must be declared with an abstract keyword.
        - It can have abstract and non-abstract methods.
        - It cannot be instantiaed.
        - It can have final methods.
        - It can have constructors and static methods also.
*/

// This is 'abstract class', we have created it using 'abstract' keyword.
abstract class SuperAbst{
    SuperAbst(){
        System.out.println("Super Abstract Constructor");
    }

    public void meth1(){
        System.out.println("This is Super class Method 1");
    }
    
    // This is abstract method, abstract methods dosen't have any body/defination.
    abstract public void math2();
}

class subAbst extends SuperAbst{
    // If we want to make this class concreet, abstract methods must be overriden.
    @Override
    public void math2(){
        System.out.println("Sub Method 2");
    }
}


public class AbstractionFirstExample {
    public static void main(String[] args) {
        /*     
        ABSTRACTION:
            If class is abstract we can not instansiate an object of that class.
            SuperAbst sabt = new SuperAbst(); XX
            
            or can not call the methods
            sabt.meth1(); XX

            but we can create a referance of an abstract class
            SuperAbst sb; X
            we can not call a method using only referance of a class
            sb.meth2; XX
         */

        /* 
           Now after creating abstract class and overriding abstract methods we can create an referance of abstracct class and instanciate with object of sub class.
           Having referance of an abstract class we can assign a object of sub class
        */
        SuperAbst sr = new subAbst();
        sr.meth1();
        sr.math2();


        // anonymous object methods / anonymous class
        SuperAbst sra = new SuperAbst() {
            public void meth1(){
                System.out.println("hello!");
            }

            @Override
            public void math2() {
                throw new UnsupportedOperationException("Unimplemented method 'math2'");
            }
        };

        sra.meth1();
        sra.math2();        
    }
}