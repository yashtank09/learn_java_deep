package Challanges;

import java.util.ArrayList;
import java.util.Scanner;

public class javaArrayListFindQuery {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<ArrayList<Integer>> dynamic_array = new ArrayList<>();
            /*
             * ArrayList<ArrayList<Integer>> dynamic_array = new
             * ArrayList<ArrayList<Integer>>();
             * 
             * dynamic_array.add(new ArrayList<Integer>());
             * dynamic_array.get(0).add(0, 45);
             * dynamic_array.add(new ArrayList<Integer>(Arrays.asList(56, 67, 89)));
             * dynamic_array.get(1).add(0, 67);
             * dynamic_array.get(1).add(4, 456);
             * dynamic_array.add(2, new ArrayList<>(Arrays.asList(23, 32)));
             * dynamic_array.add(new ArrayList<Integer>(Arrays.asList(83, 64, 77)));
             * dynamic_array.add(new ArrayList<>(Arrays.asList(8)));
             */
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int d = sc.nextInt();
                ArrayList<Integer> ali = new ArrayList<>();
                for (int j = 0; j < d; j++) {
                    int item = sc.nextInt();
                    ali.add(item);
                }
                dynamic_array.add(ali);
            }

            System.out.println(dynamic_array);
            
            int qn = sc.nextInt();
            for(int i=0; i<qn; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                try {
                    System.out.println(dynamic_array.get(x-1).get(y-1));
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }
        }

    }
}
