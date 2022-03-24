/* 
 *  access modifiers & static methods/Variables 
 *      PUBLIC, PRIVATE, PROTECTED.
 *  This example is for knowing access blocks of variable, class, and methods
 */
class accessModifiers{
    private String privateId = "Private Variable";
    public String publicId = "Public Variable";
    protected String protectedID = "Protected Variable";
    void setVar(){
        String SetVar = "Method Variable";
    }
    void displayVar(){
        System.out.println("This is --: " + privateId + "of accessModifiers Class.");
        System.out.println("This is --: " + publicId + "of accessModifiers Class.");
        System.out.println("This is --: " + protectedID + "of accessModifiers Class.");
        /* 
            One method's variable is not accessible in other method
            System.out.println("This is --: " + SetVar + "."); 
            if we want to:
            
        */
    }
}
class testModifiers{
    void displayVar(){
        
    }
}
public class classobj3 {
    public static void main(String[] args) {
        accessModifiers a = new accessModifiers();
        a.displayVar(); 
        System.out.println("\n-- Main Method --");
        System.out.println("\nThis is --: " + a.protectedID + "of main method.");
        System.out.println("This is --: " + a.publicId + "of main method.");
        // System.out.println("This is --: " + a.privateId + "."); This is 
    }
}
