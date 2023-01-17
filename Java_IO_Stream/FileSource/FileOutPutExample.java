package Java_IO_Stream.FileSource;
/* 
 * FileOutputStream example
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutExample {
    public static void main(String[] args) {
        // try with resources | FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileStream/Test.txt")) {
            String str = "This is first Java Program with FileOutputStream";
            String str2 = "\nThis is second Line of program.";
            String str3 = "\nThis is thied line of the FileOutputStream program.";
            
            fos.write(str.getBytes());

            // using byte array
            byte b[] = str2.getBytes();

            // writing word/byte by word/byte
            for(byte x: b)
                fos.write(x);

            // uses offsets
            fos.write(str3.getBytes(), 9, str3.length()-9);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
