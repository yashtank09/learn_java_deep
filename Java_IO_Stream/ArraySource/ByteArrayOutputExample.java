package Java_IO_Stream.ArraySource;

/* 
* ByteArrayOutputStream Example
*/

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputExample {
    public static void main(String[] args) {
                
        // ByteArrayInputStream for using byte Array
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream(100)) {
            // writing bytes
            baos.write('a');
            baos.write('b');
            baos.write('c');
            baos.write('d');

            // printing bytes
            for (byte b: baos.toByteArray()) {
                System.out.println(b); // prints ascci
            }

            // wiring array of bytes to file
            baos.writeTo(new FileOutputStream("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/ArraySource/Testing.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
