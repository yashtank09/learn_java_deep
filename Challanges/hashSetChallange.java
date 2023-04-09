package Challanges;

import java.util.HashSet;
import java.util.Scanner;

/**
 * HashSet challange - HackerRank
 */

public class hashSetChallange {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int T = 0;

            T = scan.nextInt();

            String[] left_string = new String[T];// {"john", "john", "john", "marry", "marry"};
            String[] right_string = new String[T];// {"tom", "mary", "tom", "anna", "anna"};

            for(int i=0; i<T; i++){
                left_string[i] = scan.next();
                right_string[i] = scan.next();
            }

            HashSet<String> hs = new HashSet<>();
            for(int i=0; i<left_string.length; i++){
                hs.add(left_string[i] + " "+ right_string[i]);
                System.out.println(hs.size());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}