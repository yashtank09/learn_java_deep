import java.util.*;

public class hashmaptutor{
    public static void main(String[] args) {
        
        //Creating HashMap
        HashMap<String, Integer> m = new HashMap<>();
        
        // Insert Key and Value to our HashMap
        m.put("Yash", 987654321);
        m.put("Akash", 56789039);
        m.put("Parth", 654898756);
        m.put("Devang", 985476525);
        m.put("Jigar", 659896154);

        // getting key value by .get() method
        System.out.println(m.get("Akash"));

        Set<String> keys = m.keySet();

        for(String i:keys){
            System.out.println(i + " : " + m.get(i));
        }

        System.out.println();

        // Print whole HashMap using nested Interface Map | Entry using Map.Entry<> and use method getKey() and getValue()
        Set<Map.Entry<String, Integer>> vals = m.entrySet();
        
        //Map.Entry<String, Integer> get all values in entrySet()
        for(Map.Entry<String, Integer> e: vals){
            System.out.println(e.getKey()+ " " +e.getValue());
        }
    }
}
