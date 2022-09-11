package Inheritance;
/* 
 * Inheritance example
 */
// Super/ Perent/ Base Class
class circle{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double circamfrance(){
        return perimeter();
    }
}
/* 
 * This cylinder class have all the 'properties' & 'methods' of class circle
 */
// Child/ Sub/ Derived Class
class cylinder extends circle{ // Inheriting 'class circle' into 'class cylinder' using 'extends' keyword

    public double height;

    public double volume(){
        return area()*height;
    }
}

public class CircleInheritCylinder {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();

        c1.height=10;
        c1.radius=7;

        System.out.println("Volume: "+c1.volume());
        System.out.println("Area: "+c1.area());
    }
}
