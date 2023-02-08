package Basics;
import java.io.*;

/* 
 * Print whole Multiplication table using user input
 */

public class multiplication_Table {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            if(N >= 2 || N <= 20){
                // for(int i=1;i<=10;i++){
                //     System.out.println(N+" x "+i+" = "+N*i );
                // }
                for(int i = 1; i <= 10; i++){
                    // int Q = N * i;
                    // System.out.printf("%d X %d = %d\n", N, i, Q);
                    System.out.println(N + " x " + i + " = " + N*i);
                }
            bufferedReader.close();
        }
    }
}