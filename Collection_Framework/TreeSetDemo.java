package Collection_Framework;

import java.util.List;
import java.util.TreeSet;

/** TreeSet Demo
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html
 *  - Ref: https://www.geeksforgeeks.org/treeset-in-java-with-examples/
 */

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 20, 30, 40, 10, 50));

        ts.add(25); // it will add between 20 and 30

        ts.ceiling(55); // finds nearest element

        System.out.println(ts);
    }
}
