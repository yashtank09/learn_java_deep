package InnerClasses;

class Outer{
    public void display(){
        // Local Inner class accessiblity is local
        class Inner{
            public void show(){
                System.out.println("Hello");
            }
        }

        // Creating object of Local Inner class
        Inner in = new Inner();
        in.show();
        // Anonumus Object
        new Inner().show();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
