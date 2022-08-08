package ArraysandList;

// Finding largest element in given array
public class FindingMaxElement {
    public static void main(String[] args) {
        int _array[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        
        int max_Element = _array[0]; // Storing first array element to compare with others
        
        for (int i = 0; i < _array.length; i++) {
            if (_array[i] > max_Element) { // if _array[<index>] > max_Element, store the value of _array[<index>] in max_Element
                max_Element = _array[i];
            }
        }
        System.out.println("This is max element in given array: "+max_Element); // Print max number
    }
}
