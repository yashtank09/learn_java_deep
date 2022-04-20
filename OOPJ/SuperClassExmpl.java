package OOPJ;

class Animal{
    protected int age;
    protected String name;
    Animal(){
        System.out.println("This is animal class constroctor.");
    }
    public void MakeNoice(){
        System.out.println("Hello, I am an animal.");
    }
    protected void eat(){
        System.out.println("Munch Munch Munch...");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("This is Dog Class Constructor");
    }
    public void MakeNoice(){
        System.out.println("Bhow Bhow Bhow...");
    }
}
public class SuperClassExmpl {
    public static void main(String[] args) {
        Dog c = new Dog();
        c.MakeNoice();
    }
}
