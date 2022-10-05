package Static_Final;

class T1{
    // Final method which restrict runtime polymorphism (overriding)
    public final void show(){
        System.out.println("Hello");
    }
}

class T2 extends T1{
    // public void show(){ System.out.println("Hello Ji!"); } // We can not override the final method
}

public class finalMethods {
    public static void main(String[] args) {
        T2 T = new T2();
        T.show();        
    }    
}
