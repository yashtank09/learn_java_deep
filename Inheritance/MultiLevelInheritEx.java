/* 	
    Multi Level Inheritance

    class A {
    
    }
    
    class B extends A {
    
    }
    
    class C extends B {
    
    }
 */
package Inheritance;

class Car{

    public void Vihecle(){
        System.out.println("Class Car");
    }

}

class Company extends Car{
    
    public void VolksVegon(){
        System.out.println("Company: Volks Vagon");
    }

}

class Feature extends Company{
    
    public void Maxspeed(){
        System.out.println("Max Speed: 250kmph");
    }

    public void StearingWheel(){
        System.out.println("Stearing: Power Stearing");
    }
    
    public void Interior(){
        System.out.println("Interiour Type: Lether");
    }
}

class FuleType extends Feature{

    public void petrol(){
        System.out.println("Fule Type: Petrol");
    }

    public void desel(){
        System.out.println("Fule Type: Petrol");
    }

}

public class MultiLevelInheritEx {
    public static void main(String[] args) {
        FuleType f = new FuleType();
        f.VolksVegon();
        f.Maxspeed();
        f.Vihecle();
        f.petrol();        
    }    
}
