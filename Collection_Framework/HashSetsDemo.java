package Collection_Framework;

import java.util.HashSet;
/* 
 * HashSet class
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
 *  - Ref: https://www.geeksforgeeks.org/hashset-in-java/
 *  - HashSet saves unique values
 */
public class HashSetsDemo {
    public static void main(String[] args) {
        // default constructor: Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load factor (0.75).
        HashSet<Integer> hs1 = new HashSet<>();
        
        //Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and default load factor (0.75).
        HashSet<Integer> hs2 = new HashSet<>(24);

        // Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and the specified load factor.
        HashSet<Integer> hs3 = new HashSet<>(24, 0.25f);

        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(10);

        // hs1 - object
        System.out.println(hs1);

        hs2.add(10);
        hs2.add(20);
        hs2.add(30);
        hs2.add(10);

        // hs2 - object
        System.out.println(hs2);

        hs3.add(10);
        hs3.add(20);
        hs3.add(30);
        hs3.add(10);

        // hs3 - object
        System.out.println(hs3);
    }
}
