package Java_IO_Stream.FileSource;

/* 
 * Copy a content of one file to another
 * FileInputStrea & FileOutpuStrea/FileReader
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class fileOperation{
    private String readOperation(String fileName){
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte file_data[] = new byte[fis.available()];
            fis.read(file_data);
            String fileString = new String(file_data);
            return fileString;
        } catch (IOException e) {
            return "Caught an ERROR -- > "+e;
        }
    }

    /* private byte[] readBytesArray(String fileName) throws Exception{
        FileInputStream fis = new FileInputStream(fileName);
        byte file_data[] = new byte[fis.available()];
        fis.read(file_data);
        String fileString = new String(file_data);
        return file_data;
    } */

    public void writeOperation(String destinationFile, String sourceFile){
        try (FileOutputStream fos = new FileOutputStream(destinationFile)) {
            fos.write(readOperation(sourceFile).toLowerCase().getBytes());
        } catch (Exception e) {
            System.out.println("Caught an ERROR -- > "+e);
        }
    }
}

public class FileReadPrint {
    public static void main(String[] args) {
        fileOperation excecute = new fileOperation();
        excecute.writeOperation("Destination.txt", "Source.txt");
    }
}
