package Methods;

public class FindAreas {
    
    static double area(float lenght, float height){
        // Formula for finding area of Rectangle of Square
        return lenght * height;
    }

    static double area(float radious){
        // Formula for finding area of Circle
        return Math.PI * radious * radious; 
    }

    static double area(float a, float b, float height){
        // Formula for finding area of Trapezium
        return (a+b)/2 * height;
    }

    static double area(double base, double height){
        return base * height;
    }
    public static void main(String[] args) {
        System.out.println("\nArea of Circle "+area(5));
        System.out.println("\nArea of Rectangle "+area(10,5));
        System.out.println("\nArea of Trapezim "+area(13,13,5));
        System.out.println("\nArea of Parallelogram "+area(1.5,2.1));
    }
}
