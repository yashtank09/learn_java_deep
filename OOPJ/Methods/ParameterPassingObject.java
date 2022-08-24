package OOPJ.Methods;

public class ParameterPassingObject {

    // Array X[] will point to address of actual array
    static void change(int X[], int index, int value){ // Passing Array referance/object as a parameter, also Array referance will point to the actual address of that same array
        X[index] = value; // Changing actual value from array
    }

    // Changing the value of Premitive dataype
    static void changePrimite(int x, int value){
        // only the value of formal parameter would be change not of actual parameter
        x = value;
    }

    public static void main(String[] args) {
        int A[] = {2,3,4,5,7};

        // Passing Array referance as actual parameter
        change(A, 2, 6);

        for (int i : A) {
            System.out.print(i+", ");
        }

        int x=10;
        changePrimite(x, 20); 
        // Here, printed value will be 10
        System.out.println("\n\nChanged Value = " + x);
    }
}
