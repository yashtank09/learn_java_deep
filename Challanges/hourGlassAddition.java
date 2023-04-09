package Challanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/* 
 * Program of 2D array
 * - Find maximum sum of HourGlass
 */

public class hourGlassAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        for(int i=0; i<=3; i++){
            for(int j=0; j<=3; j++){
                sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) 
                + arr.get(i+1).get(j+1) 
                + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println("\n"+maxSum);
        bufferedReader.close();
    }
}
