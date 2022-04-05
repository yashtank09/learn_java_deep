package OOPJ;

class ModifiersWithMethods{

    String ModifiersWithMethods(){
        String a = "This is Constructor of Super Class Constructor \n";
        return a;
    }
    
    // Public method that can be use everywhere 
    public int One(){
        return 5000;
    }

    // Private method that can be use in same class only we can not use it in other class or outof the package
    private int Two(){
        return 10000;
    }

    // Protected method can user everywhere except outof the package
    protected int Three(){
        return 15000;
    }
}

// Also We are testing it with Interiting the the ModifiersWithMethods class by useing `extends` keyword
class DemoIN extends ModifiersWithMethods{
    DemoIN(){
        System.out.println("This is sub Class call the Public method... "+One()+"\n");
        // System.out.println("This is sub class call the Private method..."+two()+"\n"); Error: The method two() is undefined for the type DemoIN
        System.out.println("This is sub Class call the Public method... "+Three()+"\n");
    }
}

public class MethodswithAccessModifierAndInheritances {
    public static void main(String[] args) {
        DemoIN Mobj = new DemoIN();


        // DemoIN is chiled class that inherit all methods of ModifiersWithMethods
        System.out.println("This is Object of PUBLIC method of Other class: \t" + Mobj.One());
        /*
        
            ERROR: The method Two() from the type ModifiersWithMethods is not visible
                |
            System.out.println("This is Object of PUBLIC method of Other class: \t" + Mobj.Two());

        */
        System.out.println("This is Object of PROTECTED method of Other class: \t" + Mobj.Three());
        

    }
}