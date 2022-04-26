package Abstraction;

public class AbDemo {
    public static void main(String[] args) {
        // We can not instansiate object of Abstract class
        //YashPhone obj = new YashPhone();
        
        //YashPhone obj = new Aastik(); can nto instansiate because aastik wants to just move
        
        //obj.call();
        
        // Now we can call all method by instansiate Tuashr object
        Yash obj = new Tushar();
        obj.move();
        obj.call();
        obj.cook();
    }
}

abstract class Yash {
    
    public void call() {
        System.out.println("Yash Calling...");
    }

    // if we delcare abstract method so class should be abstract also
    // But if class is abstract so no need to specify method abstract
    public abstract void move();
    public abstract void cook();
    
}

abstract class Aastik extends Yash {
   
    // we declares move() class of YashPhone but
    public void move(){
        System.out.println("Moving Aastik phone");
    }

}

class Tushar extends Aastik {
    
    // There's only two methods which are abstract so we have to have body of them here in this class
    public void move(){
        System.out.println("Tushar MOVES");
    }
    public void cook(){
        System.out.println("Tushar COOKS");
    }

}