package Collection_Framework;

import java.util.LinkedHashMap;
import java.util.Map;

/** LinkedHashMap Example
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html
 *  - Ref: https://www.geeksforgeeks.org/linkedhashmap-class-in-java/
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        
        // for limiting the size we have to override method removeEldestEntry() using annanoumous class
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry<Integer, String> e){
                return size()>5;
            }
        }; // (initialCapacity, loadFactor, accessOrder)

        // adding LikedHashMap
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");

        // Order priority as usage
        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(3);

        // Adding one more element then size
        lhm.put(6, "F");

        // Printing LinkedHashedMap using forEach function
        lhm.forEach((k,v)->System.out.println(k+"="+v));

        System.out.println(s);
    }
}