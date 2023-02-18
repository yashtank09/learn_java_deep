package DateTimeApi;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * DateTimerFormatter class
 * - DOC: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
 *      
 *      y = Year
 *      M = Month
 *      d = Date
 * 
 *      h = Hours (12Hours)
 *      H = Hours (23Hours)
 *      m = Minute
 *      s = Seconds
 *      S = Milliseconds
 *      z = Time Zone
 *      Z = offset
 * 
 */
public class DateTimerFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(df.format(ldt));

        ZonedDateTime zdt = ZonedDateTime.now();
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH.mm.ss z Z");
        System.out.println(df2.format(zdt));

        // ChronoField - A standard set of fields.
        System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ldt.get(ChronoField.HOUR_OF_AMPM));
        System.out.println(ldt.get(ChronoField.MICRO_OF_SECOND));
        System.out.println(ldt.get(ChronoField.ALIGNED_WEEK_OF_MONTH));
        System.out.println(ldt.get(ChronoField.AMPM_OF_DAY));
        System.out.println(ldt.get(ChronoField.YEAR));
        System.out.println(LocalDateTime.MAX); // returns max date
    }
}