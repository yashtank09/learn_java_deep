package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Linkedlist class
 *  - This is the same example like ArrayList but we are using different datastructure here 'LikedList'.
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
 *  - Doc: https://www.geeksforgeeks.org/linked-list-in-java/
 */
public class LinkedListDemo1 {

    public static void main(String[] args) {
        LinkedList<Integer> lil1 = new LinkedList<>(); // generic, should give object type

        LinkedList<Integer> lil2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        lil1.add(10); // adding new element from the last
        lil1.add(0, 5); // adding new element form specified index
        
        // al1.addAll(al2); // will insert from the last
        lil1.addAll(1, lil2); // will insert from specified index

        lil1.add(5, 70);

        System.out.println(lil1);

        // some of the extra methods for LinkedList class
        // this methods adds elements at first and last position
        lil1.addFirst(3);
        lil1.addLast(200);

        System.out.println(lil1);

        // this methods removes first and last elements form list
        lil1.removeFirst();
        lil1.removeLast();

        System.out.println("contains '10' or not"+lil1.contains(10)); // 'true' returns true/false if list contains given element
        System.out.println("contains '25' or not"+lil1.contains(25)); // 'false'

        System.out.println("get element at index '5' "+lil1.get(5)); // '90' return element of given index
        System.out.println("get element at index '3' "+lil1.get(3)); // '70'
        
        System.out.println("indexOf element '70' "+lil1.indexOf(70)); // '3' return first index of given element
        System.out.println("lastindexOf element '70' "+lil1.lastIndexOf(70)); // '5' return last index of given element
        
        lil1.set(6, 100); // change given element at given index

        System.out.println("Changed element at index '6' "+lil1); // Updated ArrayList

        // Iteration
        
        System.out.println("\nUsing simple for loop - ");
        for(int i=0; i<lil1.size(); i++){
            // System.out.println(al1[i]); not an array it's ArrayList
            System.out.print(lil1.get(i)+", ");
        }

        System.out.println("\nUsing for each loop -");
        for (var x : lil1) {
            System.out.print(x +", ");
        }

        // Returns an iterator over the elements in this list in proper sequence.
        Iterator<Integer> it = lil1.iterator();

        // Iterators allows only forward direction iteration of list
        System.out.println("\nUsing Iterator ");
        while(it.hasNext()){
            System.out.print(it.next()+", ");
        }

        /*
         * Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
         * The specified index indicates the first element that would be returned by an initial call to next. 
         * An initial call to previous would return the element with the specified index minus one.
         */
        ListIterator<Integer> lit = lil1.listIterator();

        // ListIterator allows bydirectional iteration of list
        System.out.println("\nUsing ListIterator ");
        while(lit.hasNext()){
            System.out.print(lit.next()+", ");
        }

        System.out.println("\nListIteration using for loop");
        for(ListIterator<Integer> lit2 = lil1.listIterator(); lit2.hasNext();){
            System.out.print(lit2.next()+", ");
        }


        // forEach method will scann through all the elements in the lsit
        System.out.println("\nforeach method of List class");
        lil1.forEach(n->System.out.print(n+", ")); // can use lambda expression

        System.out.println("\nforeach method of List class using Scoperesolution operator (::) ");
        lil1.forEach(System.out::println); // can use lambda expression

        System.out.println("\nshow() conditional method...");
        lil1.forEach(n->show(n)); // used lambda to call show method
    }

    static void show(int n){
        if(n>60)
            System.out.println(n);
    }
}