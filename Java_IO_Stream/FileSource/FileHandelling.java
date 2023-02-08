package Java_IO_Stream.FileSource;
import java.util.*;

public class FileHandelling {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Using For loop
            for(int i = 1; sc.hasNextLine(); i++){
                System.out.println(i + " " + sc.nextLine());
            }
        }

        // int i=1;
        // while (sc.hasNext()) {
        //     String s=sc.nextLine();
        //     System.out.println(i + " " + s);
        //     i++;
        // }

        /*
            This will print every live after hiting enter and the challange was the same and I was confused about that.
        */
        // int count = 0;
        // while(scn.hasNext()){
        //     String s = scn.nextLine();
        //     System.out.print(++count + " " + s);   
        // }
        // scn.close();
        
    }
}
