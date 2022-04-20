package OOPJ;

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
        // Calling Super class method using super KeyWord.
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
