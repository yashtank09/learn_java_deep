package Collection_Framework;

import java.util.BitSet;

/** BitSet class example
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/BitSet.html
 *  - Ref: https://www.geeksforgeeks.org/bitset-class-java-set-1/
 */
public class BitSetDemo {

    public static void main(String[] args) {
        // BitSet 1
        BitSet bs1 = new BitSet();

        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);

        // BitSet 2
        BitSet bs2 = new BitSet();

        // bs2.set(0);
        bs2.set(1);
        // bs2.set(2);
        bs2.set(3);
        // bs2.set(4);
        bs2.set(5);
        // bs2.set(6);
        bs2.set(7);
        // bs2.set(8);

        // bs1.and(bs2); // AND operation for (BitSet 1 AND BitSet 2)
        
        // bs1.or(bs2); // OR operation for (BitSet 1 AND BitSet 2)

        bs1.flip(0, bs1.length()); // Check which is OFF and flip it to ON value
        System.out.println(bs1);
    }
}