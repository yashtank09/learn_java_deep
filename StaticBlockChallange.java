import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticBlockChallange {
    static int B, H;
    static boolean flag = false;
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
