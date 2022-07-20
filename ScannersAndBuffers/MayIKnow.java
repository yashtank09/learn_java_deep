package ScannersAndBuffers;
import java.util.Scanner;

public class MayIKnow {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        String Name;
        System.out.println("May I know your name?\n");
        Name = sc2.next();
        System.out.println("Welcome " + Name);
    }
}
