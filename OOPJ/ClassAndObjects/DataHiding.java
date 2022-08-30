package ClassAndObjects;
/*
    In encapsulation, the variables of a class will be hidden from other classes,
    and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

    To achive data hiding in Java:
        - Declare the variables of a class as private.
        - Provide public setter and getter methods, also called property methods to modify and view the variables values.
*/
class dataHidingRectangle{

    // Private data members are only used within the class
    private double lenth;
    private double breath;

    // Getter property method, will return property.
    public double getLength(){
        return lenth;
    }

    public double getBreath(){
        return breath;
    }

    // Setter property method, will assign value to property.
    public void setLength(double l){
        if(l>0) // It should not be a negative number
            lenth = l;
    }

    public void setBreath(double b){
        if(b>0) // It should not be a negative number
            breath = b;
    }

    public double area(){
        return lenth * breath;
    }

    public double perimeter(){
        return 2 * (lenth+breath);
    }

    public boolean isSquare(){
        // don't use lenthy coding, untill you have majore requirnments
        return lenth == breath && lenth != 0;
    }
}

public class DataHiding {
    public static void main(String[] args) {
    
        dataHidingRectangle dataHidingExample = new dataHidingRectangle();

        // dataHidingExample.lenth = 55; // The field dataHidingRectangle.lenth is not visible, because they are priveate data members
        // dataHidingExample.breath = 5; // Instade we can use "getter & setter"

        dataHidingExample.setLength(-5.5);
        dataHidingExample.setBreath(-5.49);

        System.out.println("\nCalculations of Rectangle Length: " + dataHidingExample.getLength() + " and Breatch: " + dataHidingExample.getBreath()+".");

        System.out.println("\nArea of Rectangle: "+dataHidingExample.area());
        System.out.println("Perimeter of Rectangle: "+dataHidingExample.perimeter());
        System.out.println("Is is Square: "+dataHidingExample.isSquare());
        
    }
}
