package Collection_Framework;

import java.util.TreeSet;

/*
 * Comparable interface
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
 *  - Ref: https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/
 *      - Explaining Comparable interface using coordinate system (https://en.wikipedia.org/wiki/Coordinate_system | https://byjus.com/maths/coordinate-system/).
 */

class Point implements Comparable{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x="+x+" y="+y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point)o;
        if(this.x<p.x){
            return -1;
        } else if(this.x>p.x){
            return 1;
        } else {
            if(this.y<p.y){
                return -1;
            } else if(this.y>p.y){
                return 1;
            } else {
                return 0;
            }
        }
    }
}

/* 
    -- Exception cause if we do not implements Comparable interface and prints the object --

Exception in thread "main" java.lang.ClassCastException: class Collection_Framework.Point cannot be cast to class java.lang.Comparable (Collection_Framework.Point is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
        at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
        at java.base/java.util.TreeMap.put(TreeMap.java:785)
        at java.base/java.util.TreeMap.put(TreeMap.java:534)
        at java.base/java.util.TreeSet.add(TreeSet.java:255)
        at Collection_Framework.ComparableInterfaceDemo.main(ComparableInterfaceDemo.java:14)
 */

public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(2,1));
        ts.add(new Point(3,2));

        // because we are using TreeSet it will be printed in sorted order
        System.out.println(ts);
    }
}
