import java.io.*;
import java.util.*;

public class FileHandelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int count = 0;
        // String a = scn.nextLine();
        // while(a != null){
        //     System.out.println(count++ + " " + a);
        //     a = scn.nextLine();
        // }
        // scn.close();

        // int i=1;
        // while (sc.hasNext()) {
        //     String s=sc.nextLine();
        //     System.out.println(i + " " + s);
        //     i++;
        // }

        // Using For loop
        for(int i = 1; sc.hasNextLine(); i++){
            System.out.println(i + " " + sc.nextLine());
        }



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
