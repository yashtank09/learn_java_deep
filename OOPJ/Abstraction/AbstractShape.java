package Abstraction;

/* 
 * Finding Different shape properties
 * 
 * We are achiving polymorphism in using abstraction this example
 */

// Abstract class
abstract class shape{
    // No protperties to define in super abstract class
    
    // Abstract Methods
    abstract public double perimeter();
    abstract public double area();
}

class RactangleShape extends shape{
    private double length;
    private double height;

    // Assigning properties using constructor
    RactangleShape(double length, double height){
        this.length = length;
        this.height = height;
    }

    public double perimeter(){
        return 2*(length+height);
    }

    public double area(){
        return length*height;
    }
}

class CircleShape extends shape{
    private double radius;

    // Assigning properties using constructor
    CircleShape(double radius){
        this.radius = radius;
    }
    
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        shape s;
        s = new CircleShape(20);
        System.out.println("Area of Circle: "+s.area());

        shape s2;
        s2 = new RactangleShape(5, 3);
        System.out.println("Perimeter of Ractangle: "+s2.perimeter());
    }
}
