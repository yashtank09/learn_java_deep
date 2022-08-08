package ArraysandList;

import java.util.Scanner;

public class deletingValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int _arr[] = new int[10]; // Declaring an array

            System.out.print("Enter N element for array: ");
            int elements = sc.nextInt(); // Taking N values to store in an array

            for(int i = 0; i < elements; i++){
                _arr[i] = sc.nextInt(); // Storing values to an array
            }

            for (int x : _arr) {
                System.out.print(x+", ");
            }
            System.out.println();
            System.out.print("\nEnter the index from where you want to delete: ");
            int fromindex = sc.nextInt(); // Taking index number for inserting value

            for(int i=fromindex; i<elements; i++){
                _arr[i] = _arr[i+1]; // Shifting values to right side to insert atindex
            }

            System.out.println();
            for(int x:_arr){
                System.out.print(x+", ");
            }
        }
    }
}
