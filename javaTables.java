import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class javaTables {
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