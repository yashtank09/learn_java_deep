import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listOperationsbyindex {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        
        // create List by 
        List<Integer> L = new ArrayList<>();

        for(int i=0; i < N; i++){
            L.add(read.nextInt());    
        }

        int Q = read.nextInt();
        for(int i=0; i < Q; i++){
            
            String S = read.next();
            if(S.equals("Insert")){
                
                // Insert element to specified index
                int index = read.nextInt();
                int value = read.nextInt();
                L.add(index, value);

            } 
            else{ // "Delete"
                
                // Remove element from specified index
                int index = read.nextInt();
                L.remove(index);

            }
        }
        read.close();

        for(int disp:L){
            System.out.print(disp+" ");
        }
    }
}
