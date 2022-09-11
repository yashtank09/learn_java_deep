package Inheritance;
/* 
 * Dynamic method dispatch
 * Method Overriding
 */
class TV{
    public void switchON(){
        System.out.println("TV is Truned ON.");
    }

    public void changeChanel(){
        System.out.println("Tv's channel changed.");
    }
}

class SmartTV extends TV{
    @Override
    public void switchON(){
        System.out.println("Smart TV is Turned ON.");
    }
    @Override
    public void changeChanel(){
        super.changeChanel(); // we can use it using 'super' keyword
        // Otherwise the method of super class which are oberiden here are became shadow methods
        System.out.println("Smart TV's channel changed.");
    }
    public void browsing(){
        System.out.println("Smart TV is browsing.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println("\nUsing TV Object...");
        // Testing object of 'class TV'
        TV test1 = new TV();
        test1.switchON();
        test1.changeChanel();
        System.out.println("\nUsing SmartTV Object...");
        // Testing object of 'class SmartTV'
        SmartTV t2 = new SmartTV();
        t2.switchON();
        t2.changeChanel();
        t2.browsing();

        System.out.println("\nUsing Dynamic method dispatch object...");
        // Dyanamic Method Dispatch
        // Super class referance can have object of sub class.
        TV t3 = new SmartTV(); // Referance of 'class TV' and object is of 'class SmartTV'
        t3.switchON();
        t3.changeChanel();
        // t3.browsing(); Not working because object is created of 'class SmartTV' but referance is of 'class TV'
    }   
}
    