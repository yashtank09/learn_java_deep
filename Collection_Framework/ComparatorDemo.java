package Collection_Framework;

import java.util.Arrays;
import java.util.Comparator;

/** Comparator Interface Example
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
 *  - Ref: https://www.geeksforgeeks.org/comparator-interface-java/
 */

class MyComparator implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        // condition will reversing order 
        if(i1<i2) {
            return 1; // actually return -1 
        } else if(i1>i2) {
            return -1; // actually return 1
        } else {
            return 0;
        }
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Integer a[] = {2,4,6,8,1,3,5,7};

        Arrays.sort(a, new MyComparator());

        for (Integer integer : a) {
            System.out.println(integer);
        }
    }
}