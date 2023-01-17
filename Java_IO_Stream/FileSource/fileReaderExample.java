package Java_IO_Stream.FileSource;
/* 
 * FileReader class example
 */
import java.io.FileReader;

public class fileReaderExample {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileStream/Test.txt")) {
            // printing charachter/byte by charachter/byte
            int x;
            while((x=fis.read())!=-1){
                System.out.print((char)x);
            } // -1 means end of the file

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
