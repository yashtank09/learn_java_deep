package Basics;
import java.util.Scanner;

/**
 * Geometric Progression Series
 * - 2, 6, 18, 54... a = 2{Starting Point}, r = 6/2 = 3 {avrage of decending
 * values}, t = 60 {till you want to print}
 * - 5, 10, 20, 40, 80, 160...
 * 
 */
public class GPSeries {

    public static void main(String[] args) {
        int a, r, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting value for GP: ");
        a = sc.nextInt();
        System.out.print("\nEnter Common ratio for GP: ");
        r = sc.nextInt();
        System.out.print("\nEnter last value for GP: ");
        t = sc.nextInt();
        System.out.println();
        // for (int i = a; i <= t; i = i * r) {
        // System.out.print(i + ", ");
        // }
        int term = a;
        for (int i = 0; i < t; i++) {
            System.out.print(term + ", ");
            term = term * r;
        }
    }
}