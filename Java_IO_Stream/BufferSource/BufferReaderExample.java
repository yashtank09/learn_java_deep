package Java_IO_Stream.BufferSource;

/* 
 * Buffer Reader - which is exactly same as BufferedInputStream one difference is we can use BufferedReader for UNICODES/Charachters
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/BufferSource/buffs.txt")){
            try (BufferedReader br = new BufferedReader(fr)) {
                // buffer is Makr & Reste supported, but FileInputStream is not
                System.out.println("\nIs FileInputStrea mark Supported? " + fr.markSupported());
                System.out.println("Is BufferedInputStream mark Supported? " + br.markSupported());

                System.out.println();

                // reading one-one charachter from file
                System.out.println((char)br.read());
                System.out.println((char)br.read());
                System.out.println((char)br.read());
                System.out.println((char)br.read());
                System.out.println((char)br.read());
                br.mark(10); // marking 10 charachters from here
                System.out.println((char)br.read());
                System.out.println((char)br.read());
                System.out.println((char)br.read());
                br.reset(); // it will return back at marked place and again read from there
                System.out.println((char)br.read());
                System.out.println((char)br.read());
                System.out.println((char)br.read());

                System.out.println("String "+br.readLine()); // will prints remaining string from buffer
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
