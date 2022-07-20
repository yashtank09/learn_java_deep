import java.util.Scanner;

public class ModulOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();

        float c = (float) a % b; //Type cast
        float d = (float) a / b;

        System.out.println("Ans %: " + c);
        System.out.println("Ans /: " + d);

        
    }
}
