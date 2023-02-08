package Basics.Strings;
// Java program to reverse a string 
// ex. YASH => HSAY

//Packages Imported for take input from console & for IOException
import java.io.IOException;
import java.util.Scanner;

public class stringReverce 
{ 
    public static void main(String args[]) throws IOException{
        
        // Scanner object for take input from user
        Scanner scan = new Scanner(System.in);
        
        // User input thair value here
        System.out.println("Please enter proper value: ");
        String input = scan.nextLine();
        
        // User input display here
        System.out.println("User input: "+input); 

        //Empty String variable for store reversed String
        String reversed_String = "";
        
        // for loop for revere string
        for(int i = input.length() -1; i>=0; i--){
            
            //Get character from last and store one by one in reversed_string
            reversed_String = reversed_String + input.charAt(i);
            System.out.println(reversed_String);
            
        }
        
        // Finally Print the reverse string that User inputed
        System.out.println("Reversed String is ready: "+reversed_String);
        scan.close();
    }
} 
