package OOPJ.Methods;

public class ParameterPassingReturn {
    // void if the method does not return a value
    static void inc(int x){
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a = 10;
        
        inc(a); // calling inc() method that will return incremented value of given parameter
        System.out.println("Variable 'a' = "+a); // This is variable 'a' that is declared in main method
    }
}
