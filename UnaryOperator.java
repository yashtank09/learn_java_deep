public class UnaryOperator {
    public static void main(String[] args) {
        // Increment or decrement formula are same 
        // if we choos variable Y so increment process is as following
        // Y = Y + 1 or decrement Y = Y - 1
        
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
//----------------------------------------------------------------------
        // Preincrement & Postincrement \\
        int y = 5, u;
        u = y++; //Here first value of 'y' is increment after that it assign to 'u'
        // u = y++; | Here first value of 'y' is assign to 'u' then increment
        System.out.println(y+" "+u);

        float i = 1.8f;
        i++;
        System.out.println("Value of float type: "+i);
        
        char m = 'Y';
        m++;
        System.out.println("Value of char type: " + m);

        short f = 6;
        // this modifies same data
        f++; // Here value of short f is changed by increment and also the datatype donsn't change
        // if we write short datatype incremtn like this f = f + 1 it will raise an error because
        // the value of f after increment is becomes Integer type
        System.out.println(f);

    }
}
