package ClassAndObjects;

/* 
    Here, Box uses a constructor to initialize the dimensions of a box.
*/
class Box{
    double width;
    double height;
    double depth;

    // This is constructor for Box
    Box(){
        System.out.println("Constructing BOX...");
        width = 10;
        height = 5;
        depth = 5;
    }

    // compute and return volume
    double volume(){
        return width * height * depth;
    }

}

/* 
    Here, Box uses a parameterized constructor to initialize the dimensions of a box.
*/
class Box2{
    double width;
    double height;
    double depth;

    // This is Parameterised constructor for Box
    Box2(double w, double h, double d){
        System.out.println("Constructing BOX...");
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume(){
        return width * height * depth;
    }
}
public class BoxConstructor {

    public static void main(String[] args) {
        // Declare, Allocate, and Initialize Box Objects
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        
        // Get Volume of First Box
        System.out.println("Volume of BOX: "+myBox1.volume());

        // Get Volume of Second Box
        System.out.println("Volume of BOX: "+myBox2.volume());

        System.out.println();
        // declare, allocate, and initialize Box objects
        Box2 mybox101 = new Box2(10, 20, 15);
        Box2 mybox202 = new Box2(3, 6, 9);
        
        // get volume of first box
        System.out.println("Volume is " + mybox101.volume());
        
        // get volume of second box
        System.out.println("Volume is " + mybox202.volume());
    }
    
}