package Polymorphism;

class Helper {
    
    static int Multiply(int a, int b){
        return a * b;
    }
    
    static double Multiply(double a, Double b){
        return a * b;
    }
    
}

public class polyEx2 {
    public static void main(String[] args) {
        // If parameter given Floating point number then it will return the double return type method
        System.out.println(Helper.Multiply(10.0, 50.0));
        // If parameter given in decimal so it will return integer type method
        System.out.println(Helper.Multiply(10, 50));
    }   
}