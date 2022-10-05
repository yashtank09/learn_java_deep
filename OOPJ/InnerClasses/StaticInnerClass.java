package InnerClasses;

class OuterStatic{
    // Here non static datamember will not reflect in static inner class
    int x = 10;
    static int y = 20;

    static class MyStatic{
        public void shwo(){
            // System.out.println(x); // Error: Cannot make a static reference to the non-static field x
            System.out.println(y);
            // We can only access static data members of an outer class in static inner class
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        // We can create object of Inner class without creating an object of outer class
        OuterStatic.MyStatic out = new OuterStatic.MyStatic();
        out.shwo();
    }
}