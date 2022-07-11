/**
 * fibonaccee
 */
public class fibonaccee {

    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in);
        int fib1 = 0, fib2 = 1, i, n;
        n = user_input.nextInt();

        System.out.print(fib1+" ");
        for(i=1;i<=n;i++){
            System.out.print(fib2 + " ");
            int next = fib1 + fib2;

            fib1 = fib2;
            fib2 = next;
        }
    }
}