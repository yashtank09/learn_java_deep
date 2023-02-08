package Array;

public class shiftingArrayEle {
    public static void main(String[] args) {
        int _array[] = {5,9, 6, 10, 12, 7, 3, 5, 4, 2};

        for(int x: _array){
            System.out.print(x+", ");
        }
        System.out.println();

        Boolean left = true;
        if(left){
            System.out.println("Left rotation of an array");
            // Left Roatation of an array
            int shifting_value = _array[0]; 

            for(int i = 1; i < _array.length; i++){
                _array[i-1] = _array[i];
            }
            _array[_array.length-1] = shifting_value;

            for(int x: _array){
                System.out.print(x+", ");
            }
        }
        else{

            System.out.println("Right rotation of an array");
            // Right Rotation of an array
            int shifting_value = _array[_array.length-1]; // Storing last element of an array into shifting_value variable

            for(int i = _array.length-1; i > 1; i--){
                _array[i] = _array[i-1];
            }
            _array[0] = shifting_value;

            for(int x: _array){
                System.out.print(x+", ");
            }

        }

    }
}
