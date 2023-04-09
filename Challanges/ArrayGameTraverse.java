package Challanges;

import java.util.Scanner;

/*

Let's play a game on an array! You're standing at index 0 of an n - element array named 'game'. From some index i (where 0 <= i < n),
you can perform one of the following moves:

- Move Backward: 
    - If cell i - 1 exists and contains a 0, you can walk back to cell i - 1.

- Move Forward:
    - If cell i + 1 contains a zero, you can walk to cell i + 1.
    - If cell i + leap contains a zero, you can jump to cell i + leap.
    - If you're standing in cell n - 1 or the value of i + leap >= n, you can walk or jump off the end of the array and win the game.

In other words, you can move from index i to index i + 1, i - 1, or i + leap as long as the destination index is a cell containing a 0.
If the destination index is greater than n - 1, you win the game.

Complete the canWin function in the editor below.
canWin has the following parameters:
    - int leap: the size of the leap
    - int game[n]: the array to traverse
    
*/
public class ArrayGameTraverse {


    public static boolean canWin(int leap, int[] game, int index) {
        // Return true if you can win the game; otherwise, return false.
        if(index < 0 || game[index] == 1){
            return false;
        } else if(index + 1 > game.length || index + leap > game.length - 1){
            return true;
        } else {
            game[index] = 1;
            return canWin(leap, game, index - 1) || canWin(leap, game, index + 1) || canWin(leap, game, index + leap);
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();    
    }
}