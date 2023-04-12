package Challanges;

import java.util.HashMap;
import java.util.Map;

/**
 * FindMissingAndDuplicates
 */

class DuplicatesAndMissing {
    
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap<>();
        int duplicate = 0;
        for (int num : nums) {
            if (!count.containsKey(num)) {
                count.put(num, 1);
            } else {
                duplicate = num;
            }
        }
        int missing = 0;
        for (int i = 1; i <= n; i++) {
            if (!count.containsKey(i)) {
                missing = i;
                break;
            }
        }
        return new int[] {duplicate, missing};
    }
}

public class FindMissingAndDuplicates {

    public static void main(String[] args) {
        DuplicatesAndMissing dam = new DuplicatesAndMissing();

        int listOfNumbers[] = {1,2,4,4,5};

        int list[] = dam.findErrorNums(listOfNumbers);

        for (int i : list) {
            System.out.println(i);
        }

    }
}