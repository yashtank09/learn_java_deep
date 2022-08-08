package ArraysandList;

import java.util.Scanner;

// searching key valu from given array
public class SearchingElement {
    public static void main(String[] args) {
        int _array[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter key: "); // Fetching user input for key to search
            int key = sc.nextInt();

            for (int i = 0; i < _array.length; i++) {
                if (_array[i] == key) { // if _array[<index>] == key, print index of that key
                    System.out.println("Element " + key + " is present at index " + i + ".");
                    // break;
                    System.exit(0); // it will terminate the running program
                    /* 
                     	A "break" is only allowed in a loop (while or for), and it causes the loop to end but the rest of the program continues.
                        On the other hand "sys. exit()" aborts the execution of the current program and passes control to the environment.
                     */
                }
            }
        } 
        System.out.println("Element not found");

    }
}
