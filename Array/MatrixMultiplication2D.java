package Array;
/* 
    Formula:
        C[i][j] += A[i][k] * B[k][j];

 */
public class MatrixMultiplication2D {
    public static void main(String[] args) {
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
        
        int C[][] = new int[3][3]; // Declaring 3rd array for storing the output elements

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int[] X : C) {
            for (int Y : X) {
                System.out.print(Y + " ");
            }
            System.out.println();
        }
    }
}
