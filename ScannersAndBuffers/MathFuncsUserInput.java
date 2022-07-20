package ScannersAndBuffers;
import java.util.Scanner;

class mathOpprations{
    
    public static double addition(double a, double b){
        return a + b;
    }

    public static double substraction(double a, double b){
        return a - b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }

    public static float divition(float a, float b){
        return a / b;
    }

}

public class MathFuncsUserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a, b;
        a = s.nextInt();
        b = s.nextInt();
        
        System.out.println(mathOpprations.addition(a, b));
        System.out.println(mathOpprations.divition(a, b));
        
    }
}
