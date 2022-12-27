package JavaLangPackage;

public class FloatWrapper {
    public static void main(String[] args) {
        
        float a = 3.14f;
        Float f = 3.14f;
        Float f1 = 3.14f / 0;
        Float f2 = (float) Math.sqrt(-1); // (float) typecasting
        Float f3 = (float) Math.sqrt(9); // (float) typecasting

        System.out.println(f.equals(a)); // return true because values are same
        System.out.println(f.isInfinite()); // return false because value is finite
        System.out.println(f1.isInfinite()); // return true because devidec by 0 means infinite
        
        System.out.println(f1 == Float.POSITIVE_INFINITY); // return true f1 is positive infinity
        System.out.println(f1 == Float.NEGATIVE_INFINITY); // return true if value of f1 is nagative else false
        System.out.println(f2 != Float.NaN); // this constant will check that is number or not but if operator is '!='
        System.out.println(Float.NaN == f3); 

        System.out.println(f2.isNaN()); // method checks the object's value is number or not

    }
}
