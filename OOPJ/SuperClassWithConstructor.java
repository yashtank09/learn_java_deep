package OOPJ;

class Aa{
    int maxSpeed;
    Aa(){
        System.out.println("Hello, This is A Default Constructor.");
    }
    Aa(int maxSpeed){
        System.out.println("Hello, This is A Parameterized Constructor.");
        this.maxSpeed = maxSpeed;
    }
}

class B extends Aa{
    B(){
        // super();
        System.out.println("Hello, This is B Default Constructor.");
    }
    B(int maxSpeed){
        // 
        super(2);
        System.out.println("Hello, This is B Parameterized Constructor.");
        this.maxSpeed = maxSpeed;
    }
}

public class SuperClassWithConstructor {
    public static void main(String[] args) {
        
        // B c = new B(33);

        B c = new B(33);
    }
}
