import java.io.*;
import java.util.Calendar;
import java.util.Locale;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     *  Learn More about Calander class in: https://www.javatpoint.com/java-util-calendar
     */

    public static String findDay(int month, int day, int year) {
        // int d = Integer.valueOf(day);
        // int m = Integer.valueOf(month);
        // int y = Integer.valueOf(year);
        // LocalDate date = LocalDate.of(y, m, d);
        // return date.getDayOfWeek().toString();

        // Calandar.getInstance();
        // This method is used with calendar object to get the instance of calendar according to current time zone set by
        // java runtime environment
        Calendar cal = Calendar.getInstance();
        
        // cal.set();
        // Sets the specified calendar field by the specified value.
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.DAY_OF_MONTH, day);
        
        // cal.getDisplayName(int field, int style, Locale locale)
        String day_of_week = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        
        return day_of_week;
    }

}

public class DayNameByDate {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}