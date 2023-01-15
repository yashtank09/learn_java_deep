package LambdaExpressions;

/* 
 * Method Referances
 */

interface LambdaReferance {
    public void display(String str);
}

interface LambdaMultiParam {
    public boolean disp(String str1, String str2);
}

public class LambdaDemo5 {

    // refering to display() using constructor
    public LambdaDemo5(){
        System.out.println();
    }

    // refering to display() using constructor
    public LambdaDemo5(String str){
        System.out.println(str.toUpperCase());
    }

    // using Two parameters
    public static boolean compareStr(String s1, String s2){
        return s1 == s2;
    }
    
    // could not be a static referance to the display() method
    public void upper(String str){
        System.out.println(str.toUpperCase());
    }
    
    // static method to reverse String
    public static void reverse(String val){
        StringBuffer sb = new StringBuffer(val);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {

        LambdaReferance lr = System.out::println; 
        // println() static function/method referance to the display() method of our interface using scoperesolution operator
        lr.display("Hello World!");

        // to use static referance method should be static
        LambdaReferance lr2 = LambdaDemo5::reverse; // reverse() will refer to display() method of our interface
        lr2.display("Yash");

        // non-static method referance using object
        LambdaDemo5 lbd = new LambdaDemo5();
        LambdaReferance lr4 = lbd::upper;
        lr4.display("daxa");    

        // constructor of a class as a referance to the method 
        LambdaReferance lr3 = LambdaDemo5::new;
        lr3.display("yash");

        // Using two parameters
        // LambdaMultiParam lmp = String::compareTo;
        // System.out.println(lmp.disp("zello", "Wello"));

        LambdaMultiParam lmp2 = LambdaDemo5::compareStr;
        System.out.println(lmp2.disp("Hello", "Hello"));
        
    }
}
