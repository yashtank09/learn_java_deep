package InnerClasses;

class OuterClass{
    static int x = 10;
    // Also we can create an object of inner class here so it will be accessible for every method of the outer class
    InnerClass i = new InnerClass(); 

    class InnerClass{
        int y = 20;

        void InnderDisplay(){
            // We can direcly access the datamember of outer class
            System.out.println(x+" "+y);
        }
    }

    public void OuterDisplay(){
        // InnerClass i = new InnerClass();
        i.InnderDisplay();
        // We can only access data meber of inner class by using their object
        System.out.println(i.y);
    }
}

public class Example1 {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        o.OuterDisplay();

        // Creating an object of Inner we have to create object of outer class first as shown below
        OuterClass.InnerClass oi = new OuterClass(). new InnerClass();
        // referance 'oi' hold the properties and methods of InnerClass() object
        System.out.println(oi.y);
        oi.InnderDisplay();   
    }
}