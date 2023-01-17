package Java_IO_Stream.FileSource.Serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * PrintStream Example | Serialization for storing object of class into the file
 * Also read file data using class object and print it using BufferedReader and InputStreamReader
 */

class fileWriter {
    private String filePath;
    
    public fileWriter(String filePath){
        this.filePath = filePath;
    }

    private FileOutputStream fetchFile() throws Exception {
        FileOutputStream fos = new FileOutputStream(filePath);
        return fos;
    }
    
    public void addingValues(int rollNumber, String studentName, String studentDepartmetn){
        // PrintStream attatched with FileOutputStream for writing in file
        try (PrintStream pi = new PrintStream(fetchFile())) {
            StudentDetails sd = new StudentDetails(rollNumber, studentName, studentDepartmetn);
            
            // printing object content of StudentDetails class using PrintStream
            pi.println(sd.rollNumber);
            pi.println(sd.studentName);
            pi.println(sd.studentDepartment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class fileReader {
    private String filePath;
    
    public fileReader(String filePath){
        this.filePath = filePath;
    }

    public void readData() throws Exception{
        try (FileInputStream fis = new FileInputStream(filePath)) {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
            StudentDetails sd = new StudentDetails(Integer.parseInt(bfr.readLine()), bfr.readLine(), bfr.readLine());
            System.out.println("Roll no.: "+sd.rollNumber);
            System.out.println("Name: "+sd.studentName);
            System.out.println("Department: "+sd.studentDepartment);   
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}

public class PrintStreamExample {
    public static void main(String[] args) {
        fileWriter fw = new fileWriter("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileSource/Test/Student1.txt");
        fw.addingValues(102, "Yash Tank", "Computer Applications");

        fileReader fr = new fileReader("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileSource/Test/Student1.txt");
        try {
            fr.readData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}