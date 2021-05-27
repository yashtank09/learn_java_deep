public class UnaryOperator {
    public static void main(String[] args) {
        int x=10;  
        System.out.println(x++);//10 (11)   It's colde Post increment
        System.out.println(++x);//12        It's pre increment
        System.out.println(x--);//12 (11)   It's post decrement
        System.out.println(--x);//10        It's pre decrement
        System.out.println("----------------------------------");
//----------------------------------------------------------------------
        int a=10;  
        int b=10;  
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
        System.out.println("----------------------------------");
//----------------------------------------------------------------------
        int p=10;  
        int q=-10;  
        boolean c=true;  
        boolean d=false;  
        System.out.println(~p);//-11 (minus of total positive value which starts from 0)  
        System.out.println(~q);//9 (positive of total minus, positive starts from 0)  
        System.out.println(!c);//false (opposite of boolean value)  
        System.out.println(!d);//true
    }
}
