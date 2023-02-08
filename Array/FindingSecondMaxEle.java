package Array;

// Finding second largest element in given array
public class FindingSecondMaxEle {
    public static void main(String[] args) {
        int _array[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10, 14 };
        
        int max = _array[0]; // First max value in array
        int secondMax = _array[0]; // Second max value in array
        
        for (int i = 0; i < _array.length; i++) {
            if (_array[i] > max) { // if _array[<index>] > max, first store max in secondMax and then store _array[<index>] in max
                secondMax = max;
                max = _array[i];
            }
            else if(_array[i] > secondMax) { // else if _array[i] > secondMax, store _array[<index>] in secondMax
                secondMax = _array[i];
            }
        }
        System.out.println("This is second largest element in given array: "+ secondMax);
    }
}
