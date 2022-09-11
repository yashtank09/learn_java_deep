package Inheritance;
/* 
    Polymorphism:
        - Overriding is used for runtime polymorphism.
        - Overriding will only achive by Inheritance.
 */
class T1{
    protected void display(){
        System.out.println("Super T1 Display.");
    }
}

class T2 extends T1{
    public void display(){
        System.out.println("Sub T2 Display.");
    }
}

public class OverridingExam {
    public static void main(String[] args) {
        T1 a = new T2();
        /*
            - A method call depends on the object and new means object will be created on runtime.
            - Compiler only generate bytecode, will not decide which method call.
            - It has will be decided on the runtime that which method calls on runtime.
        */
        a.display();
    }
}
