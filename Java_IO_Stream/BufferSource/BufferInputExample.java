package Java_IO_Stream.BufferSource;
/* 
 * BufferInputStream example
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputExample {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/BufferSource/buffs.txt");
        try (BufferedInputStream bis = new BufferedInputStream(fis)) {
            
            // reading byte by byte
            /* int x;
            while((x=bis.read())!=-1){
                System.out.print((char) x);
            } */

            // buffer is Makr & Reste supported, but FileInputStream is not
            System.out.println("\nIs FileInputStrea mark Supported? " + fis.markSupported());
            System.out.println("Is BufferedInputStream mark Supported? " + bis.markSupported());

            System.out.println();

            // reading one-one charachter from file
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            bis.mark(10); // marking 10 charachters from here
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            bis.reset(); // it will return back at marked place and again read from there
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());

        }
    }
}
