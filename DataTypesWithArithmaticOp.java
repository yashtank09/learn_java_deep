public class DataTypesWithArithmaticOp {
    public static void main(String[] args) {
        int a = 14, b = 5;
        int c = a/b;
        int d = a%b;
        // Here the result of c & d are integer so,
        System.out.println(c);
        System.out.println(d);
        // Oh! the answers are 2 & 4, but they should be in decimal so, here is the soluction
        
        float e = (float)a/b; // this called type conversion
        System.out.println(e); // Here the result will float 
        // Now the result of "a/b" is 2.8(decimal)
        System.out.println("===============================");
// ============================================================================================================
        byte by = 45;
        short st = 10;
        //byte bty = by+st; | Error: cannot convert from int to byte
        int bty = by+st;
        System.out.println(bty);

        float lf = 12.5f;
        long fl = 123l;
        double dbl = 5.5;

        // long lfl = lf * fl; | Type mismatch: cannot convert from float to long because result is float
        // float df = lf * dbl; | Type mismatch: cannot convert from double to float because float is smaller datatype for store double value
        float lfl = lf * fl;
        double df = lf * dbl;
        System.out.println(lfl);
        System.out.println(df);
// ============================================================================================================
        /* Methemetical operations */
        System.out.println("____:Methemetical operations:____");
        System.out.println(10/5*6);
        System.out.println((float)10/(5*6));
        System.out.println((50+50)/10*(60-8));
    }
}