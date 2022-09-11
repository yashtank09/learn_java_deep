package Inheritance;
/* 
 * Super Keyword
 * Inheritance
 * Calling Super Constructor in sub class
 */
class RAngle{
    public int lenght;
    public int breath;
    public int x=10;

    RAngle(int lenght, int breath){
        this.lenght = lenght;
        this.breath = breath;
    }
}

class cuboidShape extends RAngle{
    public int height;
    public int x=20;
    cuboidShape(int l, int b, int h){
        super(l, b);
        height=h;
    }

    void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class SuperKeyRectangle {
    public static void main(String[] args) {
        cuboidShape c = new cuboidShape(1, 1, 1);
        c.display();        
    }
}
