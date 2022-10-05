package InnerClasses;

abstract class MyAnons{
    abstract public void show();
}

interface MyAnonsInterface{
    public void show();
}

class OuterTwo{
    public void display(){
        // This is Anonumous Class
        MyAnons m = new MyAnons(){public void show(){System.out.println("Hello");}};
        m.show();
        // This is Anonumous object with Anonumous class
        // new MyAnons(){public void show(){System.out.println("Hello");}}.show();

        // Also create an object of an interface by using anonumous class
        // This is an anonumous object of an interface
        MyAnonsInterface mI = new MyAnonsInterface() { public void show(){System.out.println("Hello Interface");}};
        mI.show();
    }
    
}

public class AnonumousClass {
    public static void main(String[] args) {
            
    }
}
