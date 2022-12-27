package JavaLangPackage;
/**
    Enum Example 1:    
        The Enum in Java is a data type which contains a fixed set of constants.
            
        Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change). The Java enum constants are static and final implicitly. It is available since JDK 1.5.
        Enums are used to create our own data type like classes.
        
        WebContent: https://www.javatpoint.com/enum-in-java#:~:text=Java%20Enums%20can%20be%20thought,own%20data%20type%20like%20classes.
            
        Constructor of enum type is private. If you don't declare private compiler internally creates private constructor.
 * 
 */

// Created `enum` outside the class using 'enum' keyword
enum flavour{
    VENILLA, BUTTERSCHOTCHE, MENGO;
}
public class enumExample {
    // Another `enum` created inside/within class
    public enum levels{
        LOW, MEDIUM, HIGH, DIFICULT;
    }

    // Another `enum` created inside/within class
    public enum NumbericVal{
        LOW(10), MEDIUM(20), HIGH(30), DIFICULT(40);
        private int value;
        private NumbericVal(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        
        // Print the enum
        System.out.println(flavour.MENGO);
        System.out.println(flavour.VENILLA);
        System.out.println(flavour.BUTTERSCHOTCHE);

        System.out.println();

        // Find INDEX of every enums
        System.out.println("INDEx is: "+flavour.BUTTERSCHOTCHE.ordinal());
        System.out.println("INDEx is: "+flavour.MENGO.ordinal());
        System.out.println("INDEx is: "+flavour.VENILLA.ordinal());

        levels l = levels.MEDIUM;

        System.out.println();
        System.out.println("This is Iterated enum strings...");
        // Iterating the enum by storing them into that same enum type
        for(levels s: levels.values()){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("This is enum with Numeric values...");
        // Iterating the enum objects with Numberic values
        for(NumbericVal s: NumbericVal.values()){
            System.out.println(s + " " + s.value);
        }
        
        // This how we get the instance of enum
        flavour shake = flavour.VENILLA;

        // here it will prints value related to given constunt to the instance
        System.out.println(shake.name());
        System.out.println(shake.ordinal());

        System.out.println();
        System.out.println("This is levels enum with Switch-Case...");
        switch(l){
            case LOW:
                System.out.println("This is lover level...");
                break;
            case MEDIUM:
                System.out.println("This is medium level...");
                break;
            case HIGH:
                System.out.println("This is high level...");
                break;
            case DIFICULT:
                System.out.println("This is difficult level...");
        }

    }
    
}