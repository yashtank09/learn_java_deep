package Challanges;

import java.util.ArrayList;
import java.util.List;

class FindMissingValue<T>{
    /* public int FindMissing(List<Integer> arrayList){
        int sizeofArray = arrayList.size();
        this.commonDifferancel = arrayList.get(1) - arrayList.get(0);
        
        for(int i=0; i < sizeofArray-1; i++){
            int nextValueToBe = arrayList.get(i) + commonDifferancel;
            
            // return arrayList.get(i+1) != nextValueToBe ? nextValueToBe : 0;
            if(!arrayList.get(i+1).equals(nextValueToBe)){
                return nextValueToBe;
            }
        }
        return 0;
    } */
    // Optimized way
    /* public int FindMissing(ArrayList<Integer> arrayList){
        this.commonDifferancel = arrayList.get(1) - arrayList.get(0);
        
        for (int value : arrayList) {
            int nextValueToBe = value + commonDifferancel;
            if(!arrayList.contains(nextValueToBe)){
                return nextValueToBe;
            }
        }

        return 0;
    } */

    // for finding every missing value from an array
    public List<Integer> FindMissing(List<Integer> arrayList){
        int commonDifferancel = arrayList.get(1) - arrayList.get(0);
        List<Integer> missingValuesList = new ArrayList<>();
        int sizeofArray = arrayList.size();
        for (int value : arrayList) {
            int nextValueToBe = value + commonDifferancel;
            while(!arrayList.contains(nextValueToBe) && nextValueToBe <= arrayList.get(sizeofArray - 1)){
                missingValuesList.add(nextValueToBe);
                nextValueToBe += commonDifferancel;
            }
        }
        return missingValuesList;
    }
}

public class FindMissingValueFromArray {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(2);
        listOfNumbers.add(4);
        listOfNumbers.add(6);
        listOfNumbers.add(8);
        // listOfNumbers.add(10);
        listOfNumbers.add(12);
        // listOfNumbers.add(14);
        listOfNumbers.add(16);
        // listOfNumbers.add(18);
        listOfNumbers.add(20);
        
        FindMissingValue<Integer> missingValue = new FindMissingValue<>();
        System.out.println("Missing value in this array is: "+missingValue.FindMissing(listOfNumbers));

    }
}


// 2 4 6 8 ? 12 14 ? 18 20