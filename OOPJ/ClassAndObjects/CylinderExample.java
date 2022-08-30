package ClassAndObjects;

class cylinder{
    protected double radius;
    protected double height;


    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double LiteralSurfaceArea(){
        return 2*Math.PI*radius*height;
    }

    public double TotalSurfaceArea(){
        return 2*Math.PI*radius*(radius+height);
        // return LiteralSurfaceArea()+2*Math.PI*radius*radius; | Same formula
    }

    public double Volume(){
        return lidArea()*height;
    }
}

public class CylinderExample {
    public static void main(String[] args) {
        cylinder formulas = new cylinder();
        
        formulas.height = 10;
        formulas.radius = 10;

        System.out.println("Lid Area of Cylinder: "+formulas.lidArea());
        System.out.println("Literal Surface Area of Cylinder: "+ formulas.LiteralSurfaceArea());
        System.out.println("Total Surface Area of Cylinder: "+ formulas.TotalSurfaceArea());
        System.out.println("Total Volume of Cylinder: "+ formulas.Volume());
    }
}