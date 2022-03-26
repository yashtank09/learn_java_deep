public class Arrays {
    public static void main(String[] args) {
        // Declaration Method of ARRAY in java
        // we can declare array by using this three methods below...
        /*
            int a[];
            int[] b;
            int []c;
        */
        // Declaration
        // int a[] = new int[6];
        int a[]={1,2,3,4,5};
        int sum = 0;
        /*
            initialization
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;
            a[4] = 50;
            a[5] = 60;
        */

        // System.out.println(a[2]);

        for(int i=0; i<a.length; i++){
            // System.out.println(a[i]);
            sum = a[i] + sum;
            // System.out.println(sum);
        }

        System.out.println(sum);
    }
}
