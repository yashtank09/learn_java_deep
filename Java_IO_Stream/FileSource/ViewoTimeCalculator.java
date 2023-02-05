package Java_IO_Stream.FileSource;

import java.io.File;

public class ViewoTimeCalculator {
    public static void main(String[] args) {
        File details_file = new File("C:/Yash Stuff/Learning Stuff/Cources/Mastering Java SE programming. From Beginner to Master/25. Collection FrameWork/");
        
        String string_file_list[] = details_file.list();
        int file_count = 0;
        for (String file_list : string_file_list) {
            if(file_list.endsWith(".mp4")){
                // System.out.println(file_list);
                file_count++;
            }
        }
        System.out.println(file_count);
    }
}
