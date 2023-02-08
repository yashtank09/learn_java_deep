package Collection_Framework;

import java.util.Enumeration;
import java.util.Hashtable;

/** Hashtable class example
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html 
 *  - Ref: https://www.geeksforgeeks.org/hashset-in-java/
 */

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        // adding value to Hashtable
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");

        String s = (String) ht.get(4);

        System.out.println(s);

        // As Hashtable is not an generic class it has no iterator
        // Hashtable is have Enumarotor for traversion  
        Enumeration enm = ht.elements();

        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement()); // Showing values
        }

        // System.out.println(ht);

        // generic version
        Hashtable<Integer, String> htg = new Hashtable<>();

        htg.put(1, "a");
        htg.put(3, "c");

        System.out.println(htg);

        // Compute method
        ht.compute(2, (k,v)->v+"Y");

        ht.computeIfAbsent(7, (k)->"Z"+k);

        System.out.println(htg);
    }
}
