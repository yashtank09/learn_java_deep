package Collection_Framework;

import java.util.LinkedHashSet;

/** LinkedHashSet example 
 *  - LinkedHashSet is same as HashSet difference is that LinkedHashSet is not sorted.
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html
 */

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        // This will append to the set in same order below ** Duplicates are not allowed
        lhs.add("A");
        lhs.add("D");
        lhs.add("B");
        lhs.add("F");
        lhs.add("C");
        lhs.add("H");
        lhs.add("E");
        lhs.add("G");

        System.out.println(lhs);
    }
}
