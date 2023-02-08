package other_excersizes;
public class tests{
    public static void main(String[] args) {
        // // with string we can not directly do meth operators it's recognized as concadination operator
        // System.out.println("Sum of 2 values "+ 4 + 5 +" <- This understands as concadination operator and print as string");
        // // if we want to do that heres is the solution.
        // int a = 12/3;
        // System.out.println("SUM->" + (4+5));
        // System.out.println("Division->" + a);
        // System.out.println(4+5);
       /* int i = 5-4;
        switch(i) {
            case 0:
                System.out.println("Zero!!!!");
                break;
            case 1:
                System.out.println("One!!!");
                break;
            default:
                try {
                    System.out.println("Your wrong bro...");
                } catch (Exception e) {
                    System.out.println(68+1);
                    System.out.println("That's Wrong number....");
                }
                break;
        }*/System.out.println("Hellow Yash First main method");
    //}
   /*public static void main(String args[]) {
        System.out.println(args[1]);
        System.out.println("Hello Yash this is second method");
        // Testing 2 main methods can compile or not?
    }*/
    
    String s = "12345678";
    System.out.println(s.matches("[0-9]+[A-F]+"));
    }
}