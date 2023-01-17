package Java_IO_Stream.FileSource;

/* 
 * FileInputStream example
 */
import java.io.FileInputStream;

public class FileInputExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileStream/Test.txt")) {
            byte b[] = new byte[fis.available()]; // .available() returns numbers of bytes in file
            // System.out.println(fis.available());
            fis.read(b);
            String str = new String(b);

            System.out.println(str);

            // printing charachter/byte by charachter/byte
            int x;
            do {
                x = fis.read();
                System.out.println((char)x);
            } while (x!=-1); // -1 means end of the file
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
