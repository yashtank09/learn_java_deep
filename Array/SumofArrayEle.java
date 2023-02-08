package Array;

// Sum of Integer Array elementss
public class SumofArrayEle {
    public static void main(String[] args) {
        int _array[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 }; // Intitialize array by giving values
        
        int SumofArray = 0; // Intitialize with zero integer value for adding and store elements

        // for (int i = 0; i < _array.length; i++) { // Using `Counter Controlled` loop
        for (int arrEle : _array) {
            SumofArray += arrEle; // This will add and store elements to variable
        }
        
        System.out.println("Sum of given array is: " + SumofArray);
    }
}
