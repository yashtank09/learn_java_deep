package Inheritance;

/* 
    Poly means Many
    Morphism means forms
    Polymorphism means one name with different actions.
    Polymorphism in java can achive using method overloading and overriding
 */
class Test{
    public int max(int x, int y){
        return x>y?x:y;
    }
    // Overloaded: same name but different argument
    public int max(int x, int y, int z){
        if(x>y && x>z)
            return x;
        else if(y>z)
            return y;
        else
            return z;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.max(10, 40));
        System.out.println(t.max(14, 14,10 ));
    }
}
