package Challanges;

public class removeDuplicatesFromArray {

    public static int[] removeDuplicates(int array[]){
        // if (length==0 || length==1){
        //     return length;
        // }

        int length = array.length;
        int[] updatedArray = new int[length];

        int j = 0;

        for(int i=0; i<length-1; i++){
            if (array[i] != array[i+1]){
                updatedArray[j++] = array[i];
            }
        }
        int newArrayLength = updatedArray.length;
        // updatedArray[j++] = array[length - 1];

        // for (int i=0; i<j; i++){
        //     array[i] = temp[i];
        // }

        return updatedArray;
    }

   /*  public static int removeDuplicatesNotNeighbour(int array[], int length){
        if (length==0 || length==1){
            return length;
        }

        int[] temp = new int[length];

    } */

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 40, 50, 50};
        
        int newArray[] = removeDuplicates(array);
        
        System.out.println(newArray.length);
        
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }
    }
}
