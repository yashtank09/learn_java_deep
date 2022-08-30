/**
 *  The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 *
 *  Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
 */
class Animal{
    protected int age = 14;
    protected String name = "This is Super class Variable";
    
    // This is Super class
    public void MakeNoice(){
        System.out.println("Hello, I am an animal.");
    }
    protected void eat(){
        System.out.println("Munch Munch Munch...");
    }
}
class Dog extends Animal{
    
    public void MakeNoice(){
        
        // Calling Super class method using super() method.
        super.MakeNoice();
        
        System.out.println("This is variable of super class: " + super.age);
        
        // if we are calling this child class method wihout use of Super keyword it displayes child class method
        // System.out.println("Bhow Bhow Bhow...");
    }

    public void eat(){
        System.out.println("Eats Pedigree...");
    }
}
public class SuperClassExmpl {
    public static void main(String[] args) {
        Dog c = new Dog();
        c.MakeNoice();
        // here it will prints child class eat() method.
        c.eat();
    }
}
