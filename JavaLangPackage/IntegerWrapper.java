package JavaLangPackage;

public class IntegerWrapper {
    public static void main(String[] args) {
        
        int i1 = 15;

        Integer p1 = i1; 
        Integer p2 = 15; 
        
        System.out.println(p1.equals(i1)); // here .equals() will compare values of both not object so we can give primitives as parameters also
        System.out.println(p1.equals(p2));
        
        // Static methods
        Integer q = Integer.valueOf("123");
        
        // Assigning value using different 'radix'
        Integer r = Integer.valueOf("1010", 2);
        Integer r1 = Integer.valueOf("A7", 16);
        
        Integer r2 = Integer.decode("0xA7");
        
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println(Integer.bitCount(r)); // returns 1 bits in 2's complement binary representation

        // Converstion from String to Integer
        String s = "100";
        System.out.println(Integer.parseInt(s));

        Integer h = 128;
        System.out.println(Integer.reverse(q)); // Returns the value obtained by reversing the order of the bits in the two's complement binary representation of the specified int value.
        System.out.println(Integer.reverseBytes(h)==Integer.MIN_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);


    }
}
