package Array;

/*
    ** This is three method of declaring and initialising an array

    Declaring Array

    int A[] = new int[10];  - A is referance and new keyword created object of an Array

    Declearing with values

    int B[] = {1,2,3,4,5}   - Size is not mention, size of list which we have initialising

    Declearing Array referance, and create it's object

    int C[];
    C = new int[10];

    Adding values to an Array
        - initialization
            C[0] = 10;
            C[1] = 20;
            C[2] = 30;
            C[3] = 40;
            C[4] = 50;
            C[5] = 60;

*/
public class Arrays {
    public static void main(String[] args) {
        // Array declaration and print
        int A[] = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]); // All the elements of an array will be initialise with zero
            A[i] = i + 1;
            System.out.print(A[i] + "\n");
        }

        /*
         * 
         * This is foreach loop that is enhanced for loop, provides an alternative
         * approach to traverse the array or collection in Java.
         * 
         * Syntax
         * for(<datatype> var: Array/Collection){
         * <statemetn>
         * }
         * 
         */
        for (int A_eli : A) {
            System.out.println(A_eli);
        }
    }
}
