package OOPJ.Methods;

public class ObjectPassingasParameter {
    static void welcome(String n){ // parameter `n` is pointing to actual object | here it just copy the reference of that object
        System.out.println("Hello, Welcome "+n+" to our new program.");
    }
    public static void main(String[] args) {
        String name = "Yash"; // Object's address will copied in formal paramter | here address is 'name'
        welcome(name);
    }
}
