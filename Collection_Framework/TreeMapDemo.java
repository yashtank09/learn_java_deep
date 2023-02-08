package Collection_Framework;

import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

/** TreeMap example 
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html
 *  - Ref: https://www.geeksforgeeks.org/treemap-in-java/
 *  - A Red-Black tree based NavigableMap implementation.
 *  - The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
 *  - This implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations.
 */

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1,"B",4,"E"));

        tm.put(2, "C");
        tm.put(3, "D"); // this will add new (key, value) pair to the TreeMap
        tm.put(7, "G");
        
        System.out.println("CeilingEntry(6) -> "+ tm.ceilingEntry(6)); // '7=G' returns nearest (key,value) pair of given key
        System.out.println("CeilingEntry(5).getValue() -> "+ tm.ceilingEntry(5).getValue()); // '7=G' returns nearest value of given key

        System.out.println("This contains key '4' or not? "+tm.containsKey(4)); // 'true' returns true/false if it contains given key

        System.out.println("get() value of key '1' -> "+tm.get(1)); // returns value of given key

        System.out.println(tm.lastEntry()); // returns the last (key, value) pair from TreeMap

        System.out.println(tm); 

        // Entry

        Entry<Integer, String> entry1 = tm.firstEntry();
        Entry<Integer, String> entry2 = tm.lastEntry();

        System.out.println("Entry firstEntry getkey() & getValue() -> "+entry1.getKey()+"="+entry1.getValue());
        System.out.println("Entry lastEntry getvalue() & getValue() -> "+entry2.getKey()+"="+entry2.getValue());
    }
}
