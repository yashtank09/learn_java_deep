package Java_IO_Stream.FileSource;

/* 
 * File handler is usefull to play with Files & Directories
 * File: https://docs.oracle.com/javase/7/docs/api/java/io/File.html || https://www.javatpoint.com/java-file-class 
 * 
 */

import java.io.File;

public class FileHandleExample {
    public static void main(String[] args) throws Exception {
        
        File f = new File("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileSource");
        System.out.println(f.isDirectory()); // return true/false if directory or not

        String string_file_list[] = f.list();
        File file_list[] = f.listFiles();
        for (String list : string_file_list) {
            System.out.println(list);
        }
        System.out.println("-------------------");
        for (File file : file_list) {
            System.out.println(file.getPath());
        }

        System.out.println("--------------------\nFiles");
        // We can perform operations on files
        File file_self = new File("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/FileSource/Test.txt");
        
        System.out.println(file_self.lastModified());
        System.out.println(file_self.length());
        System.out.println(file_self.getAbsolutePath());
           
        // file_self.setReadOnly();
        // FileOutputStream fos = new FileOutputStream(file_self); // Runtime Error: (Access is denied)

    }
}
