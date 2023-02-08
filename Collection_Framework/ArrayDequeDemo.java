package Collection_Framework;

import java.util.ArrayDeque;
/** ArrayDeque Example 
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
 *  - Ref: https://www.geeksforgeeks.org/arraydeque-in-java/
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offerLast(10);
        adq.offerLast(20);
        adq.offerLast(30);
        adq.offerLast(40);
        adq.offerLast(50);


        // adq.pollLast(); // it will be stack - (inserting form last and deleting from last)
        // adq.pollFirst(); // it will be que - (inserting form last and deleting from first)

        /* adq.offerFirst(1);
        adq.offerFirst(2);
        adq.offerFirst(3);
        adq.offerFirst(4);
        adq.offerFirst(5);  
        // will added from where we started to offerLast */

        adq.forEach(System.out::println);
    }
}
