package DateTimeApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Date & Time Class
 */
public class DateTimeClasses {
    public static void main(String[] args) {

        /*
         * ZonedDateTime - ZonedDateTime is an immutable representation of a date-time with a time-zone.
         * - This class stores all date and time fields, to a precision of nanoseconds, and a time-zone, with a zone offset used to handle ambiguous local date-times.
         * - For example, the value "2nd October 2007 at 13:45.30.123456789 +02:00 in the Europe/Paris time-zone" can be stored in a ZonedDateTime.
         * - DOC: https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html
         */
        ZonedDateTime zdt = ZonedDateTime.now();
        ZonedDateTime zdtid = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);
        System.out.println(zdtid);

        /*  
         * OffsetDateTime - OffsetTime is an immutable date-time object that represents a time, often viewed as hour-minute-second-offset.
         * - This class stores all time fields, to a precision of nanoseconds, as well as a zone offset. For example, the value "13:45.30.123456789+02:00" can be stored in an OffsetTime.
         * - DOC: https://docs.oracle.com/javase/8/docs/api/java/time/OffsetTime.html
         */
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);

        /* 
         * MonthDay - DOC: https://docs.oracle.com/javase/8/docs/api/java/time/MonthDay.html
         * YearMonth - DOC: https://docs.oracle.com/javase/8/docs/api/java/time/YearMonth.html
         * Year - DOC: https://docs.oracle.com/javase/8/docs/api/java/time/Year.html
         */

        /* 
         * Period - This class models a quantity or amount of time in terms of years, months and days. See Duration for the time-based equivalent to this class.
         * - DOC: https://docs.oracle.com/javase/8/docs/api/java/time/Period.html
         */
        Period per = Period.of(1, 6, 0);
        System.out.println(per.addTo(LocalDate.now())); // adding above period to current date

        /* 
         * Duration - This class models a quantity or amount of time in terms of seconds and nanoseconds.
         * - It can be accessed using other duration-based units, such as minutes and hours.
         * - In addition, the DAYS unit can be used and is treated as exactly equal to 24 hours, thus ignoring daylight savings effects. 
         * - See Period for the date-based equivalent to this class.
         * - DOC: https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html
         */
        
        /* 
         * Instant - This class models a single instantaneous point on the time-line. This might be used to record event time-stamps in the application.
         * - DOC: https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html
         */

        Instant i = Instant.now();
        System.out.println(i);
    }
}