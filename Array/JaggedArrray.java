package Array;
/* 
    Jagged array
    A jagged array is an array whose elements are arrays, possibly of different sizes.
    A jagged array is sometimes called an "array of arrays.

    Example:

    A[][] = [0] - {0, 1}
            [1] - {4, 5, 6, 7}
            [2] - {7, 8, 9}

    Jagged arrays have different column size
    
    Declaring and intitialize it
    
    int A[][] = new int[3][];

    A[0] = new int[2];
    A[1] = new int[4];
    A[3] = new int[3];

 */
public class JaggedArrray {
    public static void main(String[] args) {
        int[][] A = new int[3][];

        A[0] = new int[2];
        A[1] = new int[4];
        A[2] = new int[3];

        // Displaying 2D Jagged array
        System.out.println("\nPrinting Jagged Array using Counter Controled For loop.");
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nPrinting Jagged Array using Foreach loop.");
        for (int[] x : A) {
            for (int y : x) {
                System.out.print(y+" ");                
            }
            System.out.println();
        }

    }
}
