package ClassAndObjects;

class BoxThis{

    double height;
    double width;
    double depth;
    
    /* 
        "this" can be used inside any method, a raferance variable that referes to the current object or datamembers/properties.
    */

    /* 
        // This is redundant|redundant use of 'this' keyword.
        BoxThis(double h, double w, double d){
            this.height = height;
            this.width = width;
            this.depth = depth;
        }
    */

    // Parameterised constructor with this keyword
    // Instance Variable Hiding
    // without 'this' keyword method will have name conflict
    BoxThis(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double BoxVolume(){
        return height*width*depth;
    }
}
public class thisKeyBoxExp {
    public static void main(String[] args) {
        System.out.println("Volume of Box: "+new BoxThis(55, 23, 66).BoxVolume());
    }
}
