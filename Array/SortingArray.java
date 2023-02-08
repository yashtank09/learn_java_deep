package Array;

/* 
    Sorting:
        10, 4, 2, 7, 8, 11, 5
        4, 10, 2, 7, 8, 11, 5
        2, 10, 4, 7, 8, 11, 5
        2, 4, 10, 7, 8, 11, 5
        2, 4, 7, 10, 8, 11, 5
        2, 4, 5, 10, 8, 11, 7
        2, 4, 5, 8, 10, 11, 7
        2, 4, 5, 7, 10, 11, 8
        2, 4, 5, 7, 8, 11, 10
        2, 4, 5, 7, 8, 10, 11

 */

public class SortingArray {
    public static void main(String[] args) {
        int _Array[] = {10, 4, 2, 7, 8, 11, 5};  // Sorted Output: 2, 4, 5, 7, 8, 10, 11

        // Method 1
        // Arrays.sort(_Array);
        for (int i : _Array) {
            System.out.print(i);
        }

        System.out.println("\n\n");
        // Method 2 \\ Without built in function
        int temp = 0;
        for(int i = 0; i < _Array.length; i++){
           for(int j = i+1; j < _Array.length; j++){
                // if _Array[<index i>] > _Array[<index j>], Swap
                if(_Array[i] > _Array[j]){
                    // Swaping : Arr[i] into Arr[j]
                    temp = _Array[i];
                    _Array[i] = _Array[j];
                    _Array[j] = temp;
                }
            }
        }

        for(int X: _Array){
            System.out.print(X+" ");
        }
    }
}
