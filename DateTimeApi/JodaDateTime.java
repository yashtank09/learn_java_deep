package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/** Joda Date & Time API | java.time package
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
 */
public class JodaDateTime {
    public static void main(String[] args) {
        // Old date & time Class object
        Date d = new Date();
        // d.setHours(21); // we can modify Date object which is mutable
        System.out.println(d);

        // JODA Date & Time classes
        
// 1. LocalDate class represents only Date, default date format: YYYY-MM-DD
        // DOC: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
        LocalDate ldt = LocalDate.now(); // class is already exist so we just use here
        // LocalDate ldt = LocalDate.now(Clock.systemDefaultZone()); // also showing current date
        System.out.println(ldt);
        
        LocalDate dt1 = LocalDate.now(ZoneId.of("Asia/Kolkata")); // setting up TimeZone in now() method using ZoneId class
        System.out.println(dt1);

        LocalDate dt2 = LocalDate.of(2022, Month.MARCH, 10); // if we need another date
        System.out.println(".minusDays() -> "+dt2.minusDays(5));
        System.out.println(".minus() -> " + dt2.minus(2, ChronoUnit.YEARS));

        // EpochDay is where this class starts from '1970-01-01'
        LocalDate dt3 = LocalDate.ofEpochDay(1); // params: how many days from 1970-01-01
        System.out.println(dt3);

        LocalDate dt4 = LocalDate.parse("2023-01-01"); // default format "0000-00-00"
        System.out.println(dt4);

        LocalDate dt5 = dt4.plusMonths(5); // 5 month added new object
        System.out.println(dt5);

        
        System.out.println("\nLocalTime");
// 2. LocalTime class presents only Time (not mutable), most methods are same as LocalDate
        // DOC: https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html
        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);

        System.out.println(".minusHours() -> "+lt1.minusHours(5));
        System.out.println(".minus() -> "+lt1.minus(3, ChronoUnit.HOURS));
        System.out.println(".minus() -> "+lt1.plus(3, ChronoUnit.HOURS));

        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime lt = LocalTime.parse("11:15:30", dtf);
        System.out.println(lt);

// 3. LocalDateTime class presents date & time combined
        // DOC: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
    }
}