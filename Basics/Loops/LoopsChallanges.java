package Basics.Loops;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class LoopsChallanges {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\n\nEnter Number for Table: ");
            int value = sc.nextInt();
            if(value!=0){
                for(int i=1; i<=10; i++){
                    System.out.println(value + " X " + i + " = " + value*i);
                }
            }else{
                System.out.println("Zero '0' X Zero '0' = Always Zero '0'");
            }

            // -- Sum of N numbers 
            System.out.print("\n\n\nEnter number for some of it's range: ");
            int sum=0, total = sc.nextInt();

            for(int j=0; j<=total; j++){
                sum += j;
            }
            System.out.printf("Sum of %d range is %d", total, sum);
            
            // Factorial
            System.out.print("\n\n\nEnter N value for Factorial: ");
            int factorial=1, FactValue = sc.nextInt();

            for(int x=1; x<=FactValue; x++){
                factorial = factorial*x;
            }
            System.out.printf("Factorial of %d! number is %d", FactValue, factorial);


        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
