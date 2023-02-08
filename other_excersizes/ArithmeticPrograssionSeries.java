package other_excersizes;
import java.util.Scanner;

/*
 * Arithmetic Prograssion series
 *      - 5, 10, 15, 20, 25, 30 | a=5{Starting Number}, d=5{Differance of values in serise}, t=30{print untill it's became t}
 *      - 3, 8, 13, 18, 23, 28
 *      - 7, 9, 11, 13, 15
 * 
 */
public class ArithmeticPrograssionSeries {
    public static void main(String[] args) {
        int a, d, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting value for AP: ");
        a = sc.nextInt();
        System.out.print("\nEnter differance value for AP: ");
        d = sc.nextInt();
        System.out.print("\nEnter last value for AP: ");
        t = sc.nextInt();
        System.out.println();
        for (int i = a; i <= t; i = i + d) {
            System.out.print(i + ", ");
        }
    }
}
