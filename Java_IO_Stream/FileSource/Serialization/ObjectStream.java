package Java_IO_Stream.FileSource.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ObjectInputStream & ObjectOutputStream
 *  - for achiving serialization & deserialization
 *  - entire object will passed for writing and reading file
 *  - no need to write or read data one by one
 *  - class must have implements Serializable interface
 *  - static & transient method can not be stored in the file
 */
class fileObjectWriter {
    private String filePath;
    
    public fileObjectWriter(String filePath){
        this.filePath = filePath;
    }

    private FileOutputStream fetchFile() throws Exception {
        FileOutputStream fos = new FileOutputStream(filePath);
        return fos;
    }
    
    public void addingValues(int rollNumber, String studentName, String studentDepartmetn){
        // DataOutputStream attatched with FileOutputStream for writing in file
        try (ObjectOutputStream oos = new ObjectOutputStream(fetchFile())) {
            StudentDetails sd = new StudentDetails(rollNumber, studentName, studentDepartmetn);
            oos.writeObject(sd); // storing entire object in file            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class fileObjectReader {
    private String filePath;
    
    public fileObjectReader(String filePath){
        this.filePath = filePath;
    }

    public void readData() throws Exception{
        try (FileInputStream fis = new FileInputStream(filePath)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            StudentDetails stud = (StudentDetails) ois.readObject();
            System.out.println(stud);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}

 public class ObjectStream {
    public static void main(String[] args) {
        fileObjectWriter fw = new fileObjectWriter("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileSource/Test/Student3.txt");
        fw.addingValues(21, "Yash Rajpal", "Management");

        fileObjectReader fr = new fileObjectReader("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileSource/Test/Student3.txt");
        try {
            fr.readData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}