public class foreachLoop {
    public static void main(String[] args) {
        // initialize an array 
        int a[] = {10,20,30,40,50};

        // Print array a using for-each loop
        for(int l:a){ // it traverse to array a[] and then print it
            System.out.println(l);
        }
        
        int total = 0;
        for(int i:a){
            total += i;
        }
        System.out.println("\n\tTotal: " + total);
    }
}
