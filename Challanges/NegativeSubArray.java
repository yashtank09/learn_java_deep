package Challanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
 * Java Negative Subarray
 * Find count of Negetive sum
 */

public class NegativeSubArray {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            List<Integer> ali = new ArrayList<>(size - 1);

            for (int i = 0; i < size; i++) {
                ali.add(sc.nextInt());
            }

            
            int negativeCount = 0;
            // loop to generate all subarrays

            for (int j = 0; j < size; j++) {
                int sum = 0;
                // loop to calculate sum of subarray from i to j
                for (int k = j; k < size; k++) {
                    
                    sum += ali.get(k);
                    
                    if (sum < 0){
                        negativeCount++;
                        System.out.println("Neg Condition..." + sum);
                    }
                }
            }

            System.out.println(negativeCount);
        }

    }
}
