package Java_IO_Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class floatArrayStudentChallange {
    public static void main(String[] args) {
        float decimalNumbers[] = {2.5f, 10.5f, 33.33f, 20.1f, 17.3f};
        
        // writing data
        try (FileOutputStream fos = new FileOutputStream("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/floatNumbers.txt")) {
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(decimalNumbers.length-1);
            for(int i=0; i<decimalNumbers.length; i++){
                dos.writeFloat(decimalNumbers[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // retriving data
        try (FileInputStream fis = new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/floatNumbers.txt")) {
            DataInputStream dis = new DataInputStream(fis);
            int length = dis.readInt();
            float data;
            for(int i=0; i<=length; i++){
                data = dis.readFloat();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
