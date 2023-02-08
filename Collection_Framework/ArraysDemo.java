package Collection_Framework;

import java.util.Arrays;

/** Arrays Example
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
 *  - Ref: https://www.geeksforgeeks.org/array-class-in-java/
 */
public class ArraysDemo {

    public static void main(String[] args) {
        int a[] = {2,4,6,8,1,3,5,7};
        int b[] = {2,4,6,8,1,3,5,7};

        System.out.println("\nComparing two arrays return 0 if compaired 1 if not -> "+Arrays.compare(a, b)); // if compare return - 0 | if not return - 1

        int c[] = Arrays.copyOf(a, a.length); // return a array with new length

        Arrays.sort(c); // sorting array

        System.out.println("New array with length 4 with sorted function.");
        for (int i : c) {
            System.out.print(i+" ");
        }

        System.out.println("\nSearching Array using Binary Search -> "+Arrays.binarySearch(c, 3)); // binarySearch method (array shoud be sorted)

        System.out.println("\nFilling initialised Arrays with method fill.");
        int d[] = new int[5];

        Arrays.fill(d, 10);

        for (int i : d) {
            System.out.print(i+" ");
        }
    }
}