package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Compare strings based on their lenght
 */

/* 
 * In this example, we create a class called CustomComparator that implements the Comparator<String> interface.
 * We override the compare() method of the interface to define our custom comparison logic.
 * In this case, we compare the strings based on their lengths.
 */

// implements comparator interface
class StringLengthComparator implements Comparator<String> {

    // custom compare logic 'Comparing strings based on their lenghts'
    @Override
    public int compare(String o1, String o2) {
        // Integer compare String o1 with String o2
        return Integer.compare(o1.length(), o2.length());
    }

}
public class ComparatorDemo2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("apple");
        list.add("banana");
        list.add("grapse");
        list.add("pear");
        list.add("orange");

        // objct of `customCompartor`
        Comparator<String> customComparator = new StringLengthComparator();

        // comparing using our custom comparator
        Collections.sort(list, customComparator);
    }
}