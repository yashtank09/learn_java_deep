package Array;

public class ReversCopyArray {
    public static void main(String[] args) {
        int ArrayX[] = {8, 10, 9, 3, 4, 6, 5, 2, 7, 1}; // Initializing an array
        int ArrayY[] = new int[10]; // Declaring an array
        
        for(int i = ArrayX.length-1, j = 0; i >= 0; i--, j++){ //Traverse from 0 to array lenth
            ArrayY[i] = ArrayX[j]; // copying ArrayX in ArrayY
        }

        for(int Y: ArrayY){
            System.out.print(Y+", "); // Printing ArrayY
        }
    }
}
