import java.util.*;

public class StaticBlockChallange {
    static int B, H;
    static boolean flag = false;
    /*   
        Static block is used for initializing the static variables.This block gets executed when the class is loaded in the memory.
        A class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.
    */
    static{
        Scanner sc = new Scanner(System.in);
        B = H = 0;
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        if(B <=0 || H <=0){
            System.out.println("java.lang.Exception: Breadth and height must be positve");
        }
        else{
            flag = true;
        }
    }    
    public static void main(String[] args) {
        if(flag){
			int area=B*H;
			System.out.print(area);
		}
    }
}
