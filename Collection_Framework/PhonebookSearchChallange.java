package Collection_Framework;
import java.util.HashMap;
import java.util.Scanner;

/* 
 * Phonebook Search
 */

public class PhonebookSearchChallange {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();
            
            // Creating HashMap
            HashMap<String, Integer> mapvalues = new HashMap<>();
            // Map<String, Integer> mapvalues = new HashMap<>();

            for(int i=0;i<n;i++)
            {
            	String name=in.nextLine();
            	int phone=in.nextInt();
                // insert .put(key, Value) to HashMap
                mapvalues.put(name, phone);
            	in.nextLine();
            }
            while(in.hasNext())
            {
            	String s = in.nextLine();

                if(mapvalues.containsKey(s)){
                    
                    System.out.println(s + "="+mapvalues.get(s));
                }else{
                    System.out.println("Not Found...");
                }
            }
        }
    }
}
