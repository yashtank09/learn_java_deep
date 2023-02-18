package DateTimeApi;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/** GregorianCalendar example 
 *  - Doc: https://en.wikipedia.org/wiki/Gregorian_calendar
 */
public class GregorianCalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        
        System.out.println("\n"+gc); // return Gregorian Calander with timezone detailes
        System.out.println(gc.isLeapYear(2023)); // returns true/false if given year is leap year or not
        System.out.println(gc.get(Calendar.YEAR)); // .get(<pass fields available in class Calendar>)
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));

        System.out.println("\n..TimeZone..");
        // TimeZone class is an abstract class
        // gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles")); // we have to give TimeZone as parameter

        TimeZone tz = gc.getTimeZone();
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());
    }    
}