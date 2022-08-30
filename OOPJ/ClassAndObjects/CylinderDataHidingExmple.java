package ClassAndObjects;

class CylDataHid{
    private double radius;
    private double height;

    CylDataHid(){
        radius = 0;
        height = 0;
    }

    CylDataHid(double radius){
        this.radius = radius;
    }

    CylDataHid(double radius, double height){
        this.height = height;
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double FindLidArea(){
        return Math.PI*radius*radius;
    }

    public double FindSurfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }

    public double FindVolume(){
        return FindLidArea()*getHeight();
    }
}

public class CylinderDataHidingExmple {
    public static void main(String[] args) {
        CylDataHid cld = new CylDataHid(10, 10);
        
        System.out.println("Finding Lid Area of Cylinder: "+cld.FindLidArea());
        System.out.println("Finding Surface Area of Cylinder: "+cld.FindSurfaceArea());
        System.out.println("Volume of Cylinder: "+cld.FindVolume());
    }
}
