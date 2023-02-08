package Java_IO_Stream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
    public static void main(String[] args) throws IOException {
        /*
         *  Create FileOutputStream
         *  --  --  --  --  --  --
         *  FileOutputStream file = new FileOutputStream("output.txt"); 
         */
        String a = "This is String that is written in file...";
        try{
            // Create a FileWriter
            FileWriter file = new FileWriter("outputPrintWriterEx.txt");
            // Create a PrintWriter
            PrintWriter write = new PrintWriter(file);
            // Writing to file  
            write.print(a);
            write.print(25+25);
            write.close();
        } 
        catch(Exception e){
            e.getStackTrace();
        }

    }
}
