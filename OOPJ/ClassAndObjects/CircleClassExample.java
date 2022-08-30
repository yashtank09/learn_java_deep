package ClassAndObjects;

/**
 * CircleExample
 */
class circle{
    protected double radius; // Propertiy of class

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double circumfrance(){
        return perimeter();
    }
}

public class CircleClassExample {

    public static void main(String[] args) {
        
        circle circleCal = new circle(); // Object of class circles

        circleCal.radius = 7; // Assiging value to class property radius

        System.out.println("Area of Circle: "+circleCal.area()); // Calling methods using class object
        System.out.println("Perimeter of Circle: "+circleCal.perimeter());
        System.out.println("Circumfrance of Circle: "+circleCal.circumfrance());

    }
}