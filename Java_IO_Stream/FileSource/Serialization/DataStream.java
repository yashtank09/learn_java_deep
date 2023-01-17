package Java_IO_Stream.FileSource.Serialization;
/* 
 * DataInputStream & DataOutputStream class to store properties of class into file
 * Stored data will be in binary format because data object will be stored in different datatypes
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class fileDataWriter {
    private String filePath;
    
    public fileDataWriter(String filePath){
        this.filePath = filePath;
    }

    private FileOutputStream fetchFile() throws Exception {
        FileOutputStream fos = new FileOutputStream(filePath);
        return fos;
    }
    
    public void addingValues(int rollNumber, String studentName, String studentDepartmetn){
        // DataOutputStream attatched with FileOutputStream for writing in file
        try (DataOutputStream di = new DataOutputStream(fetchFile())) {
            StudentDetails sd = new StudentDetails(rollNumber, studentName, studentDepartmetn);
            
            // printing object content of StudentDetails class using PrintStream
            // here we are solving 
            di.writeInt(sd.rollNumber);
            di.writeUTF(sd.studentName);
            di.writeUTF(sd.studentDepartment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class fileDataReader {
    private String filePath;
    
    public fileDataReader(String filePath){
        this.filePath = filePath;
    }

    public void readData() throws Exception{
        try (FileInputStream fis = new FileInputStream(filePath)) {
            DataInputStream bfr = new DataInputStream(fis);
            StudentDetails sd = new StudentDetails(bfr.readInt(), bfr.readUTF(), bfr.readUTF());
            System.out.println("Roll no.: "+sd.rollNumber);
            System.out.println("Name: "+sd.studentName);
            System.out.println("Department: "+sd.studentDepartment);   
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}

public class DataStream {
    public static void main(String[] args) {
        fileDataWriter fw = new fileDataWriter("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileSource/Test/Student2.txt");
        fw.addingValues(121, "Yash J Tank", "Arts");

        fileDataReader fr = new fileDataReader("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileSource/Test/Student2.txt");
        try {
            fr.readData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
