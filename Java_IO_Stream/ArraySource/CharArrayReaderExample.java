package Java_IO_Stream.ArraySource;

/* 
 * CharArrayReader example - can read character/unicode array
 */

import java.io.CharArrayReader;

public class CharArrayReaderExample {
    public static void main(String[] args) {
        char[] char_array = {'a', 'b', 'c', 'd','g','h','i','j','k','l'};

        try (CharArrayReader car = new CharArrayReader(char_array)) {
            int x;
            // reading one character at a time
            while((x=car.read())!=-1){
                System.out.print((char)x);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
