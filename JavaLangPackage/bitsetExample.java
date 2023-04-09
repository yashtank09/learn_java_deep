package JavaLangPackage;

import java.util.BitSet;

public class bitsetExample {
    public static void main(String[] args) {
        
        BitSet bs1 = new BitSet(10);
        BitSet bs2 = new BitSet(5);

        bs1.and(bs2);
        System.out.println(bs1.cardinality() + " " + bs2.cardinality());
    }
}
