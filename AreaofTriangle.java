import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        float base, height, area;
        System.out.println("Enter base & height.: ");
        
        Scanner scan = new Scanner(System.in);
        base = scan.nextFloat();
        height = scan.nextFloat();

        area = base * height*0.5f;
        System.out.println("Area of triangle is: "+ area);

        // Another formula for finding area of triangle
        int a, b, c;
        float s; // area2;
        double area2;

        System.out.println("Enter Triangle 3 sides: ");

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        s = (a+b+c)/2f;

        area2 = Math.sqrt(s*(s-a)*(s-b)*(s-c)); // if area2 variable is float datatype so it will raise error:
                                                // Type mismatch: cannot convert from double to float
        System.out.println("Area of Triangle is: "+area2);
        
        scan.close();
    }
}
