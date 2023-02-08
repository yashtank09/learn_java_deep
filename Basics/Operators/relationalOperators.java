package Basics.Operators;
public class relationalOperators 
{
    public static void main(String[] args) 
    {
        int a = 5, b = 10, c = 15;

        System.out.println(a<b); // It will return boolean TRUE
        System.out.println(a<b && a<c); // True
        System.out.println(a<b && a>c); // False
        System.out.println(a<b || a>c); // True
        System.out.println(a>b || a>c); // False
    }
}
