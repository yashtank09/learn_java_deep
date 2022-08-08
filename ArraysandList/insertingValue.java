package ArraysandList;

import java.util.Scanner;

public class insertingValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int _arr[] = new int[10]; // Declaring an array

            System.out.print("Enter N element for array: ");
            int elements = sc.nextInt(); // Taking N values to store in an array

            for(int i = 0; i < elements; i++){
                _arr[i] = sc.nextInt(); // Storing values to an array
            }

            System.out.print("\nEnter value to insert: ");
            int insert = sc.nextInt(); // Taking value to insert

            System.out.print("\nEnter the index where you need to insert it: ");
            int atindex = sc.nextInt(); // Taking index number for inserting value

            for(int i=elements; i>atindex; i--){
                _arr[i] = _arr[i-1]; // Shifting values to right side to insert atindex
            }
            _arr[atindex] = insert; // inserting value to given index

            System.out.println();
            for(int x:_arr){
                System.out.print(x+", ");
            }
        }

    }
}
