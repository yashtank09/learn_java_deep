public class stringFormattion {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
            // System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
        */
        //-----------------------------------------------------------------\\
        /*
                Format Specifiers
                :Syntax:

                        %[argument_index$][flag][width][.precision]conversions

                        argument index - 1$, 2$, 3$ .... n$

                        flags '-', '+', '0', '', '('

                        Conversions
                        - char c
                        - int d, o, x
                        - float f, e, g
                        - String s
         */
        int x = 10;
        float y = 12.56f;
        char z = 'A';
        String s = "Hello This is Java Program";

        System.out.printf("Hello %d %f %c World\n", x, y, z);

        System.out.printf("Format Specifiers\n -> It will print Octal value: %o\n-> It will print Hexa Decimal: %x\n\n", x, x);

        System.out.printf("Format Specifiers Float Numbers\n -> It will print Value: %f\n-> It will print Float number with 4 after . numbers way: %g\n-> It will print Float number in Scientific way: %e\n\n", y, y, y);

        System.out.printf("Format Specifiers String\n-> It will print String: %s\n\n",s);

        System.out.printf("Arguments: %3$s %2$f %1$d\n\n", x, y, s);

        // Flag
        int ab = 12; float cd = 12.44999f; String ss = "Java";
        System.out.println("--Flags--");
        System.out.printf("%5d\n", ab); // It will take total 5 digits to print from RHS
        System.out.printf("%05d\n", ab);
        System.out.printf("%05d\n", ab);
        System.out.printf("%(5d\n", ab);
        System.out.printf("%+5d\n", ab);
        System.out.printf("%6.2f\n", cd); // It will take total 6 digit including '.'

        System.out.printf("%10s\n", ss);
        System.out.printf("%-10s\n", ss); // '-' will take total 10 digits from LHS






    }
}
