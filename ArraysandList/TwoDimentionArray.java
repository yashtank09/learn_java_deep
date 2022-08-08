package ArraysandList;
/* 
    Two Dimention Array

    <Referance> = <Object/Element>
    int A[][] = new int[3][4] - This is a 2D array, here A[<Numbers of Rows>][<Numbers of Columns>]

    It will looks like...
            <index of Referance> - <elements>
    A[][] = [0] - {0, 1, 2, 3}
            [1] - {4, 5, 6, 7}
            [2] - {7, 8, 9, 10}

    Also we can initialize like this...
    int A[][] = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12}
                }
    
    int A[][]; - Creatd Referance variable
    A = new int[5][5]; - Created object by giving sizes

    int []A[] = new int[5][5];

    int[] E, F[];
    - E is an single dimention array & F is two dimention array
    - By writing int[] we are creating single dimention array, so E has no braces it considered as single dimention
    - even if F[] has braces so it will became 2D array
    
    We can see it like this also int[] E;
                                 int[] F[];
    
    int[] A, B, D, T[]; - T is 2D array
    
 */
public class TwoDimentionArray {
    public static void main(String[] args) {

        // int B[][] = new int[5][5];
        int A[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}; // Initialized two dimention Array A[3][4]

        // Printing elements of two dimention array
                           // This will give number of rows
        for(int i = 0; i < A.length; i++)
        {                     // This will give number of columns
            for(int j = 0; j < A[i].length; j++)
            {
                System.out.print(A[i][j]+", "); // printing rows and columns
            }
            System.out.println();
        }
        System.out.println();

        // Displying 2D array using foreach loop
        for (int[] X : A) { // here, X will became referance
            for (int Y : X) { // here Y will geting elements from X
                System.out.print(Y+", ");
                // Y has elements, will print it here
            }
            System.out.println();
        }
    }
}
