package Polymorphism;

/**
 * Compile-time Polymorphysm | { OVERLOADING }
 */
public class polyEx1 {
    
    // OVERLOADING or Compile-Time Polymorphysm means duplicate methods but have defferent parameter

    static int addition(int a, int b){
        return a + b;
    }

    static int addition(int a, int b, int c){
        return a + b + c;
    }

    static int addition(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        // This is overloaded methods called here

        System.out.println(addition(10, 20));
        System.out.println(addition(20, 30, 40));
        System.out.println(addition(30, 40, 50, 60));
    }
}
