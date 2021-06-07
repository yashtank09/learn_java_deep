import java.io.IOException;
import java.util.Scanner;
public class DemoStringInput {
    public static void main(String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter proper value: ");
        String input = scan.nextLine();
        System.out.println("User input: " + input);
        scan.close();
    }
}
