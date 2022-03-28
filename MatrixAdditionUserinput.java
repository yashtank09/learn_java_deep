import java.util.Scanner;

class MatrixAddition{
    static void displayMatrix(int m, int n, int s[][]){
        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] addMatrix(int[][] a, int[][] b, int m, int n){
        int i, j;
        int c[][] = new int[m][m];
        for(i=0; i < m ; i++)
            for(j=0; j < n; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    }
}
public class MatrixAdditionUserinput {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int m, n, p, q;
        // int[][] a = {{1,2},
        //             {3,4}      
        // };
        // int[][] b = {{4,3},
        //             {2,1}      
        // };
        System.out.print("Enter number of rows in Matrix 1: ");
        m = scan.nextInt();
        System.out.print("Enter number of columns in Matrix 1: ");
        n = scan.nextInt();

        System.out.println();

        System.out.print("Enter number of rows in Matrix 2: ");
        p = scan.nextInt();
        System.out.print("Enter number of columns in Matrix 2: ");
        q = scan.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[p][q];
        
        System.out.println("Enter elements for Matrix 1: ");
        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter elements for Matrix 1: ");
        for(int i=0; i < p; i++){
            for(int j=0; j < q; j++){
                b[i][j] = scan.nextInt();
            }
        }
        System.out.println("Result of Matrix: ");
        int c[][] = MatrixAddition.addMatrix(a, b, m, n);
        MatrixAddition.displayMatrix(m, n, c);    
    }
}
