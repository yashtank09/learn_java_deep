package Collection_Framework;

// import java.util.Comparator;
import java.util.PriorityQueue;

/* 
 * PriorityQueue class
 *  - Explanation: https://www.youtube.com/watch?v=wptevk0bshY
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html
 */

/* // for changing priority to lowest priority
class MyComp implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
         if(o1<o2) return 1;
         if(o1>o2) return -1;
         return 0;
    }
} */

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());

        // add takes log n time
        // it will insert elements based on their priority
        System.out.println("Added elements...");
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        // Priority queue arrange them and add as different then insertion
        pq.forEach(n->System.out.println(n));

        System.out.println("\nAfter deletion...");
        pq.poll();

        pq.forEach(n->System.out.println(n));

    }
}
