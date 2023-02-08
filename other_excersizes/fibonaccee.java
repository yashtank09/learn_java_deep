package other_excersizes;
import java.util.Scanner;

/**
 * fibonaccee
 */
public class fibonaccee {

    public static void main(String[] args) {

        try (Scanner user_input = new Scanner(System.in)) {
        }
        /*
         * int fib1 = 0, fib2 = 1, i, n;
         * n = user_input.nextInt();
         * 
         * System.out.print(fib1 + " ");
         * for (i = 1; i <= n; i++) {
         * System.out.print(fib2 + " ");
         * int next = fib1 + fib2;
         * 
         * fib1 = fib2;
         * fib2 = next;
         * }
         */
        int a = 0, b = 1, c, n = 10;

        System.out.print(a + ",");
        for (int i = 0; i < n; i++) {
            System.out.print(b + ",");
            c = a + b;
            a = b;
            b = c;
        }

    }
}