package Static_Final;

/**
 * staticBlock
 */

class Test{
    static {
        System.out.println("First Test class static block.");
    }
    static {
        System.out.println("Second Test class static block");
    }
}

public class staticBlock {
/* 
    // first static block which will initialized first
    static{
        System.out.println("First Static Block.");
    }

    // second static block which will initialized after first static block
    static{
        System.out.println("Second Static Block");
    }
 */
    public static void main(String[] args) {
        // Static blocks are execute when ever the class is loaded
        Test t = new Test();
        System.out.println(t);
    }
}