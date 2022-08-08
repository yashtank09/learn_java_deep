package ArraysandList;

// Sorting Array of Stringa
public class SortingStringArray {
    public static void main(String[] args) {
        String StrArray[] = {"java", "python", "pascal", "smalltalk", "javascritp", "ada", "docker", "mongodb"};

        // Built in method for sorting an Array
        java.util.Arrays.sort(StrArray);
        
        System.out.println();
        for (String x : StrArray) {
            System.out.print(x+", ");
        }
    }
}
