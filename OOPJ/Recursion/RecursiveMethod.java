package Recursion;

public class RecursiveMethod {

    static void fun(int n){
        if(n>0){
            fun(n-1); // This is Function call it self
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        fun(3); // Function calling it self
    }
}
