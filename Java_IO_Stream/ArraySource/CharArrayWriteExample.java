package Java_IO_Stream.ArraySource;
/* 
 * CharArrayWriter - can use charachters/unicodes also.
 */
import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriteExample {
    public static void main(String[] args) {
        try (CharArrayWriter caw = new CharArrayWriter()) {
            // writing character
            caw.write('a');
            caw.write('b');
            caw.write('c');
            caw.write('d');

            // printing characters
            for (char ch_aray : caw.toCharArray()) {
                System.out.print(ch_aray);
            }

            // writing characters to fiels | here .writeTo() method is outs the FileWriter's object
            caw.writeTo(new FileWriter("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/ArraySource/Testing.txt"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
