package Java_IO_Stream.FileSource;

/* 
 * Random Access file class
 * RandomAcessFile: https://docs.oracle.com/javase/8/docs/api/java/io/RandomAccessFile.html
 */

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
    try (RandomAccessFile raf = new RandomAccessFile("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileSource/randomAccess.txt", "rw")) {
        
        // {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'}
        System.out.println((char)raf.read()); // Pointer -> 'A'
        System.out.println((char)raf.read()); // Pointer -> 'B'
        System.out.println((char)raf.read()); // Pointer -> 'C'
        raf.write('d'); // here file pointer is pointing 'D' and override it with 'd'
        System.out.println((char)raf.read()); // Pointer -> 'E'
        raf.skipBytes(3); // pointer pointing -> 'F' and from there skipps 3 bytes
        System.out.println((char)raf.read()); // Pointer -> 'I' after skipping the 3 bytes
        raf.seek(3);
        System.out.println(raf.getFilePointer());
        raf.seek(raf.getFilePointer()+2);
        System.out.println((char)raf.read());

    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
