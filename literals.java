import java.util.function.DoublePredicate;

/*
    Literals are constant values that are used in program.

    Expression: z = 5 * x + 7 * y where 5 & 7 are literals [ int var = 25; variable declared with inital value 25]
    5 & 7 are values without decimal so they are "Integer literals"
    Literals also have thair types.

    double prise = 153.85; This is a double literals | area = 3.1425 * radius * radius; the value '3.1425' is also double literals
    *every decimal value with decimal point is double literals.

    char c='A' this is charachter literal
    
    Class referance = object;
    String str ="Java";
---------------------------------------------------------------------------------------------------------------------------------------------
    **Datatype and thair literals.

    byte - int
    short - int
    int - int
    long - L or l
    float - F or l
    double - D or d
    char - ''
    boolean - true/false


*/
public class literals {
    public static void main(String[] args) {
        
        // byte b = 15;
        // short s = 15;
        // int i = 15;

        //  Decimal - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        //  Binary - 0, 1
        //  Octal - 0, 1, 2, 3, 4, 5, 6, 7
        //  Hexadecimal - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F

        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        // long ll = 125;
        // long ll = 999999999999; it will raise error
        long ll = 999999999999L; // long literal
        System.out.println(ll);
        long l2 = 999_999_99; //for readability of code | underscore should be in between numbers not at start and end
        System.out.println(l2);
        double dbl = 15_250.256;
        System.out.println(dbl);
        // double dbl = 15_268.6568 | Here we have to saperate numbers before decimal point in between numbers not at the end or start
        // You can not write like this | _15568_._45454_ <- *Wrong

        // int i = 125L; integer is small so long literal can not be applied

        float fl = 14.55f; // without float literal it will raise an error
        double db = 14.55;
        System.out.println(fl);
        System.out.println(db);
        

    }
}
