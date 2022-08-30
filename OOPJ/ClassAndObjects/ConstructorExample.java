package ClassAndObjects;

class RectConst{
    
    // Private data members
    private double length;
    private double breatch;

    // Non-Parameterised Constructor
    public RectConst(){
        length=1;
        breatch=1;
    }

    // Parameterised Constructor
    public RectConst(double l, double b){
        length=l;
        breatch=b;
    }

    public RectConst(double s){
        length=breatch=s;
    }

}

public class ConstructorExample {
    public static void main(String[] args) {
        RectConst rect = new RectConst(); // It will initialise Non-Parameterised constructor, if not created it will call default counstructor by java compiler
        RectConst rect1 = new RectConst(10,20);
        RectConst rect2 = new RectConst(5);
    }
}
