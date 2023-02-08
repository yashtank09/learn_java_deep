package Basics;
public class DataTypesLiterals {
    public static void main(String[] args) {
        
        /*
            Decimal = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 | Base: 10
            
            Binary = 0, 1 | base: 2

            Octal = 0, 1, 2, 3, 4, 5, 6, 7 | base: 8

            Hexadecimal = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F | base: 16

            Above are the number systems
        */

        //  These are the different Number system of Number 10 in same datatype
        byte Decimal = 10;
        byte Binary = 0b1010;
        byte Octal = 012;
        byte HexaDecimal = 0XA;

        System.out.println(Decimal);
        System.out.println(Binary);
        System.out.println(Octal);
        System.out.println(HexaDecimal);

        System.out.println();
        // Let's see other Literals
        long numb = 1000; // But this is treated as INTEGER
        //long numb2Long = 9999999999; // it shows an error: The literal 9999999999 of type int is out of range 
        long numb2Long2 = 9999999999L; // For solving error we have to write Long literal `l` or `L`.
                    // You can use `_` for saperating big digit like '99_99_99_999' it won't affect output
        
        System.out.println(numb);
        System.out.println(numb2Long2);

        // float f = 12.20; // By default number is DOUBLE we need to convert it to FLOAT using literal `f` or `F`
        float f = 12.20f;
        double d = 1222223.54;

        System.out.println(f);
        System.out.println(d);
        
    }
}
