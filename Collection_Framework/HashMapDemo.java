package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

/** HashMap example 
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
 *  - Ref: https://www.javatpoint.com/java-hashmap
 */

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(0, "A", 1,"B",4,"E"));hm.put(2, "C");
        hm.put(3, "D"); // this will add new (key, value) pair to the HashMap
        hm.put(7, "G");
        
        System.out.println("This contains key '4' or not? "+hm.containsKey(4)); // 'true' returns true/false if it contains given key

        System.out.println("get() value of key '1' -> "+hm.get(1)); // returns value of given key

        System.out.println(hm); 

    }
}
