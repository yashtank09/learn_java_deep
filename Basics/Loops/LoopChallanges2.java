package Basics.Loops;
import java.util.Scanner;

/**
 * LoopChallanges2
 */
public class LoopChallanges2 {

    public static void main(String[] args) {
        int numb, rem, i=0;
        Scanner sc = new Scanner(System.in);
        numb = sc.nextInt();

        while(numb>0){
            rem = numb % 10;
            System.out.println(rem);
            numb = numb/10;
            i++;
        }
        System.out.println("\nCount of digit in given number: "+i);
    }
}