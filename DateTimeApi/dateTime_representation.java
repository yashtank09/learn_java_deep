package DateTimeApi;

/** Time representation Example
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
 */
public class dateTime_representation {

    public static void main(String[] args) {
        /* 
         * this will return time in miliseconds
         *  - That was started from January 1, 1970
         *  - It will represents time in miliseconds started from 1970 till current time
         *  - This miliseconds are stored in 'long' datatype
         *  - System.currentTimeMillis()/1000/60/60/24/365 will tell us hoy many years have gone from 1970
         */
        System.out.println(System.currentTimeMillis());

        System.out.println(Long.MAX_VALUE/1000/60/60/24/365);
    }
}