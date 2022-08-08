package ArraysandList;

public class IncreasingSizeofArray {
    public static void main(String[] args) {
        int _arrA[] = {2, 5, 7, 8, 9}; // Initializing Array 'A'
        int _arrB[] = new int[_arrA.length*2]; // dubble up size of an Array 'A' using Array 'B'

        for(int i = 0; i < _arrA.length; i++){ // Traversing to array 'A'
            _arrB[i] = _arrA[i]; // Copying into Array B
        }

        _arrA = _arrB; // Changing referance of _arrB to _arrA, so now size of Array A is doubbled up
        _arrB = null; // giving null referance to Array B

        System.out.println(_arrA.length+"\n");

        for (int i : _arrA) { // _arrB is null so it will raise an error: cannot read the array lenth because '_arrB' is null
            System.out.print(i+", ");
        }

    }
}
