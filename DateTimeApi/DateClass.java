package DateTimeApi;

import java.util.Date;

/** Date class example
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
 *  - This date class represents time from 1900
 */
@SuppressWarnings("deprecated")
public class DateClass {

    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println(date); // showing current date and time
        System.out.println(date.getTime()); // returns time in miliseconds
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());


        // Constructor
        System.out.println();
        Date d1 = new Date("1/1/2000"); // taking string date as parameter
        System.out.println(d1);
    }
}