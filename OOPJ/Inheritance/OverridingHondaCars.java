package Inheritance;
/* 
 * Method Overriding
 * Inheritance
 */
class cars{
    public void start(){
        System.out.println("Car Started.");
    }
    public void accelerate(){
        System.out.println("Car is Acceletated.");
    }
    public void changeGear(){
        System.out.println("Car Gear Changed.");
    }
}

class LuxaryCar extends cars{
    // Overrided method from class cars
    @Override
    public void changeGear(){
        System.out.println("Autometic Gear Changed.");
    }
    public void openSunRoof(){
        System.out.println("Sunroof Opend.");
    }
}
public class OverridingHondaCars {
    public static void main(String[] args) {
        LuxaryCar c = new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        c.openSunRoof();

        // Methods are called based on the object.
        // Super class referance can have object of sub class.
        cars cl = new LuxaryCar();
        cl.start();
        cl.accelerate();
        cl.changeGear();
        // cl.openSunRoof(); Not working because of the referance of this object is sidhhant
    }
}
