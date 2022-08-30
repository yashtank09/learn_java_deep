package ClassAndObjects;

/**
 * RactangleExample
 */
class RectangleEx{
    protected double lenth;
    protected double breath;

    public double area(){
        return lenth * breath;
    }

    public double perimeter(){
        return 2 * (lenth+breath);
    }

    public boolean isSquare(){
        // don't use lenthy coding, untill you have majore requirnments
        return lenth == breath;
    }
}

public class RactangleExample {

    public static void main(String[] args) {
        RectangleEx rectangleFind = new RectangleEx();

        rectangleFind.lenth = 55;
        rectangleFind.breath = 5;

        System.out.println("Area of Rectangle: "+rectangleFind.area());
        System.out.println("Perimeter of Rectangle: "+rectangleFind.perimeter());
        System.out.println("Is is Square: "+rectangleFind.isSquare());
    }
}