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
    
    static int[][] substractionMatrix(int[][] a, int[][] b, int m, int n){
        int i, j;
        int c[][] = new int[m][m];
        for(i=0; i < m ; i++)
            for(j=0; j < n; j++)
                c[i][j] = a[i][j] - b[i][j];
        return c;
    }

    static int[][] multiplyMatrix(int[][] a, int[][] b, int n, int p){
        int i, j, k;
        int c[][] = new int[n][p];
        for(i=0; i < n ; i++)
            for(j=0; j < n; j++)
                for(k=0; k < n; k++)
                    c[i][j] += a[i][k] * b[k][j];
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
        
        System.out.println("Enter elements for Matrix A: ");
        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter elements for Matrix B: ");
        for(int i=0; i < p; i++){
            for(int j=0; j < q; j++){
                b[i][j] = scan.nextInt();
            }
        }
        System.out.println("Result of Matrix: ");
        int select = 0;
        System.out.println("What do you want to do with this Matrix...");
        System.out.print("(1) Matrix Mutiplication \n(2) Additon of Matrix \n(3) Exit");
        System.out.print("Enter your choice: ");
        select = scan.nextInt();
        switch (select) {
            case 1:
                if(n == p){
                    int c[][] = MatrixAddition.multiplyMatrix(a, b, n, p);
                    MatrixAddition.displayMatrix(n, p, c);
                }else{
                    System.out.println("Row size of Matrix A and Column size of Matrix B are should be same for Matrix Multiplication");
                }
                break;
            case 2:
                if(m == p && n == q){
                    int c[][] = MatrixAddition.addMatrix(a, b, m, n);
                    MatrixAddition.displayMatrix(m, n, c);
                }else{
                    System.out.println("Matrix A and B are both should be the same size.");
                }
                break;
            case 3:
            if(m == p && n == q){
                int c[][] = MatrixAddition.addMatrix(a, b, m, n);
                MatrixAddition.displayMatrix(m, n, c);
            }else{
                System.out.println("Matrix A and B are both should be the same size.");
            }
            break;
        }
            
    }
}
