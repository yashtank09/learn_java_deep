package Java_IO_Stream.ArraySource;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* 
 * ByteArrayInputStream example
 */
public class ByteArrayInputExample {
    public static void main(String[] args) {

        byte[] byte_array = {'a', 'b', 'c', 'd','g','h','i','j','k','l'};
        
        // ByteArrayInputStream for using byte Array
        try (ByteArrayInputStream bais = new ByteArrayInputStream(byte_array)) {
            
            // int x;
            // reading one byte at a time
            /* while((x=bais.read())!=-1){
                System.out.print((char)x);
            } */

            // reading bytes at one time
            String byteString = new String(bais.readAllBytes());

            System.out.println(byteString);
            System.out.println(bais.markSupported()); // return true/false that the byte array is supported mark and reset methods or not

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
