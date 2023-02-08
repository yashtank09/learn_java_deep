package Java_IO_Stream.ScannerClass;
import java.util.Scanner;

public class Cubiod {
    public static void main(String[] args) {
        int Lenth, Breath, Height, Volume, TotalArea;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Lenth, Breadth and Height.");
        Lenth = sc.nextInt();
        Breath = sc.nextInt();
        Height = sc.nextInt();

        
        Volume = Lenth * Height * Breath;

        TotalArea = 2*(Lenth * Height + Breath * Height + Lenth * Breath);

        System.out.println("Total Area " + TotalArea);
        System.out.println("Volume " + Volume);


    }
}
